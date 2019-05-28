package jpa2.pro.j2se.collection.list1tomany.service;

import jpa2.pro.j2se.collection.list1tomany.model.ListOneToManyDepartment;
import jpa2.pro.j2se.collection.list1tomany.model.ListOneToManyEmployee;

import javax.persistence.EntityManager;

public class ListOneToManyService {
    private EntityManager em;

    public ListOneToManyService(EntityManager em) {
        this.em = em;
    }

    public ListOneToManyDepartment createDepartment(String name){
        ListOneToManyDepartment dept = new ListOneToManyDepartment();
        dept.setName(name);
        em.persist(dept);
        return dept;
    }

    public ListOneToManyDepartment addDeptEmployee(int deptid, String name, long salary) {
        ListOneToManyDepartment dept = em.find(ListOneToManyDepartment.class, deptid);
        ListOneToManyEmployee emp = new ListOneToManyEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        dept.addEmployees(emp);
        return dept;
    }

    public ListOneToManyEmployee createEmployee(String name, long salary) {
        ListOneToManyEmployee emp = new ListOneToManyEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public ListOneToManyEmployee updateEmployeeDept(int empid, int deptid) {
        ListOneToManyDepartment dept = em.find(ListOneToManyDepartment.class, deptid);
        ListOneToManyEmployee emp = em.find(ListOneToManyEmployee.class, empid);
        dept.addEmployees(emp);
        return emp;
    }
}
