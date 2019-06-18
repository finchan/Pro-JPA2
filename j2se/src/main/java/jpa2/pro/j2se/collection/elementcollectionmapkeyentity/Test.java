package jpa2.pro.j2se.collection.elementcollectionmapkeyentity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        Service s = new Service(em);

        em.getTransaction().begin();
        s.createDept("IT");
        s.createDept("Finance");
        em.getTransaction().commit();

        em.getTransaction().begin();
        s.createEmployee("Tasche", 1);
        s.createEmployee("Tatze", 2);
        em.getTransaction().commit();

        em.getTransaction().begin();
        s.updateEmployeeSeriority(1, 1, 1);
        s.updateEmployeeSeriority(2, 2, 2);
        s.updateEmployeeSeriority(1, 2, 3);
        s.updateEmployeeSeriority(2, 1, 4);
        em.getTransaction().commit();
    }
}
