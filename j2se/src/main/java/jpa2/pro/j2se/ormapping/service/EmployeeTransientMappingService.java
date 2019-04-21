package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.EmployeeTransientMapping;

import javax.persistence.EntityManager;

public class EmployeeTransientMappingService {
    private EntityManager em;

    public EmployeeTransientMappingService(EntityManager em) {
        this.em = em;
    }

    public EmployeeTransientMapping addEmployee(int id, String name, long salary) {
        EmployeeTransientMapping emp = new EmployeeTransientMapping();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public EmployeeTransientMapping getEmployee(int id) {
        return em.find(EmployeeTransientMapping.class, id);
    }
}
