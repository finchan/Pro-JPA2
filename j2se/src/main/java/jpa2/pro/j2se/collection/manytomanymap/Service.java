package jpa2.pro.j2se.collection.manytomanymap;

import jpa2.pro.j2se.collection.manytomanymap.model.ManyToManyMapDepartment;
import jpa2.pro.j2se.collection.manytomanymap.model.ManyToManyMapEmployee;

import javax.persistence.EntityManager;

public class Service {
    private EntityManager em;

    public Service(EntityManager em) {
        this.em = em;
    }

    public void addDepartment(String name){
        ManyToManyMapDepartment dept = new ManyToManyMapDepartment();
        dept.setName(name);
        em.persist(dept);
    }

    public void addEmployee(String name, long salary) {
        ManyToManyMapEmployee emp = new ManyToManyMapEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
    }

    public void updateEmpDepartment(String cubicId, int empid, int deptid) {
        ManyToManyMapDepartment dept = em.find(ManyToManyMapDepartment.class, empid);
        ManyToManyMapEmployee employee = em.find(ManyToManyMapEmployee.class, empid);
        dept.addEmployee(cubicId, employee);
        employee.getDepartments().add(dept);
    }
}
