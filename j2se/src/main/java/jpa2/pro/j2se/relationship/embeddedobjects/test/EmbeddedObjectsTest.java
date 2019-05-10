package jpa2.pro.j2se.relationship.embeddedobjects.test;

import jpa2.pro.j2se.relationship.embeddedobjects.model.EmbeddedObjectsEmployee;
import jpa2.pro.j2se.relationship.embeddedobjects.service.EmbeddedObjectsService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmbeddedObjectsTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        EmbeddedObjectsService os = new EmbeddedObjectsService(em);
        //1. Add Employee w/ Address
        em.getTransaction().begin();
        EmbeddedObjectsEmployee emp = os.createEmployee(1, "Tasche", 100000, "Dalian", "Liaoning", "DLDZ", "116600");
        System.out.println(emp);
        em.getTransaction().commit();
        System.out.println(emp);

        //2. Update Employee Address zipcode
        em.getTransaction().begin();
        EmbeddedObjectsEmployee emp2 = em.find(EmbeddedObjectsEmployee.class, 1);
        emp2.getAddress().setZipCode("116023");
        System.out.println(emp2);
        em.getTransaction().commit();
        System.out.println(emp2);

        //3. Delete Employee
        em.getTransaction().begin();
        EmbeddedObjectsEmployee emp3 = em.find(EmbeddedObjectsEmployee.class, 1);
        em.remove(emp3);
        em.getTransaction().commit();
    }
}
