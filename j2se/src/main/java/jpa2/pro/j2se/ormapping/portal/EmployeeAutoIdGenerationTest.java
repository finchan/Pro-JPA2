package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.EmployeeAutoIdGeneration;
import jpa2.pro.j2se.ormapping.service.EmployeeAutoIdGenerationService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeAutoIdGenerationTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();

        EmployeeAutoIdGenerationService es = new EmployeeAutoIdGenerationService(em);
        em.getTransaction().begin();
        es.addEmployee("Xavier", 100000);
        em.getTransaction().commit();
    }
}
