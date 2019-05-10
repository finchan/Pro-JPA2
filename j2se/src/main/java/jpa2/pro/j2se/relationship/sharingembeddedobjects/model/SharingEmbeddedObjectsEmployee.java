package jpa2.pro.j2se.relationship.sharingembeddedobjects.model;

import javax.persistence.*;

@Entity
@Table(name="sharingembeddedobjects_employee")
public class SharingEmbeddedObjectsEmployee {
    @Id
    private int id;
    private String name;
    private long salary;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="state", column=@Column(name="PROVINCE")),
            @AttributeOverride(name="zip", column=@Column(name="POSTAL_CODE"))
    })
    private SharingEmbeddedObjectsAddress address;

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

    public SharingEmbeddedObjectsAddress getAddress() {
        return address;
    }

    public void setAddress(SharingEmbeddedObjectsAddress address) {
        this.address = address;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " salary: " + getSalary() + " address: " + getAddress();
    }
}
