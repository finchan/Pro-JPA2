package jpa2.pro.j2se.ormapping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee02PropertyAccess {
    private int Id;
    private String name;
    private long wage;

    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return wage;
    }

    public void setSalary(long salary) {
        this.wage = salary;
    }
}
