package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.Employee03MixedAccess;
import jpa2.pro.j2se.ormapping.service.Employee03MixedAccessService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Employee03MixedAccessTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();

        Employee03MixedAccessService emas = new Employee03MixedAccessService(em);
        em.getTransaction().begin();
        emas.addEmployee(1, "Xavier", "1234567890", 100000);
        em.getTransaction().commit();

        em.getTransaction().begin();
        emas.addEmployee(2, "Javier", "999", 200000);
        em.getTransaction().commit();

        Employee03MixedAccess emp = emas.getEmployee(2);
        System.out.println(emp);
    }
}
