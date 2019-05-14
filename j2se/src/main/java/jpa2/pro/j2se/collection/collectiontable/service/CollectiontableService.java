package jpa2.pro.j2se.collection.collectiontable.service;

import jpa2.pro.j2se.collection.collectiontable.model.CollectiontableEmployee;
import jpa2.pro.j2se.collection.collectiontable.model.CollectiontableEmployeeVacationbookings;

import javax.persistence.EntityManager;
import java.util.Calendar;
import java.util.List;

public class CollectiontableService {
    protected EntityManager em;

    public CollectiontableService(EntityManager em) {
        this.em = em;
    }

    public CollectiontableEmployee createEmployee(String name, long salary){
        CollectiontableEmployee emp = new CollectiontableEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public CollectiontableEmployee updateEmployeeNickname(int id, String nickname) {
        CollectiontableEmployee emp = em.find(CollectiontableEmployee.class, id);
        emp.getNickNames().add(nickname);
        return emp;
    }

    public CollectiontableEmployee updateEmployeeVacation(int id, int days){
        CollectiontableEmployee emp = em.find(CollectiontableEmployee.class, id);
        CollectiontableEmployeeVacationbookings v = new CollectiontableEmployeeVacationbookings();
        v.setDaysTaken(days);
        v.setStartDate(Calendar.getInstance());
        emp.getVactionBookings().add(v);
        return emp;
    }

    public CollectiontableEmployee removeEmployeeTheFirstVacation(int id) {
        CollectiontableEmployee emp = em.find(CollectiontableEmployee.class, id);
        List<CollectiontableEmployeeVacationbookings> vocations = (List<CollectiontableEmployeeVacationbookings>) emp.getVactionBookings();
        vocations.remove(0);
        return emp;
    }

    public CollectiontableEmployee updateEmployeeTheFirstVacation(int id, int days) {
        CollectiontableEmployee emp = em.find(CollectiontableEmployee.class, id);
        List<CollectiontableEmployeeVacationbookings> vocations = (List<CollectiontableEmployeeVacationbookings>) emp.getVactionBookings();
        vocations.get(0).setDaysTaken(days);
        return emp;
    }
}
