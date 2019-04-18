package jpa2.pro.j2se.ormapping.model;

import javax.persistence.*;

@Entity
public class EmployeeLobMapping {
    @Id
    private int id;
    private String name;
    private long salary;

    @Basic(fetch=FetchType.LAZY)
    @Lob
    @Column(name="PIC")
    private byte[] picture;

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

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " salary: " + getSalary();
    }

}
