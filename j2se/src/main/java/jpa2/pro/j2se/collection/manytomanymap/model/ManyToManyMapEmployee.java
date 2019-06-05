package jpa2.pro.j2se.collection.manytomanymap.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="MANYTOMANYMAP_EMPLOYEE")
public class ManyToManyMapEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    @ManyToMany (mappedBy = "employeesByCubicle")
    private Collection<ManyToManyMapDepartment> departments;

    public ManyToManyMapEmployee() {
        this.departments = new ArrayList<ManyToManyMapDepartment>();
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

    public Collection<ManyToManyMapDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<ManyToManyMapDepartment> departments) {
        this.departments = departments;
    }
}
