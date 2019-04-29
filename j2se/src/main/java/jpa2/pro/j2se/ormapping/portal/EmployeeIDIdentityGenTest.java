package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.EmployeeIDIdentityGen;
import jpa2.pro.j2se.ormapping.service.EmployeeIDIdentityGenService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeIDIdentityGenTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        EmployeeIDIdentityGenService es = new EmployeeIDIdentityGenService(em);

        em.getTransaction().begin();
        EmployeeIDIdentityGen emp = es.addEmployee("Xavier");
        System.out.println(emp.getId());
        em.getTransaction().commit();
        System.out.println(emp.getId());
    }
}
