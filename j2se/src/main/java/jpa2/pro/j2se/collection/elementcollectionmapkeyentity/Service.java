package jpa2.pro.j2se.collection.elementcollectionmapkeyentity;

import jpa2.pro.j2se.collection.elementcollectionmapkeyentity.model.ElementCollectionMapKeyEntityDepartment;
import jpa2.pro.j2se.collection.elementcollectionmapkeyentity.model.ElementCollectionMapKeyEntityEmployee;

import javax.persistence.EntityManager;

public class Service {
    private EntityManager em;

    public Service(EntityManager em) {
        this.em = em;
    }

    public ElementCollectionMapKeyEntityEmployee createEmployee(String name, long salary) {
        ElementCollectionMapKeyEntityEmployee emp = new ElementCollectionMapKeyEntityEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public ElementCollectionMapKeyEntityDepartment createDept(String name) {
        ElementCollectionMapKeyEntityDepartment dept = new ElementCollectionMapKeyEntityDepartment();
        dept.setName(name);
        em.persist(dept);
        return dept;
    }

    public ElementCollectionMapKeyEntityDepartment updateEmployeeSeriority(int deptid, int empid, int serirority) {
        ElementCollectionMapKeyEntityDepartment dept = em.find(ElementCollectionMapKeyEntityDepartment.class, deptid);
        ElementCollectionMapKeyEntityEmployee emp = em.find(ElementCollectionMapKeyEntityEmployee.class, empid);
        dept.setEmployeSeniority(emp, serirority);
        return dept;
    }
}
