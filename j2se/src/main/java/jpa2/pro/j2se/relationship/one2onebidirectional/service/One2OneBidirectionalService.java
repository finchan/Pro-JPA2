package jpa2.pro.j2se.relationship.one2onebidirectional.service;

import jpa2.pro.j2se.relationship.one2onebidirectional.model.One2OneBidirectionalEmployee;
import jpa2.pro.j2se.relationship.one2onebidirectional.model.One2OneBidirectionalParkingSpace;

import javax.persistence.EntityManager;

public class One2OneBidirectionalService {
    protected EntityManager em;

    public One2OneBidirectionalService(EntityManager em) {
        this.em = em;
    }

    public One2OneBidirectionalParkingSpace createParkingSpace(int lot, String location) {
        One2OneBidirectionalParkingSpace ps = new One2OneBidirectionalParkingSpace();
        ps.setLocation(location);
        ps.setLot(lot);
        em.persist(ps);
        return ps;
    }

    public One2OneBidirectionalParkingSpace findOneToOneBidirectionalParkingSpace(int id) {
        return em.find(One2OneBidirectionalParkingSpace.class, id);
    }

    public One2OneBidirectionalEmployee createOneToOneBidirectionalEmployee(String name, long salary, int parkingSpaceId) {
        One2OneBidirectionalEmployee emp = new One2OneBidirectionalEmployee();
        One2OneBidirectionalParkingSpace parkingSpace = em.find(One2OneBidirectionalParkingSpace.class, parkingSpaceId);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setParkingSpace(parkingSpace);
        em.persist(emp);
        return emp;
    }
}
