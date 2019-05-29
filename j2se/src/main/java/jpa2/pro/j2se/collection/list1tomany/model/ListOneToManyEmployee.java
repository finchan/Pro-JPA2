package jpa2.pro.j2se.collection.list1tomany.model;

import javax.persistence.*;

@Entity
@Table(name="listonetomanyemployee")
public class ListOneToManyEmployee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    @ManyToOne
    @JoinColumn(name="LISTONETOMANYDEPARTMENT_ID")

    private ListOneToManyDepartment dept;

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

    public ListOneToManyDepartment getDept() {
        return dept;
    }

    public void setDept(ListOneToManyDepartment dept) {
        this.dept = dept;
    }
}
