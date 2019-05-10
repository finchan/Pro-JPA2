package jpa2.pro.j2se.relationship.embeddedobjects.model;

import javax.persistence.*;

@Entity
@Table(name="embeddedobjects_employee")
public class EmbeddedObjectsEmployee {
    @Id
    private int id;
    private String name;
    private long salary;
    @Embedded
    private EmbeddedObjectsAddress address;

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

    public EmbeddedObjectsAddress getAddress() {
        return address;
    }

    public void setAddress(EmbeddedObjectsAddress address) {
        this.address = address;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " salary: " + getSalary() + " address: " + getAddress();
    }
}
