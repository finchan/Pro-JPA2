package jpa2.pro.j2se.relationship.onetoonepkmapping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="onetoonepkmapping_employee")
public class OneToOnePKMappingEmployee {
    @Id
    private int id;
    private String name;
    private long salary;
    @OneToOne(mappedBy="employee")
    private OneToOnePKMappingParkingSpace parkingSpace;

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

    public OneToOnePKMappingParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(OneToOnePKMappingParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " with " + getParkingSpace();
    }
}
