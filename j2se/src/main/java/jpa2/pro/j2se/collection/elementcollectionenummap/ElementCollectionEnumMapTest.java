package jpa2.pro.j2se.collection.elementcollectionenummap;

import jpa2.pro.j2se.collection.elementcollectionenummap.model.PhoneType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ElementCollectionEnumMapTest {
    public static void main(String[] args){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        ElementCollectionEnumMapService es = new ElementCollectionEnumMapService(em);

        em.getTransaction().begin();
        es.createDepartment("IT");
        es.createDepartment("Finance");
        em.getTransaction().commit();

        em.getTransaction().begin();
        es.addEmployee("Tasche", 10);
        es.addEmployee("Tatze", 20);
        em.getTransaction().commit();

        em.getTransaction().begin();
        es.updateEmpDepartment(1, 1);
        es.updateEmpDepartment(2, 2);
        em.getTransaction().commit();

        em.getTransaction().begin();
        es.removePhoneNumber(2, PhoneType.Home);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
