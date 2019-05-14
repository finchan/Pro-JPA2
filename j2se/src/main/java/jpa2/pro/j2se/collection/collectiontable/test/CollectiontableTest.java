package jpa2.pro.j2se.collection.collectiontable.test;

import jpa2.pro.j2se.collection.collectiontable.model.CollectiontableEmployee;
import jpa2.pro.j2se.collection.collectiontable.service.CollectiontableService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CollectiontableTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        CollectiontableService cs = new CollectiontableService(em);

        em.getTransaction().begin();
        CollectiontableEmployee emp = cs.createEmployee("Tasche", 10000);
        em.getTransaction().commit();

        em.getTransaction().begin();
        cs.updateEmployeeNickname(1, "Tatzer");
        em.getTransaction().commit();

        em.getTransaction().begin();
        cs.updateEmployeeVacation(1, 10);
        em.getTransaction().commit();

        em.getTransaction().begin();
        cs.removeEmployeeTheFirstVacation(1);
        em.getTransaction().commit();

        em.getTransaction().begin();
        cs.updateEmployeeTheFirstVacation(1, 5);
        em.getTransaction().commit();
    }
}
