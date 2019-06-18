package jpa2.pro.j2se.collection.onetomanyentityattributekey;

import jpa2.pro.j2se.collection.onetomanyentityattributekey.model.OneToManyEntityAttributeKeyDepartment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        Service s = new Service(em);
//        em.getTransaction().begin();
//        s.createDepartment("IT");
//        s.createDepartment("Finance");
//        em.getTransaction().commit();
//
//        em.getTransaction().begin();
//        s.createEmployee("Tasche", 1);
//        s.createEmployee("Tatze", 2);
//        em.getTransaction().commit();
//
        em.getTransaction().begin();
        s.updateEmployeeDepartment(2,2);
        em.getTransaction().commit();

        List<OneToManyEntityAttributeKeyDepartment> list = s.findAllDepartments();
        System.out.println(list.size());
        em.close();
        emf.close();
    }
}