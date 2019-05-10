package jpa2.pro.j2se.relationship.embeddedobjects.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class EmbeddedObjectsAddress {
    private String street;
    private String city;
    private String state;
    @Column(name="ZIP_CODE")
    private String zipCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address street: " + getStreet() +
                ", city: " + getCity() +
                ", state: " + getState() +
                ", zip: " + getZipCode();
    }
}
