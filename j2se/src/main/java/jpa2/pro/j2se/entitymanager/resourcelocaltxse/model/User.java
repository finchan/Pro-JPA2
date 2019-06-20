package jpa2.pro.j2se.entitymanager.resourcelocaltxse.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="USER_DB")
public class User {
    @Id
    private String name;
    private String password;
    @Temporal(TemporalType.DATE)
    private Calendar lastChange;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getLastChange() {
        return lastChange;
    }

    public void setLastChange(Calendar lastChange) {
        this.lastChange = lastChange;
    }
}
