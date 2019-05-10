package jpa2.pro.j2se.relationship.sharingembeddedobjects.test;

import jpa2.pro.j2se.relationship.sharingembeddedobjects.service.SharingEmbeddedObjectsService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SharingEmbeddedObjectsTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        SharingEmbeddedObjectsService os = new SharingEmbeddedObjectsService(em);
        em.getTransaction().begin();
        os.createCompany("Dalian", "Liaoning", "DLDZ", "116600",1);
        os.createEmployee("Dalian", "LiaoNing", "DLDZ", "116600", 1, "Tasche", 10000);
        em.getTransaction().commit();
    }
}
