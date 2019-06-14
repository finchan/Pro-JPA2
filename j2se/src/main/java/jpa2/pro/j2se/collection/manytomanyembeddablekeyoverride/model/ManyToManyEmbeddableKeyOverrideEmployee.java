package jpa2.pro.j2se.collection.manytomanyembeddablekeyoverride.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="MANYTOMANYEMBEDDABLEKEYOVERRIDE_EMPLOYEE")
public class ManyToManyEmbeddableKeyOverrideEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Embedded
    private ManyToManyEmbeddableKeyOverrideEmployeeName employeeName;
    private long salary;

    @ManyToMany(mappedBy = "employees")
    private Collection<ManyToManyEmbeddableKeyOverrideDepartment> departments;

    public ManyToManyEmbeddableKeyOverrideEmployee() {
        departments = new ArrayList<ManyToManyEmbeddableKeyOverrideDepartment>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ManyToManyEmbeddableKeyOverrideEmployeeName getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(ManyToManyEmbeddableKeyOverrideEmployeeName employeeName) {
        this.employeeName = employeeName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Collection<ManyToManyEmbeddableKeyOverrideDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<ManyToManyEmbeddableKeyOverrideDepartment> departments) {
        this.departments = departments;
    }
}
