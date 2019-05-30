package jpa2.pro.j2se.collection.elementcollectionstringmap.service;

import jpa2.pro.j2se.collection.elementcollectionstringmap.model.ElementCollectionStringMapDepartment;
import jpa2.pro.j2se.collection.elementcollectionstringmap.model.ElementCollectionStringMapEmployee;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.Map;

public class ElementCollectionStringService {
    private EntityManager em;

    public ElementCollectionStringService(EntityManager em) {
        this.em = em;
    }
    public ElementCollectionStringMapEmployee createEmployee(String name, long salary) {
        ElementCollectionStringMapEmployee emp = new ElementCollectionStringMapEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        Map<String, String> phoneMap = new HashMap<String, String>();
        phoneMap.put("home","613-289-3214");
        phoneMap.put("mobile","613-760-2332");
        emp.setPhoneNumbers(phoneMap);
        em.persist(emp);
        return emp;
    }

    public ElementCollectionStringMapEmployee updateEmployeeDepartment(int empId, int deptId) {
        ElementCollectionStringMapEmployee emp = em.find(ElementCollectionStringMapEmployee.class, empId);
        ElementCollectionStringMapDepartment dept = em.find(ElementCollectionStringMapDepartment.class, deptId);
        dept.addEmployee(emp);
        emp.setDepartment(dept);
        return emp;
    }

    public ElementCollectionStringMapDepartment createDepartment(String name){
        ElementCollectionStringMapDepartment dept = new ElementCollectionStringMapDepartment();
        dept.setName(name);
        em.persist(dept);
        return dept;
    }

}
