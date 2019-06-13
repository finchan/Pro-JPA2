package jpa2.pro.j2se.collection.embeddablekeymapping.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeName {
    @Column(name="F_NAME", insertable=false, updatable=false)
    private String fName;
    @Column(name="L_NAME", insertable=false, updatable=false)
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
