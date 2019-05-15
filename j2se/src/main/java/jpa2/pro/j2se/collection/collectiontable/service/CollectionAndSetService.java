package jpa2.pro.j2se.collection.collectiontable.service;

import jpa2.pro.j2se.collection.collectiontable.model.CollectionAndSetEmployee;
import jpa2.pro.j2se.collection.collectiontable.model.CollectionAndSetEmployeeVacationbookings;

import javax.persistence.EntityManager;
import java.util.Calendar;
import java.util.List;

public class CollectionAndSetService {
    protected EntityManager em;

    public CollectionAndSetService(EntityManager em) {
        this.em = em;
    }

    public CollectionAndSetEmployee createEmployee(String name, long salary){
        CollectionAndSetEmployee emp = new CollectionAndSetEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public CollectionAndSetEmployee updateEmployeeNickname(int id, String nickname) {
        CollectionAndSetEmployee emp = em.find(CollectionAndSetEmployee.class, id);
        emp.getNickNames().add(nickname);
        return emp;
    }

    public CollectionAndSetEmployee updateEmployeeVacation(int id, int days){
        CollectionAndSetEmployee emp = em.find(CollectionAndSetEmployee.class, id);
        CollectionAndSetEmployeeVacationbookings v = new CollectionAndSetEmployeeVacationbookings();
        v.setDaysTaken(days);
        v.setStartDate(Calendar.getInstance());
        emp.getVactionBookings().add(v);
        return emp;
    }

    public CollectionAndSetEmployee removeEmployeeTheFirstVacation(int id) {
        CollectionAndSetEmployee emp = em.find(CollectionAndSetEmployee.class, id);
        List<CollectionAndSetEmployeeVacationbookings> vocations = (List<CollectionAndSetEmployeeVacationbookings>) emp.getVactionBookings();
        vocations.remove(0);
        return emp;
    }

    public CollectionAndSetEmployee updateEmployeeTheFirstVacation(int id, int days) {
        CollectionAndSetEmployee emp = em.find(CollectionAndSetEmployee.class, id);
        List<CollectionAndSetEmployeeVacationbookings> vocations = (List<CollectionAndSetEmployeeVacationbookings>) emp.getVactionBookings();
        vocations.get(0).setDaysTaken(days);
        return emp;
    }
}
