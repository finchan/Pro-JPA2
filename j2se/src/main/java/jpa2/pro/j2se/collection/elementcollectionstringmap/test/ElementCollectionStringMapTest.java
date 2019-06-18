package jpa2.pro.j2se.collection.elementcollectionstringmap.test;

import jpa2.pro.j2se.collection.elementcollectionstringmap.model.ElementCollectionStringMapEmployee;
import jpa2.pro.j2se.collection.elementcollectionstringmap.service.ElementCollectionStringService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ElementCollectionStringMapTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        ElementCollectionStringService es = new ElementCollectionStringService(em);
//        em.getTransaction().begin();
//        es.createDepartment("IT");
//        es.createDepartment("Finance");
//        em.getTransaction().commit();
//
//        em.getTransaction().begin();
//        ElementCollectionStringMapEmployee employee1 = es.createEmployee("Tasche", 10000);
//        ElementCollectionStringMapEmployee employee2 = es.createEmployee("Tee", 10000);
//        ElementCollectionStringMapEmployee employee3 = es.createEmployee("Tatze", 10000);
//        ElementCollectionStringMapEmployee employee4 = es.createEmployee("Tissue", 10000);
//        em.getTransaction().commit();

        em.getTransaction().begin();
//        es.updateEmployeeDepartment(1,1);
//        es.updateEmployeeDepartment(2,1);
//        es.updateEmployeeDepartment(3,2);
//        es.updateEmployeeDepartment(4,2);
        es.updateEmployeeDepartment(1,2);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
