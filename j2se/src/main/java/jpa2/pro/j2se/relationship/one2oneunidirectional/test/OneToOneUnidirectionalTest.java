package jpa2.pro.j2se.relationship.one2oneunidirectional.test;

import jpa2.pro.j2se.relationship.one2oneunidirectional.model.OneToOneUnidirectionalParkingSpace;
import jpa2.pro.j2se.relationship.one2oneunidirectional.service.OneToOneUnidirectionalService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        OneToOneUnidirectionalService os = new OneToOneUnidirectionalService(em);
        em.getTransaction().begin();
        //1. Create ParkingSpace
        OneToOneUnidirectionalParkingSpace parkingSpace =
                os.createParkingSpace(1000, "Dalian");
        //2. Create Employee
        os.createOneToOneUnidirectionalEmployee("Xavier", 100000, parkingSpace);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
