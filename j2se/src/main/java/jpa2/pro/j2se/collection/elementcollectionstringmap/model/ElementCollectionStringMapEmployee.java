package jpa2.pro.j2se.collection.elementcollectionstringmap.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="ELEMENTCOLLECTIONSTRINGMAP_EMPLOYEE")
public class ElementCollectionStringMapEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    @ElementCollection
    @CollectionTable(name="ELEMENTCOLLECTIONSTRINGMAP_EMP_PHONE", joinColumns = @JoinColumn(name="Employee_ID"))
    @MapKeyColumn(name="PHONE_TYPE")
    @Column(name="PHONE_NUM")
    private Map<String, String> phoneNumbers;

    @ManyToOne
    @JoinColumn(name="DEPARTMENT_ID")
    private ElementCollectionStringMapDepartment department;

    public ElementCollectionStringMapDepartment getDepartment() {
        return department;
    }

    public void setDepartment(ElementCollectionStringMapDepartment department) {
        this.department = department;
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

    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<String, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
