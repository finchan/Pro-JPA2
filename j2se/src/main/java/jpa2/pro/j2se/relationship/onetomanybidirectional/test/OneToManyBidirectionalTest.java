package jpa2.pro.j2se.relationship.onetomanybidirectional.test;

import jpa2.pro.j2se.relationship.onetomanybidirectional.model.OneToManyBidirectionalDepartment;
import jpa2.pro.j2se.relationship.onetomanybidirectional.model.OneToManyBidirectionalEmployee;
import jpa2.pro.j2se.relationship.onetomanybidirectional.service.OneToManyBidirectionalService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBidirectionalTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        OneToManyBidirectionalService os = new OneToManyBidirectionalService(em);
        em.getTransaction().begin();
        //1. Create Department
        OneToManyBidirectionalDepartment dept = os.createDepartment("IT");
        em.getTransaction().commit();
        em.getTransaction().begin();
        //2. Create Employee
        OneToManyBidirectionalEmployee emp = os.createEmployee("Tasche", 10000);
        em.getTransaction().commit();
        em.getTransaction().begin();
        //3. Update Employee Dept
        os.updateEmployee(emp.getId(), dept.getId());
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
