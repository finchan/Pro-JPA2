package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.EmployeeIDTableGen;

import javax.persistence.EntityManager;

public class EmployeeIDTableGenService {
    protected EntityManager em;

    public EmployeeIDTableGenService(EntityManager em) {
        this.em = em;
    }

    public EmployeeIDTableGen getEmployee(int id) {
        return em.find(EmployeeIDTableGen.class, id);
    }

    public EmployeeIDTableGen addEmployee(String name) {
        EmployeeIDTableGen emp = new EmployeeIDTableGen();
        emp.setName(name);
        em.persist(emp);
        return emp;
    }
}
