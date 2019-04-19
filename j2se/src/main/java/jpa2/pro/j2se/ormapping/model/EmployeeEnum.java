package jpa2.pro.j2se.ormapping.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class EmployeeEnum {
    @Id private int id;
    private String name;
    private long salary;
    private EmployeeType type;
    @Enumerated(EnumType.STRING)
    private EmployeeType previousType;
    private Date dob;
    @Temporal(TemporalType.TIME)
    @Column(name="S_DATE")
    private java.util.Date startDate;

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

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public EmployeeType getPreviousType() {
        return previousType;
    }

    public void setPreviousType(EmployeeType type) {
        this.type = type;
        this.previousType = type;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public java.util.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    public String toString(){
        return "id: " + this.getId() + ", name: " + this.getName() + ", salary: "
                + this.getSalary() + ", type: " + this.getType().ordinal() + ", Description: " + this.getType().name()
                + ", DOB: " + this.getDob() + ", Start Date: " + this.getStartDate();
    }
}
