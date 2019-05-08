package jpa2.pro.j2se.relationship.manytomanybidirectional.service;

import jpa2.pro.j2se.relationship.manytomanybidirectional.model.ManyToManyBidirectionalEmployee;
import jpa2.pro.j2se.relationship.manytomanybidirectional.model.ManyToManyBidirectionalProject;

import javax.persistence.EntityManager;

public class ManyToManyBidirectionalService {
    protected EntityManager em;

    public ManyToManyBidirectionalService(EntityManager em) {
        this.em = em;
    }

    public ManyToManyBidirectionalEmployee createEmployee(String name, long salary){
        ManyToManyBidirectionalEmployee emp = new ManyToManyBidirectionalEmployee();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }

    public ManyToManyBidirectionalProject createProject(String name) {
        ManyToManyBidirectionalProject project = new ManyToManyBidirectionalProject();
        project.setName(name);
        em.persist(project);
        return project;
    }

    public ManyToManyBidirectionalEmployee createEmployeeProject(int empid, int projid) {
        ManyToManyBidirectionalEmployee emp = em.find(ManyToManyBidirectionalEmployee.class, empid);
        ManyToManyBidirectionalProject project = em.find(ManyToManyBidirectionalProject.class, projid);
        project.addEmployee(emp);
        return emp;
    }

}
