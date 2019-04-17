package jpa2.pro.j2se.ormapping.service;


import jpa2.pro.j2se.ormapping.model.Employee02PropertyAccess;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collection;

public class Employee02PropertyAccessService {
    protected EntityManager em;
    public Employee02PropertyAccessService(EntityManager em) {
        this.em = em;
    }

    public Employee02PropertyAccess createEmployee(int id, String name, long salary) {
        Employee02PropertyAccess emp = new Employee02PropertyAccess();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public void removeEmployee(int id) {
        Employee02PropertyAccess emp = findEmployee(id);
        if (emp != null) {
            em.remove(emp);
        }
    }

    public Employee02PropertyAccess raiseEmployeeSalary(int id, long raise) {
        Employee02PropertyAccess emp = em.find(Employee02PropertyAccess.class, id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() + raise);
        }
        return emp;
    }

    public Employee02PropertyAccess findEmployee(int id) {
        return em.find(Employee02PropertyAccess.class, id);
    }

    public Collection<Employee02PropertyAccess> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee02PropertyAccess e");
        return (Collection<Employee02PropertyAccess>) query.getResultList();
    }
}
