package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.EmployeeAutoIdGeneration;

import javax.persistence.EntityManager;

public class EmployeeAutoIdGenerationService {
    private EntityManager em;

    public EmployeeAutoIdGenerationService(EntityManager em) {
        this.em = em;
    }

    public EmployeeAutoIdGeneration addEmployee(String name, long salary) {
        EmployeeAutoIdGeneration emp = new EmployeeAutoIdGeneration();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }
}
