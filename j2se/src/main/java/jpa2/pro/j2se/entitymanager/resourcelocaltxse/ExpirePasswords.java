package jpa2.pro.j2se.entitymanager.resourcelocaltxse;

import jpa2.pro.j2se.entitymanager.resourcelocaltxse.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class ExpirePasswords {
    public static void main(String [] args) {
        int maxAge = 18;
        String defaultPassword = "password";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");

        try{
            EntityManager em = emf.createEntityManager();
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.YEAR, -maxAge);

            em.getTransaction().begin();
            Collection expired =
                    em.createQuery("SELECT u FROM User u WHERE u.lastChange <= ?1")
                    .setParameter(1, cal)
                    .getResultList();
            for(Iterator i = expired.iterator(); i.hasNext();) {
                User u = (User)i.next();
                System.out.println("Expiring password for " + u.getName());
                u.setPassword(defaultPassword);
            }
            em.getTransaction().commit();
            em.close();
        } finally {
            emf.close();
        }
    }
}
