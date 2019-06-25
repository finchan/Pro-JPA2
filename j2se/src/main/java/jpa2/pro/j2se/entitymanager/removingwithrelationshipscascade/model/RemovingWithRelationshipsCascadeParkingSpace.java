package jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE")
public class RemovingWithRelationshipsCascadeParkingSpace {
    @Id
    private int id;
    private String lot;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
