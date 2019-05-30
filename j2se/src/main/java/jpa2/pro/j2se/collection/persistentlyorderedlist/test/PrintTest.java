package jpa2.pro.j2se.collection.persistentlyorderedlist.test;

import jpa2.pro.j2se.collection.persistentlyorderedlist.service.PrintService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PrintTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        PrintService service = new PrintService(em);
//        em.getTransaction().begin();
//        service.createPrintQueue("Tasche");
//        em.getTransaction().commit();
//        em.getTransaction().begin();
//        service.createPrintJob(3, "Tasche");
//        em.getTransaction().commit();

        em.getTransaction().begin();
        service.removePrintJob(1, "Tasche");
        em.getTransaction().commit();
    }
}
