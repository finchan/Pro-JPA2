package jpa2.pro.j2se.entitymanager.removingwithrelationshipscascade.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REMOVINGWITHRELATIONSHIPSCASCADE_PHONE")
public class RemovingWithRelationshipsCascadePhone {
    @Id
    private int id;
    private String number;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
