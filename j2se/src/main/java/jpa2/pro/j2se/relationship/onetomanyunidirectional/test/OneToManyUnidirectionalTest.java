package jpa2.pro.j2se.relationship.onetomanyunidirectional.test;

import jpa2.pro.j2se.relationship.onetomanyunidirectional.model.OneToManyUnidirectionalEmployee;
import jpa2.pro.j2se.relationship.onetomanyunidirectional.model.OneToManyUnidirectionalPhone;
import jpa2.pro.j2se.relationship.onetomanyunidirectional.service.OneToManyUnidirectionalService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;

public class OneToManyUnidirectionalTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        OneToManyUnidirectionalService us = new OneToManyUnidirectionalService(em);
//        //Create Phones
//        em.getTransaction().begin();
//        us.createPhone("123456","Mobile");
//        us.createPhone("234567", "Unicom");
//        em.getTransaction().commit();
//        //Create Employee
//        em.getTransaction().begin();
//        us.createEmployee("Tasche", 100000);
//        em.getTransaction().commit();
//        //Create Employee Phone
//        em.getTransaction().begin();
//        us.addEmployeePhone(1,1);
//        us.addEmployeePhone(1,2);
//        em.getTransaction().commit();
        //Get All Employees
        Collection<OneToManyUnidirectionalEmployee> emps = us.getAllEmployees();
        for(OneToManyUnidirectionalEmployee emp :emps) {
            for(OneToManyUnidirectionalPhone phone : emp.getPhones()){
                System.out.println(emp.getName()+"\t" + phone.getNum());
            }
        }
    }
}
