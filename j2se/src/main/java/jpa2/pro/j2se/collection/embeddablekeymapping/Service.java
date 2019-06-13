package jpa2.pro.j2se.collection.embeddablekeymapping;

import jpa2.pro.j2se.collection.embeddablekeymapping.model.EmbeddableKeyMappingDepartment;
import jpa2.pro.j2se.collection.embeddablekeymapping.model.EmbeddableKeyMappingEmployee;

import javax.persistence.EntityManager;

public class Service {
    private EntityManager em;

    public Service(EntityManager em) {
        this.em = em;
    }

    public void createEmployee(String fname, String lname, long salary){
        EmbeddableKeyMappingEmployee emp = new EmbeddableKeyMappingEmployee();
        emp.setFirstName(fname);
        emp.setLastName(lname);
        emp.setSalary(salary);
        em.persist(emp);
    }

    public void createDepartment(String name) {
        EmbeddableKeyMappingDepartment dept = new EmbeddableKeyMappingDepartment();
        dept.setName(name);
        em.persist(dept);
    }

    public void updateEmployeeDepartment(int empid, int deptid) {
        EmbeddableKeyMappingEmployee emp = em.find(EmbeddableKeyMappingEmployee.class, empid);
        EmbeddableKeyMappingDepartment dept = em.find(EmbeddableKeyMappingDepartment.class, deptid);
        dept.addEmployee(emp);
    }
}
