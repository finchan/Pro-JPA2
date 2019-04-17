package jpa2.pro.j2se.ormapping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee01FieldAccess {
    @Id
    private int id;
    private String name;
    private long salary;

    public Employee01FieldAccess(int id) {
        this.id = id;
    }

    public Employee01FieldAccess() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() + " salary: " + getSalary();
    }
}
