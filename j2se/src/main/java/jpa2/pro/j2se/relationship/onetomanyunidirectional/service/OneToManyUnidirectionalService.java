package jpa2.pro.j2se.relationship.onetomanyunidirectional.service;

import jpa2.pro.j2se.relationship.onetomanyunidirectional.model.OneToManyUnidirectionalEmployee;
import jpa2.pro.j2se.relationship.onetomanyunidirectional.model.OneToManyUnidirectionalPhone;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collection;

public class OneToManyUnidirectionalService {
    protected EntityManager em;

    public OneToManyUnidirectionalService(EntityManager em) {
        this.em = em;
    }

    public OneToManyUnidirectionalEmployee createEmployee(String name, long salary) {
        OneToManyUnidirectionalEmployee emp = new OneToManyUnidirectionalEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public OneToManyUnidirectionalPhone createPhone(String type, String num){
        OneToManyUnidirectionalPhone phone = new OneToManyUnidirectionalPhone();
        phone.setNum(num);
        phone.setType(type);
        em.persist(phone);
        return phone;
    }

    public OneToManyUnidirectionalEmployee addEmployeePhone(int empId, int phoneId) {
        OneToManyUnidirectionalPhone phone = em.find(OneToManyUnidirectionalPhone.class, phoneId);
        OneToManyUnidirectionalEmployee emp = em.find(OneToManyUnidirectionalEmployee.class, empId);
        emp.addPhone(phone);
        return emp;
    }

    public Collection<OneToManyUnidirectionalEmployee> getAllEmployees() {
        Query query = em.createQuery("select e from OneToManyUnidirectionalEmployee e");
        return (Collection<OneToManyUnidirectionalEmployee>) query.getResultList();
    }
}
