package jpa2.pro.j2se.relationship.onetoonepkmapping.model;

import javax.persistence.*;

@Entity
@Table(name="onetoonepkmapping_parking_space")
public class OneToOnePKMappingParkingSpace {
    @Id
    private int id;
    private int lot;
    private String location;
    @OneToOne
    @PrimaryKeyJoinColumn
    private  OneToOnePKMappingEmployee employee;

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

    public OneToOnePKMappingEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(OneToOnePKMappingEmployee employee) {
        this.employee = employee;
    }

    public String toString() {
        return "ParkingSpace id: " + getId() + " lot: " + getLot() +
                ", location: " + getLocation();
    }
}