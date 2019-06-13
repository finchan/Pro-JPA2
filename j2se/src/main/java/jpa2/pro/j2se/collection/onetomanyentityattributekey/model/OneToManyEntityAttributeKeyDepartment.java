package jpa2.pro.j2se.collection.onetomanyentityattributekey.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name="ONETOMANYENTITYATTRIBUTEKEY_DEPARTMENT")
public class OneToManyEntityAttributeKeyDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    @MapKey(name="id")
    private Map<Integer, OneToManyEntityAttributeKeyEmployee> employees;

    public OneToManyEntityAttributeKeyDepartment() {
        employees = new HashMap<Integer, OneToManyEntityAttributeKeyEmployee>();
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

    public Map<Integer, OneToManyEntityAttributeKeyEmployee> getEmployees() {
        return employees;
    }

    public void addEmployee(OneToManyEntityAttributeKeyEmployee employee) {
        employees.put(employee.getId(), employee);
        employee.setDepartment(this);
    }
}
