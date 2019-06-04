package jpa2.pro.j2se.collection.onetomanymap;

import jpa2.pro.j2se.collection.onetomanymap.service.OneToManyMapService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyMapTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        OneToManyMapService os = new OneToManyMapService(em);

//        em.getTransaction().begin();
//        os.createDepartment("IT");
//        os.createDepartment("Finance");
//        em.getTransaction().commit();
//
//        em.getTransaction().begin();
//        os.createEmployee("Tasche", 100);
//        os.createEmployee("Tatze", 200);
//        em.getTransaction().commit();

        em.getTransaction().begin();
        os.updateEmployeeDepartment(1,1,"Slot-1");
        os.updateEmployeeDepartment(2,2, "Slot-2");
        em.getTransaction().commit();
    }
}
