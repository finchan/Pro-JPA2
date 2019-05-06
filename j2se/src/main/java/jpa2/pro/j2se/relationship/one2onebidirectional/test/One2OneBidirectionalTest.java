package jpa2.pro.j2se.relationship.one2onebidirectional.test;

import jpa2.pro.j2se.relationship.one2onebidirectional.model.One2OneBidirectionalEmployee;
import jpa2.pro.j2se.relationship.one2onebidirectional.model.One2OneBidirectionalParkingSpace;
import jpa2.pro.j2se.relationship.one2onebidirectional.service.One2OneBidirectionalService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class One2OneBidirectionalTest {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        One2OneBidirectionalService os = new One2OneBidirectionalService(em);
        em.getTransaction().begin();
        //1. Create ParkingSpace
        One2OneBidirectionalParkingSpace parkingSpace =
                os.createParkingSpace(1000, "Dalian");
        //2. Create Employee
        One2OneBidirectionalEmployee emp = os.createOneToOneBidirectionalEmployee("Tasche", 100000, 2);
        //3. Get a ParkingSpace
        One2OneBidirectionalParkingSpace parking = os.findOneToOneBidirectionalParkingSpace(1);
        em.getTransaction().commit();
        System.out.println(parking);
    }
}
