package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.Employee03MixedAccess;

import javax.persistence.EntityManager;

public class Employee03MixedAccessService {
    protected EntityManager em;

    public Employee03MixedAccessService(EntityManager em) {
        this.em = em;
    }

    public Employee03MixedAccess getEmployee(int id) {
        return em.find(Employee03MixedAccess.class, id);
    }

    public Employee03MixedAccess addEmployee(int id, String name, String phoneNumber, long wage){
        Employee03MixedAccess  emp = new Employee03MixedAccess(id, phoneNumber, name, wage);
        em.persist(emp);
        return emp;
    }

}
