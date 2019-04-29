package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.EmployeeIDTableGen;
import jpa2.pro.j2se.ormapping.service.EmployeeIDTableGenService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeIDTableGenTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        EmployeeIDTableGenService es = new EmployeeIDTableGenService(em);

        em.getTransaction().begin();
        es.addEmployee("Xavier");
        em.getTransaction().commit();

        EmployeeIDTableGen emp = es.getEmployee(10001);
        System.out.println(emp);
    }
}
