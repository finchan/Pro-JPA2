package jpa2.pro.j2se.relationship.sharingembeddedobjects.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sharingembeddedobjects_company")
public class SharingEmbeddedObjectsCompany {
    @Id
    private int id;
    @Embedded
    private SharingEmbeddedObjectsAddress address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SharingEmbeddedObjectsAddress getAddress() {
        return address;
    }

    public void setAddress(SharingEmbeddedObjectsAddress address) {
        this.address = address;
    }

    public String toString() {
        return "Company id: " + getId() + " address: " + getAddress();
    }
}
