package jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        Service s = new Service(em);
        em.getTransaction().begin();
//        s.addEmployee();
        s.removeEmployee();
        em.getTransaction().commit();
    }
}
