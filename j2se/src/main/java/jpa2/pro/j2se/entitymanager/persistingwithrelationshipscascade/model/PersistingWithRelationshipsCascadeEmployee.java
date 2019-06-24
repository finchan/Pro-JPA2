package jpa2.pro.j2se.entitymanager.persistingwithrelationshipscascade.model;

import javax.persistence.*;

@Entity
@Table(name="PERSISTINGWITHRELATIONSHIPSCASCADE_EMPLOYEE")
public class PersistingWithRelationshipsCascadeEmployee {
    @Id
    private int id;
    private String name;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name=" ADDRESS_ID")
    private PersistingWithRelationshipsCascadeAddress address;

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

    public PersistingWithRelationshipsCascadeAddress getAddress() {
        return address;
    }

    public void setAddress(PersistingWithRelationshipsCascadeAddress address) {
        this.address = address;
    }
}
