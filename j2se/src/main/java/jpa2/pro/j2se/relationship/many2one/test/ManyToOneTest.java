package jpa2.pro.j2se.relationship.many2one.test;

import jpa2.pro.j2se.relationship.many2one.model.Many2OneDepartment;
import jpa2.pro.j2se.relationship.many2one.model.Many2OneEmployee;
import jpa2.pro.j2se.relationship.many2one.service.ManyToOneService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        ManyToOneService ms = new ManyToOneService(em);

        //  create and persist an employee
        em.getTransaction().begin();
//        Many2OneEmployee emp = ms.addEmployee("Tasche", 100000, "IT");
//        Many2OneEmployee emp = ms.createEmployee("Tatze", 100000, 2);
        Many2OneEmployee emp = ms.addDeptAndEmployee("Hugo", 100000, "Auto");
        em.getTransaction().commit();

        System.out.println(emp.toString());
        em.close();
        emf.close();
    }
}
