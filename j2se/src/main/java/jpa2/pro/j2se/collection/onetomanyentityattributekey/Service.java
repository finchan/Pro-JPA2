package jpa2.pro.j2se.collection.onetomanyentityattributekey;

import jpa2.pro.j2se.collection.onetomanyentityattributekey.model.OneToManyEntityAttributeKeyDepartment;
import jpa2.pro.j2se.collection.onetomanyentityattributekey.model.OneToManyEntityAttributeKeyEmployee;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class Service {
    private EntityManager em;

    public Service(EntityManager em) {
        this.em = em;
    }

    public OneToManyEntityAttributeKeyDepartment createDepartment(String name) {
        OneToManyEntityAttributeKeyDepartment department = new OneToManyEntityAttributeKeyDepartment();
        department.setName(name);
        em.persist(department);
        return department;
    }

    public OneToManyEntityAttributeKeyEmployee createEmployee(String name, long salary) {
        OneToManyEntityAttributeKeyEmployee employee = new OneToManyEntityAttributeKeyEmployee();
        employee.setName(name);
        employee.setSalary(salary);
        em.persist(employee);
        return employee;
    }

    public void updateEmployeeDepartment(int empid, int deptid) {
        OneToManyEntityAttributeKeyDepartment dept = em.find(OneToManyEntityAttributeKeyDepartment.class, deptid);
        OneToManyEntityAttributeKeyEmployee emp = em.find(OneToManyEntityAttributeKeyEmployee.class, empid);
        dept.addEmployee(emp);
    }

    public List<OneToManyEntityAttributeKeyDepartment> findAllDepartments() {
        TypedQuery query = em.createQuery("SELECT d FROM OneToManyEntityAttributeKeyDepartment d", OneToManyEntityAttributeKeyDepartment.class);
        return query.getResultList();
    }
}
