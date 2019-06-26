package jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade;

import jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade.model.RemovingWithRelationshipsCascadeEmployee;
import jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade.model.RemovingWithRelationshipsCascadeParkingSpace;
import jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade.model.RemovingWithRelationshipsCascadePhone;

import javax.persistence.EntityManager;

public class Service {
    private EntityManager em;

    public Service(EntityManager em) {
        this.em = em;
    }

    public void addEmployee() {
        RemovingWithRelationshipsCascadeEmployee emp = new RemovingWithRelationshipsCascadeEmployee();
        RemovingWithRelationshipsCascadeParkingSpace parkingSpace = new RemovingWithRelationshipsCascadeParkingSpace();
        RemovingWithRelationshipsCascadePhone phone = new RemovingWithRelationshipsCascadePhone();
        parkingSpace.setId(1);
        parkingSpace.setLot(0);
        parkingSpace.setLocation("DALIAN");
        phone.setId(1);
        phone.setNumber("111");
        phone.setType("Telecom");
        emp.setId(1);
        emp.setName("Tasche");
        emp.setParkingSpace(parkingSpace);
        emp.getPhones().add(phone);
        em.persist(emp);
    }

    public void removeEmployee(){
        RemovingWithRelationshipsCascadeEmployee emp = em.find(RemovingWithRelationshipsCascadeEmployee.class, 1);
        em.remove(emp);
    }
}
