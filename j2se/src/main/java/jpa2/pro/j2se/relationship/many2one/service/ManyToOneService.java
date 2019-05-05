package jpa2.pro.j2se.relationship.many2one.service;

import jpa2.pro.j2se.relationship.many2one.model.Many2OneDepartment;
import jpa2.pro.j2se.relationship.many2one.model.Many2OneEmployee;

import javax.persistence.EntityManager;

public class ManyToOneService {
    protected EntityManager em;

    public ManyToOneService(EntityManager em) {
        this.em = em;
    }

    public Many2OneEmployee addEmployee(String name, long salary, String departmentName) {
        Many2OneEmployee emp = new Many2OneEmployee();
        Many2OneDepartment many2OneDepartment = new Many2OneDepartment();
        many2OneDepartment.setName(departmentName);
        em.persist(many2OneDepartment);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setMany2OneDepartment(many2OneDepartment);
        em.persist(emp);
        return emp;
    }

    public Many2OneEmployee createEmployee(String name, long salary, int dept_id) {
        Many2OneEmployee emp = null;
        Many2OneDepartment dept = em.find(Many2OneDepartment.class, dept_id);
        if(dept != null) {
            emp = new Many2OneEmployee();
            emp.setName(name);
            emp.setSalary(salary);
            emp.setMany2OneDepartment(dept);
            em.persist(emp);
        }
        return emp;
    }

    public Many2OneDepartment createDept(String name) {
        Many2OneDepartment dept = new Many2OneDepartment();
        dept.setName(name);
        em.persist(dept);
        return dept;
    }

    public Many2OneEmployee addDeptAndEmployee(String name, long salary, String dept_name) {
        Many2OneEmployee emp = new Many2OneEmployee();
        Many2OneDepartment many2OneDepartment = createDept(dept_name);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setMany2OneDepartment(many2OneDepartment);
        em.persist(emp);
        return emp;
    }

}
