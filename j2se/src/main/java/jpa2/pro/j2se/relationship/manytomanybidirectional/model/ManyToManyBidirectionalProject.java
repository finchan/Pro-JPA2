package jpa2.pro.j2se.relationship.manytomanybidirectional.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="manytomanybidirectional_project")
public class ManyToManyBidirectionalProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "projects")
    private Collection<ManyToManyBidirectionalEmployee> employees;

    public ManyToManyBidirectionalProject() {
        employees = new ArrayList<ManyToManyBidirectionalEmployee>();
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

    public Collection<ManyToManyBidirectionalEmployee> getEmployees() {
        return employees;
    }

    public void addEmployee(ManyToManyBidirectionalEmployee employee) {
        if(!getEmployees().contains(employee)) {
            getEmployees().add(employee);
        }
        if(!employee.getProjects().contains(this)) {
            employee.getProjects().add(this);
        }
    }

    public String toString() {
        return "Project id: " + getId() + ", name: " + getName() +
                " with " + getEmployees().size() + " employees";
    }
}
