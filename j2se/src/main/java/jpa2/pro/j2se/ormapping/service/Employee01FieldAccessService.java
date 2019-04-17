package jpa2.pro.j2se.ormapping.service;

import jpa2.pro.j2se.ormapping.model.Employee01FieldAccess;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collection;

public class Employee01FieldAccessService {
    protected EntityManager em;
    public Employee01FieldAccessService(EntityManager em) {
        this.em = em;
    }

    public Employee01FieldAccess createEmployee(int id, String name, long salary) {
        Employee01FieldAccess emp = new Employee01FieldAccess(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public void removeEmployee(int id) {
        Employee01FieldAccess emp = findEmployee(id);
        if (emp != null) {
            em.remove(emp);
        }
    }

    public Employee01FieldAccess raiseEmployeeSalary(int id, long raise) {
        Employee01FieldAccess emp = em.find(Employee01FieldAccess.class, id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() + raise);
        }
        return emp;
    }

    public Employee01FieldAccess findEmployee(int id) {
        return em.find(Employee01FieldAccess.class, id);
    }

    public Collection<Employee01FieldAccess> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee01FieldAccess e");
        return (Collection<Employee01FieldAccess>) query.getResultList();
    }
}
