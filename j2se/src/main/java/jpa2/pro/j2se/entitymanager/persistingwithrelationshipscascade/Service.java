package jpa2.pro.j2se.entitymanager.persistingwithrelationshipscascade;

import jpa2.pro.j2se.entitymanager.persistingwithrelationshipscascade.model.PersistingWithRelationshipsCascadeAddress;
import jpa2.pro.j2se.entitymanager.persistingwithrelationshipscascade.model.PersistingWithRelationshipsCascadeEmployee;

import javax.persistence.EntityManager;

public class Service {
    private EntityManager em;

    public Service(EntityManager em) {
        this.em = em;
    }

    public void addEmployeeWithAddress(String empName){
        PersistingWithRelationshipsCascadeAddress addr = new PersistingWithRelationshipsCascadeAddress();
        addr.setId(1);
        addr.setState("Liaoning");
        addr.setCity("Dalian");
        addr.setStreet("Development Zone");
        addr.setZip("116600");
        PersistingWithRelationshipsCascadeEmployee emp = new PersistingWithRelationshipsCascadeEmployee();
        emp.setId(1);
        emp.setName(empName);
        emp.setAddress(addr);
        em.persist(emp);
    }
}

