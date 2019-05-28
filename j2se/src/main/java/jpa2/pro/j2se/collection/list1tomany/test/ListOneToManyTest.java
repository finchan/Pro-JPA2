package jpa2.pro.j2se.collection.list1tomany.test;


import jpa2.pro.j2se.collection.list1tomany.service.ListOneToManyService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListOneToManyTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        ListOneToManyService ls = new ListOneToManyService(em);
        em.getTransaction().begin();
//        ls.createDepartment("IT");
//        ls.createEmployee("Tasche", 100);
        ls.updateEmployeeDept(1, 1);
        em.getTransaction().commit();
    }
}
