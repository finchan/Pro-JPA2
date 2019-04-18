package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.EmployeeLobMapping;

import javax.persistence.EntityManager;

public class EmployeeLobMappingService {
    protected EntityManager em;

    public EmployeeLobMappingService(EntityManager em) {
        this.em = em;
    }

    public EmployeeLobMapping getEmployee(int id) {
        return em.find(EmployeeLobMapping.class, id);
    }

    public EmployeeLobMapping addEmployee(int id, String name, long salary, byte[] picture) {
        EmployeeLobMapping emp = new EmployeeLobMapping();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setPicture(picture);
        em.persist(emp);
        return emp;
    }
}
