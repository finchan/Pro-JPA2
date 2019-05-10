package jpa2.pro.j2se.relationship.embeddedobjects.service;

import jpa2.pro.j2se.relationship.embeddedobjects.model.EmbeddedObjectsAddress;
import jpa2.pro.j2se.relationship.embeddedobjects.model.EmbeddedObjectsEmployee;

import javax.persistence.EntityManager;

public class EmbeddedObjectsService {
    protected EntityManager em;

    public EmbeddedObjectsService(EntityManager em) {
        this.em = em;
    }

    public EmbeddedObjectsEmployee createEmployee(int id, String name, long salary, String city, String state, String street, String postcode){
        EmbeddedObjectsEmployee emp = new EmbeddedObjectsEmployee();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        EmbeddedObjectsAddress addr = new EmbeddedObjectsAddress();
        addr.setCity(city);
        addr.setState(state);
        addr.setStreet(street);
        addr.setZipCode(postcode);
        emp.setAddress(addr);
        em.persist(emp);
        return emp;
    }
}
