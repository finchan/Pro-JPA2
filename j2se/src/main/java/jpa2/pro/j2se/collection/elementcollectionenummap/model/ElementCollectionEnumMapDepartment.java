package jpa2.pro.j2se.collection.elementcollectionenummap.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ELEMENTCOLLECTIONENUMMAP_DEPARTMENT")
public class ElementCollectionEnumMapDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<ElementCollectionEnumMapEmployee> employees;

    public ElementCollectionEnumMapDepartment() {
        employees = new ArrayList<ElementCollectionEnumMapEmployee>();
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

    public List<ElementCollectionEnumMapEmployee> getEmployees() {
        return employees;
    }

    public void addEmployee(ElementCollectionEnumMapEmployee employee) {
        if(employees!=null && !employees.contains(employee)) {
            employees.add(employee);
            employee.setDepartment(this);
        }
    }
}
