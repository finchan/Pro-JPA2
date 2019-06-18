package jpa2.pro.j2se.collection.elementcollectionmapkeyentity.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name="ELEMENTCOLLECTIONMAPKEYENTITY_DEPARTMENT")
public class ElementCollectionMapKeyEntityDepartment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;

    @ElementCollection
    @CollectionTable(name="ELEMENTCOLLECTIONMAPKEYENTITY_EMP_SENIORITY",
            joinColumns = @JoinColumn(name="DEPARTMENT_ID"))
    @MapKeyJoinColumn(name="EMP_ID")
    @Column(name="SENIORITY")
    private Map<ElementCollectionMapKeyEntityEmployee, Integer> employees;

    public ElementCollectionMapKeyEntityDepartment() {
        employees = new HashMap<ElementCollectionMapKeyEntityEmployee, Integer>();
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

    public Map<ElementCollectionMapKeyEntityEmployee, Integer> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<ElementCollectionMapKeyEntityEmployee, Integer> employees) {
        this.employees = employees;
    }

    public void setEmployeSeniority(ElementCollectionMapKeyEntityEmployee employee, Integer seniority) {
        employees.put(employee, seniority);
    }

    public void removeEmployeeSenirority(ElementCollectionMapKeyEntityEmployee employee) {
        employees.remove(employee);
    }
}
