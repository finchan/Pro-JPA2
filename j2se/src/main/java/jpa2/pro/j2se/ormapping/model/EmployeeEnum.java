package jpa2.pro.j2se.ormapping.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class EmployeeEnum {
    @Id private int id;
    private String name;
    private long salary;
    private EmployeeType type;
    @Enumerated(EnumType.STRING)
    private EmployeeType previousType;

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

    public String toString(){
        return "id: " + this.getId() + ", name: " + this.getName() + ", salary: "
                + this.getSalary() + ", type: " + this.getType().ordinal() + ", Description: " + this.getType().name();
    }
}
