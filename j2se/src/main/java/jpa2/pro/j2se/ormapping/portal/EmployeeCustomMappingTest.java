package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.EmployeeCustomColumnMapping;
import jpa2.pro.j2se.ormapping.service.EmployeeCustomColumnMappingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeCustomMappingTest {
    private final static Logger logger = LoggerFactory.getLogger(EmployeeCustomMappingTest.class);

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        EmployeeCustomColumnMappingService ems = new EmployeeCustomColumnMappingService(em);
        ems.addEmployee(1, "Xavier", 100000, "Comments");
        em.getTransaction().commit();

        EmployeeCustomColumnMapping emp = ems.getEmployee(1);
        System.out.println(emp);
        logger.debug(emp.toString());
        em.close();
        emf.close();
    }
}
