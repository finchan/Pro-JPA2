package jpa2.pro.j2se.entitymanager.persistingwithrelationshipscascade.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSISTINGWITHRELATIONSHIPSCASCADE_ADDRESS")
public class PersistingWithRelationshipsCascadeAddress {
    @Id
    private int id;
    private String city;
    private String state;
    private String street;
    private String zip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
