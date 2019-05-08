package jpa2.pro.j2se.relationship.onetomanybidirectional.service;

import jpa2.pro.j2se.relationship.onetomanybidirectional.model.OneToManyBidirectionalDepartment;
import jpa2.pro.j2se.relationship.onetomanybidirectional.model.OneToManyBidirectionalEmployee;

import javax.persistence.EntityManager;

public class OneToManyBidirectionalService {
    protected EntityManager em;

    public OneToManyBidirectionalService(EntityManager em) {
        this.em = em;
    }

    public OneToManyBidirectionalDepartment createDepartment(String name) {
        OneToManyBidirectionalDepartment dept = new OneToManyBidirectionalDepartment();
        dept.setName(name);
        em.persist(dept);
        return dept;
    }

    public OneToManyBidirectionalDepartment getDepartment(int id) {
        return em.find(OneToManyBidirectionalDepartment.class, id);
    }

    public OneToManyBidirectionalEmployee createEmployee(String name, long salary) {
        OneToManyBidirectionalEmployee emp = new OneToManyBidirectionalEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public OneToManyBidirectionalEmployee updateEmployee(int empId, int departmentId) {
        OneToManyBidirectionalEmployee emp = em.find(OneToManyBidirectionalEmployee.class, empId);
        OneToManyBidirectionalDepartment dept = em.find(OneToManyBidirectionalDepartment.class, departmentId);
        dept.addEmployee(emp);
        return emp;
    }
}
