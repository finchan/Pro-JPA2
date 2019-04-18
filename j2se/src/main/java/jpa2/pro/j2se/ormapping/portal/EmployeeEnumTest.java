package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.EmployeeEnum;
import jpa2.pro.j2se.ormapping.model.EmployeeType;
import jpa2.pro.j2se.ormapping.service.EmployeeEnumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeEnumTest {
    private final static Logger logger = LoggerFactory.getLogger(EmployeeEnumTest.class);
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        EmployeeEnumService es = new EmployeeEnumService(em);
        em.getTransaction().begin();
        es.addEmployee(2, "Javier", 200000, EmployeeType.PART_TIME_EMPLOYEE);
        em.getTransaction().commit();
        EmployeeEnum emp = es.getEmployee(2);
        logger.debug(emp.toString());
    }
}
