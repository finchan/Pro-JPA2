package jpa2.pro.j2se.relationship.onetomanybidirectional.model;

import javax.persistence.*;

@Entity
@Table(name="onetomanybidirectional_employee")
public class OneToManyBidirectionalEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    @ManyToOne
    @JoinColumn(name="ONETOMANYBIDIRECTIONAL_DEPARTMENT_ID")
    private OneToManyBidirectionalDepartment department;

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

    public OneToManyBidirectionalDepartment getDepartment() {
        return department;
    }

    public void setDepartment(OneToManyBidirectionalDepartment department) {
        this.department = department;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " with " + getDepartment();
    }
}
