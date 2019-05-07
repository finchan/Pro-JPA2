package jpa2.pro.j2se.relationship.onetoonepkmapping.service;

import jpa2.pro.j2se.relationship.onetoonepkmapping.model.OneToOnePKMappingEmployee;
import jpa2.pro.j2se.relationship.onetoonepkmapping.model.OneToOnePKMappingParkingSpace;

import javax.persistence.EntityManager;

public class OneToOnePKMappingService {
    protected EntityManager em;

    public OneToOnePKMappingService(EntityManager em) {
        this.em = em;
    }

    public OneToOnePKMappingEmployee createEmployee(int id, String name, long salary){
        OneToOnePKMappingEmployee emp = new OneToOnePKMappingEmployee();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public OneToOnePKMappingParkingSpace createParkingSpace(OneToOnePKMappingEmployee employee, int lot, String location) {
        OneToOnePKMappingParkingSpace parkingSpace = new OneToOnePKMappingParkingSpace();
        parkingSpace.setId(employee.getId());
        parkingSpace.setLocation(location);
        parkingSpace.setLot(lot);
        employee.setParkingSpace(parkingSpace);
        parkingSpace.setEmployee(employee);
        em.persist(parkingSpace);
        return parkingSpace;
    }
}
