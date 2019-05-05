package jpa2.pro.j2se.relationship.many2one.model;

import javax.persistence.*;

@Entity
@Table(name = "manytooneemployee")
public class Many2OneEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Many2OneDepartment many2OneDepartment;

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

    public Many2OneDepartment getMany2OneDepartment() {
        return many2OneDepartment;
    }

    public void setMany2OneDepartment(Many2OneDepartment many2OneDepartment) {
        this.many2OneDepartment = many2OneDepartment;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " with " + getMany2OneDepartment();
    }
}
