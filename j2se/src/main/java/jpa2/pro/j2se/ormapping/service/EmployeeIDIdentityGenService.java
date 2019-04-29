package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.EmployeeIDIdentityGen;

import javax.persistence.EntityManager;

public class EmployeeIDIdentityGenService {
    protected EntityManager em;

    public EmployeeIDIdentityGenService(EntityManager em) {
        this.em = em;
    }

    public EmployeeIDIdentityGen addEmployee(String name) {
        EmployeeIDIdentityGen emp = new EmployeeIDIdentityGen();
        emp.setName(name);
        em.persist(emp);
        return emp;
    }
}
