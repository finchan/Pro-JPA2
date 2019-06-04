package jpa2.pro.j2se.collection.onetomanymap.service;

import jpa2.pro.j2se.collection.onetomanymap.model.OneToManyDepartment;
import jpa2.pro.j2se.collection.onetomanymap.model.OneToManyEmployee;

import javax.persistence.EntityManager;

public class OneToManyMapService {
    private EntityManager em;

    public OneToManyMapService(EntityManager em) {
        this.em = em;
    }

    public OneToManyEmployee createEmployee(String name, long salary){
        OneToManyEmployee emp = new OneToManyEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public void updateEmployeeDepartment(int empid, int deptid, String cubeId) {
        OneToManyEmployee emp = em.find(OneToManyEmployee.class, empid);
        OneToManyDepartment dept = em.find(OneToManyDepartment.class, deptid);
        dept.addEmployee(cubeId, emp);
    }

    public OneToManyDepartment createDepartment(String name) {
        OneToManyDepartment dept = new OneToManyDepartment();
        dept.setName(name);
        em.persist(dept);
        return dept;
    }
}
