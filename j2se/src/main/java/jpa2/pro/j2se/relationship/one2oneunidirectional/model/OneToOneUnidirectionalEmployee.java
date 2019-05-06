package jpa2.pro.j2se.relationship.one2oneunidirectional.model;

import javax.persistence.*;

@Entity
@Table(name="onetooneunidirectional_employee")
public class OneToOneUnidirectionalEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    @OneToOne
    @JoinColumn(name = "PSPACE_ID")
    private OneToOneUnidirectionalParkingSpace parkingSpace;

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

    public OneToOneUnidirectionalParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(OneToOneUnidirectionalParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " with " + getParkingSpace();
    }
}
