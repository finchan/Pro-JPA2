package jpa2.pro.j2se.collection.elementcollectionstringmap.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ELEMENTCOLLECTIONSTRINGMAP_DEPARTMENT")
public class ElementCollectionStringMapDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    @OrderBy("name DESC, salary ASC")
    private List<ElementCollectionStringMapEmployee> employees;

    public ElementCollectionStringMapDepartment() {
        employees = new ArrayList<ElementCollectionStringMapEmployee>();
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

    public List<ElementCollectionStringMapEmployee> getEmployees() {
        return employees;
    }

    public void addEmployee(ElementCollectionStringMapEmployee employee) {
        getEmployees().add(employee);
        employee.setDepartment(this);
    }
}
