package jpa2.pro.j2se.relationship.manytomanybidirectional.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="manytomanybidirectional_employee")
public class ManyToManyBidirectionalEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    @ManyToMany
    @JoinTable(
            name="manytomanybidirectional_employee__project",
            joinColumns = @JoinColumn(name="MANYTOMANYBIDIRECTIONAL_EMPLOYEES_ID"),
            inverseJoinColumns =  @JoinColumn(name="MANYTOMANYBIDIRECTIONAL_PROJECTS_ID")
    )
    private Collection<ManyToManyBidirectionalProject> projects;

    public ManyToManyBidirectionalEmployee() {
        projects = new ArrayList<ManyToManyBidirectionalProject>();
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

    public Collection<ManyToManyBidirectionalProject> getProjects() {
        return projects;
    }

    public void addProject(ManyToManyBidirectionalProject project) {
        if(!getProjects().contains(project)) {
            getProjects().add(project);
        }
        if(!project.getEmployees().contains(this)) {
            project.getEmployees().add((this));
        }
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " with " + getProjects().size() + " projects";
    }
}
