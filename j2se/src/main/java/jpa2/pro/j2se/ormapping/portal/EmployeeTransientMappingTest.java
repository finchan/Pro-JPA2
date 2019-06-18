package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.EmployeeTransientMapping;
import jpa2.pro.j2se.ormapping.service.EmployeeTransientMappingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTransientMappingTest {
    private final static Logger logger = LoggerFactory.getLogger(EmployeeTransientMappingTest.class);
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        EmployeeTransientMappingService es = new EmployeeTransientMappingService(em);
        em.getTransaction().begin();
        es.addEmployee(1, "Xavier", 100000);
        em.getTransaction().commit();

        EmployeeTransientMapping emp = es.getEmployee(1);
        logger.debug(emp.toString());
        em.close();
        emf.close();
    }
}
