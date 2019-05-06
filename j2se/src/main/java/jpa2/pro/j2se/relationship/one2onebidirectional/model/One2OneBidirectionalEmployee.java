package jpa2.pro.j2se.relationship.one2onebidirectional.model;


import javax.persistence.*;

@Entity
@Table(name="onetoonebidirectional_employee")
public class One2OneBidirectionalEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    @OneToOne
    @JoinColumn(name = "PSPACE_ID")
    private One2OneBidirectionalParkingSpace parkingSpace;

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

    public One2OneBidirectionalParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(One2OneBidirectionalParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " with " + getParkingSpace();
    }
}
