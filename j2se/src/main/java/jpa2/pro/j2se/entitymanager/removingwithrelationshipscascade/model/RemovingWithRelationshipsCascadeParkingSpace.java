package jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE")
public class RemovingWithRelationshipsCascadeParkingSpace {
    @Id
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
}
