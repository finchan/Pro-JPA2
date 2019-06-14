package jpa2.pro.j2se.collection.manytomanyembeddablekeyoverride.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ManyToManyEmbeddableKeyOverrideEmployeeName {
    @Column(name="F_NAME")
    private String fName;
    @Column(name="L_NAME")
    private String lName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
