package jpa2.pro.j2se.relationship.one2onebidirectional.model;

import javax.persistence.*;

@Entity
@Table(name="onetoonebidirectional_parking_space")
public class One2OneBidirectionalParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int lot;
    private String location;
    @OneToOne(mappedBy = "parkingSpace")
    private One2OneBidirectionalEmployee employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public One2OneBidirectionalEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(One2OneBidirectionalEmployee employee) {
        this.employee = employee;
    }

    public String toString() {
        String str =  "ParkingSpace id: " + getId() + " lot: " + getLot() +
                ", location: " + getLocation();
        if(getEmployee() != null) {
            str = str + "Employee: " + getEmployee().getName();
        }
        return str;
    }
}

