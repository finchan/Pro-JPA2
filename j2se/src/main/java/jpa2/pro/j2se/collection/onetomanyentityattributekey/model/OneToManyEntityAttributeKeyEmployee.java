package jpa2.pro.j2se.collection.onetomanyentityattributekey.model;

import javax.persistence.*;

@Entity
@Table(name="onetomanyentityattributekey_employee")
public class OneToManyEntityAttributeKeyEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    @ManyToOne
    @JoinColumn(name="DEPARTMENT_ID")
    private OneToManyEntityAttributeKeyDepartment department;

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

    public OneToManyEntityAttributeKeyDepartment getDepartment() {
        return department;
    }

    public void setDepartment(OneToManyEntityAttributeKeyDepartment department) {
        this.department = department;
    }
}
