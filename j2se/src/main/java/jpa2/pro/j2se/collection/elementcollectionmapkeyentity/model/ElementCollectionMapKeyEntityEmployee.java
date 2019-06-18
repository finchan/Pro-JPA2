package jpa2.pro.j2se.collection.elementcollectionmapkeyentity.model;

import javax.persistence.*;

@Entity
@Table(name="ELEMENTCOLLECTIONMAPKEYENTITY_EMPLOYEE")
public class ElementCollectionMapKeyEntityEmployee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

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
}
