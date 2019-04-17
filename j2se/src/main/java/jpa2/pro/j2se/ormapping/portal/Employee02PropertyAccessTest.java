package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.Employee02PropertyAccess;
import jpa2.pro.j2se.ormapping.service.Employee02PropertyAccessService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;

public class Employee02PropertyAccessTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        Employee02PropertyAccessService service = new Employee02PropertyAccessService(em);

        //  create and persist an employee
        em.getTransaction().begin();
        Employee02PropertyAccess emp = service.createEmployee(158, "John Doe", 45000);
        em.getTransaction().commit();
        System.out.println("Persisted " + emp);

        // find a specific employee
        emp = service.findEmployee(158);
        System.out.println("Found " + emp);

        // find all employees
        Collection<Employee02PropertyAccess> emps = service.findAllEmployees();
        for (Employee02PropertyAccess e : emps)
            System.out.println("Found Employee02PropertyAccess: " + e);

        // update the employee
        em.getTransaction().begin();
        emp = service.raiseEmployeeSalary(158, 1000);
        em.getTransaction().commit();
        System.out.println("Updated " + emp);

        // remove an employee
        em.getTransaction().begin();
        service.removeEmployee(158);
        em.getTransaction().commit();
        System.out.println("Removed Employee02PropertyAccess 158");

        // close the EM and EMF when done
        em.close();
        emf.close();
    }
}
