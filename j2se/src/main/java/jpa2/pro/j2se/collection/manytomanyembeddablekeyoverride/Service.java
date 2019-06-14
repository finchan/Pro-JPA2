package jpa2.pro.j2se.collection.manytomanyembeddablekeyoverride;

import jpa2.pro.j2se.collection.manytomanyembeddablekeyoverride.model.ManyToManyEmbeddableKeyOverrideDepartment;
import jpa2.pro.j2se.collection.manytomanyembeddablekeyoverride.model.ManyToManyEmbeddableKeyOverrideEmployee;
import jpa2.pro.j2se.collection.manytomanyembeddablekeyoverride.model.ManyToManyEmbeddableKeyOverrideEmployeeName;

import javax.persistence.EntityManager;

public class Service {
    private EntityManager em;

    public Service(EntityManager em) {
        this.em = em;
    }

    public void createDepartment(String name) {
        ManyToManyEmbeddableKeyOverrideDepartment dept = new ManyToManyEmbeddableKeyOverrideDepartment();
        dept.setName(name);
        em.persist(dept);
    }

    public void createEmployee(String fname, String lname, long salary) {
        ManyToManyEmbeddableKeyOverrideEmployeeName ename = new ManyToManyEmbeddableKeyOverrideEmployeeName();
        ManyToManyEmbeddableKeyOverrideEmployee emp = new ManyToManyEmbeddableKeyOverrideEmployee();
        ename.setfName(fname);
        ename.setlName(lname);
        emp.setEmployeeName(ename);
        emp.setSalary(salary);
        em.persist(emp);
    }

    public void updateEmployeeDeptment(int empid, int deptid) {
        ManyToManyEmbeddableKeyOverrideDepartment dept = em.find(ManyToManyEmbeddableKeyOverrideDepartment.class, deptid);
        ManyToManyEmbeddableKeyOverrideEmployee emp = em.find(ManyToManyEmbeddableKeyOverrideEmployee.class, empid);
        dept.addEmployee(emp);
    }
}
