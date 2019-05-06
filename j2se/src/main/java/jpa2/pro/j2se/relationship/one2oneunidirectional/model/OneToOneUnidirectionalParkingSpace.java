package jpa2.pro.j2se.relationship.one2oneunidirectional.model;

import javax.persistence.*;

@Entity
@Table(name="onetooneunidirectional_parking_space")
public class OneToOneUnidirectionalParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int lot;
    private String location;

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

    public String toString() {
        return "ParkingSpace id: " + getId() + " lot: " + getLot() +
                ", location: " + getLocation();
    }
}
