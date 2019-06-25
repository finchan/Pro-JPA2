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
        parkingSpace.setLot("LOT-1");
        parkingSpace.setLocation("DALIAN");
    }
}
