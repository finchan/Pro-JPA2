package jpa2.pro.j2se.collection.elementcollectionenummap.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="ELEMENTCOLLECTIONENUMMAP_EMPLOYEE")
public class ElementCollectionEnumMapEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    @ManyToOne
    @JoinColumn(name="DEPARTMENT_ID")
    private ElementCollectionEnumMapDepartment department;

    @ElementCollection
    @CollectionTable(name="ELEMENTCOLLECTIONENUMMAP_EMP_PHONE",
            joinColumns = @JoinColumn(name="EMPLOYEE_ID"))
    @MapKeyEnumerated(EnumType.STRING)
    @MapKeyColumn(name="PHONE_TYPE")
    @Column(name="PHONE_NUM")
    private Map<PhoneType, String> phoneNumbers;

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

    public ElementCollectionEnumMapDepartment getDepartment() {
        return department;
    }

    public void setDepartment(ElementCollectionEnumMapDepartment department) {
        this.department = department;
    }

    public Map<PhoneType, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<PhoneType, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
