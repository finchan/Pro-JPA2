package jpa2.pro.j2se.collection.onetomanymap.model;

import javax.persistence.*;

@Entity
@Table(name="ONETOMANYMAP_EMPLOYEE")
public class OneToManyEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private OneToManyDepartment department;

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

    public OneToManyDepartment getDepartment() {
        return department;
    }

    public void setDepartment(OneToManyDepartment department) {
        this.department = department;
    }
}
