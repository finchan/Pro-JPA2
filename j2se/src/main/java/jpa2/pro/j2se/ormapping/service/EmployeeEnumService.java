package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.EmployeeEnum;
import jpa2.pro.j2se.ormapping.model.EmployeeType;

import javax.persistence.EntityManager;

public class EmployeeEnumService {
    private EntityManager em;

    public EmployeeEnumService(EntityManager em) {
        this.em = em;
    }

    public EmployeeEnum addEmployee(int id, String name, long salary, EmployeeType type) {
        EmployeeEnum emp = new EmployeeEnum();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setType(type);
        emp.setPreviousType(type);
        em.persist(emp);
        return emp;
    }

    public EmployeeEnum getEmployee(int id) {
        return em.find(EmployeeEnum.class, id);
    }


}
