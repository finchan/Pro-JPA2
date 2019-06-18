package jpa2.pro.j2se.relationship.onetoonepkmapping.test;

import jpa2.pro.j2se.relationship.onetoonepkmapping.model.OneToOnePKMappingEmployee;
import jpa2.pro.j2se.relationship.onetoonepkmapping.model.OneToOnePKMappingParkingSpace;
import jpa2.pro.j2se.relationship.onetoonepkmapping.service.OneToOnePKMappingService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOnePKMappingTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        OneToOnePKMappingService os = new OneToOnePKMappingService(em);
        em.getTransaction().begin();
        OneToOnePKMappingEmployee emp = os.createEmployee(1, "Tasche", 10000);
        OneToOnePKMappingParkingSpace parkingSpace = os.createParkingSpace(emp, 100, "Dalian");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
