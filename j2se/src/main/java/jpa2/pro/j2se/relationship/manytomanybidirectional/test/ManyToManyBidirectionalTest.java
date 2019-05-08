package jpa2.pro.j2se.relationship.manytomanybidirectional.test;

import jpa2.pro.j2se.relationship.manytomanybidirectional.service.ManyToManyBidirectionalService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToManyBidirectionalTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        ManyToManyBidirectionalService ms = new ManyToManyBidirectionalService(em);

        //1. Add Employee
        em.getTransaction().begin();
        ms.createEmployee("Tatze", 10000);
        em.getTransaction().commit();
        //2. Add Project
        em.getTransaction().begin();
        ms.createProject("CRD");
        em.getTransaction().commit();
        //3. Update Employee -> project
        em.getTransaction().begin();
        ms.createEmployeeProject(1, 1);
        em.getTransaction().commit();
    }
}
