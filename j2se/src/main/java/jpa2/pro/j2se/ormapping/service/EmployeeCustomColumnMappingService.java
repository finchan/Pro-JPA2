package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.EmployeeCustomColumnMapping;

import javax.persistence.EntityManager;

public class EmployeeCustomColumnMappingService {
    protected EntityManager em;

    public EmployeeCustomColumnMappingService(EntityManager em) {
        this.em = em;
    }

    public EmployeeCustomColumnMapping addEmployee(int id, String name, long salary, String comments) {
        EmployeeCustomColumnMapping emp = new EmployeeCustomColumnMapping();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setComments(comments);
        em.persist(emp);
        return emp;
    }

    public EmployeeCustomColumnMapping getEmployee(int id) {
        EmployeeCustomColumnMapping emp = em.find(EmployeeCustomColumnMapping.class, id);
        return emp;
    }
}
