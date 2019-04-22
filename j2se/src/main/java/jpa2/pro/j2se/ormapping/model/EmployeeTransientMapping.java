package jpa2.pro.j2se.ormapping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Locale;
import java.util.ResourceBundle;

@Entity
public class EmployeeTransientMapping {
    @Id
    private int id;
    private String name;
    private long salary;
    transient private String convertedName;

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
        convertedName = convertName(name);
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getConvertedName() {
        return convertedName;
    }

    protected String convertName(String name) {
        return name.toUpperCase(Locale.CANADA);
    }

    public String toString() {
        return "Employee " + " id: " + getId() + " name: " + getName() +
                " converted name: " + getConvertedName() + " salary: " + getSalary();
    }
}
