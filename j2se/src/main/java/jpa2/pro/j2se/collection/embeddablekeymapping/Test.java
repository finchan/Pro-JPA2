package jpa2.pro.j2se.collection.embeddablekeymapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        Service s = new Service(em);

        em.getTransaction().begin();
        s.createDepartment("IT");
        s.createDepartment("Finance");
        em.getTransaction().commit();

        em.getTransaction().begin();
        s.createEmployee("Tasche", "Tin", 1);
        s.createEmployee("Tatze", "Sean", 2);
        em.getTransaction().commit();

        em.getTransaction().begin();
        s.updateEmployeeDepartment(1, 1);
        s.updateEmployeeDepartment(2,1);
        em.getTransaction().commit();
    }
}
