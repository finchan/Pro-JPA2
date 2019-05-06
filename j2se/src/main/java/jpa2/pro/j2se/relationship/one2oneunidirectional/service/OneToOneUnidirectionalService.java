package jpa2.pro.j2se.relationship.one2oneunidirectional.service;

import jpa2.pro.j2se.relationship.one2oneunidirectional.model.OneToOneUnidirectionalEmployee;
import jpa2.pro.j2se.relationship.one2oneunidirectional.model.OneToOneUnidirectionalParkingSpace;

import javax.persistence.EntityManager;

public class OneToOneUnidirectionalService {
    protected EntityManager em;

    public OneToOneUnidirectionalService(EntityManager em) {
        this.em = em;
    }

    public OneToOneUnidirectionalParkingSpace createParkingSpace(int lot, String location) {
        OneToOneUnidirectionalParkingSpace ps = new OneToOneUnidirectionalParkingSpace();
        ps.setLocation(location);
        ps.setLot(lot);
        em.persist(ps);
        return ps;
    }

    public OneToOneUnidirectionalParkingSpace findOneToOneUnidirectionalParkingSpace(int id) {
        return em.find(OneToOneUnidirectionalParkingSpace.class, id);
    }

    public OneToOneUnidirectionalEmployee createOneToOneUnidirectionalEmployee(String name, long salary, OneToOneUnidirectionalParkingSpace parkingSpace) {
        OneToOneUnidirectionalEmployee emp = new OneToOneUnidirectionalEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        emp.setParkingSpace(parkingSpace);
        em.persist(emp);
        return emp;
    }
}
