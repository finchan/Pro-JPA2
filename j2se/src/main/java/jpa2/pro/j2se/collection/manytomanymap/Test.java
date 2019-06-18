package jpa2.pro.j2se.collection.manytomanymap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        Service s = new Service(em);

//        em.getTransaction().begin();
//        s.addDepartment("IT");
//        s.addDepartment("Finance");
//        em.getTransaction().commit();
//
//        em.getTransaction().begin();
//        s.addEmployee("Tasche", 1);
//        s.addEmployee("Tatze", 2);
//        em.getTransaction().commit();

        em.getTransaction().begin();
        s.updateEmpDepartment("Slot-1", 1, 1);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
