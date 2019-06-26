package jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="REMOVINGWITHRELATIONSHIPSCASCADE_EMPLOYEE")
public class RemovingWithRelationshipsCascadeEmployee {
    @Id
    private int id;
    private String name;

    public RemovingWithRelationshipsCascadeEmployee() {
        this.phones = new ArrayList<RemovingWithRelationshipsCascadePhone>();
    }

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="PSPACE_ID")
    private RemovingWithRelationshipsCascadeParkingSpace parkingSpace;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(table="REMOVINGWITHRELATIONSHIPSCASCADE_PHONE", name="EMPLOYEE_ID")
    private Collection<RemovingWithRelationshipsCascadePhone> phones;

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

    public RemovingWithRelationshipsCascadeParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(RemovingWithRelationshipsCascadeParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public Collection<RemovingWithRelationshipsCascadePhone> getPhones() {
        return phones;
    }

    public void setPhones(Collection<RemovingWithRelationshipsCascadePhone> phones) {
        this.phones = phones;
    }

    public RemovingWithRelationshipsCascadePhone addPhone(RemovingWithRelationshipsCascadePhone phone) {
        phones.add(phone);
        return phone;
    }
}
