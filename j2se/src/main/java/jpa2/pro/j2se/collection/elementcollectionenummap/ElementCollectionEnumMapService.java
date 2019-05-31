package jpa2.pro.j2se.collection.elementcollectionenummap;

import jpa2.pro.j2se.collection.elementcollectionenummap.model.ElementCollectionEnumMapDepartment;
import jpa2.pro.j2se.collection.elementcollectionenummap.model.ElementCollectionEnumMapEmployee;
import jpa2.pro.j2se.collection.elementcollectionenummap.model.PhoneType;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.Map;

public class ElementCollectionEnumMapService {
    private EntityManager em;

    public ElementCollectionEnumMapService(EntityManager em) {
        this.em = em;
    }

    public ElementCollectionEnumMapEmployee addEmployee(String name, long salary){
        ElementCollectionEnumMapEmployee emp = new ElementCollectionEnumMapEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        Map<PhoneType, String> phoneMap = new HashMap<PhoneType, String>();
        phoneMap.put(PhoneType.Home,"613-289-3214");
        phoneMap.put(PhoneType.Mobile,"613-760-2332");
        emp.setPhoneNumbers(phoneMap);
        em.persist(emp);
        return emp;
    }

    public ElementCollectionEnumMapEmployee updateEmpDepartment(int empid, int deptid) {
        ElementCollectionEnumMapEmployee emp = em.find(ElementCollectionEnumMapEmployee.class, empid);
        ElementCollectionEnumMapDepartment dept = em.find(ElementCollectionEnumMapDepartment.class, deptid);
        dept.addEmployee(emp);
        return emp;
    }

    public ElementCollectionEnumMapDepartment createDepartment(String name) {
        ElementCollectionEnumMapDepartment dept = new ElementCollectionEnumMapDepartment();
        dept.setName(name);
        em.persist(dept);
        return dept;
    }

    public void removePhoneNumber(int empid, PhoneType phoneType) {
        ElementCollectionEnumMapEmployee emp = em.find(ElementCollectionEnumMapEmployee.class, empid);
        Map<PhoneType, String> phones = emp.getPhoneNumbers();
        phones.remove(phoneType);
    }
}
