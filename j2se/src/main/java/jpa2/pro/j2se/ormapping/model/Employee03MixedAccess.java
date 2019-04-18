package jpa2.pro.j2se.ormapping.model;

import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name="employee_03_mixed_access")
public class Employee03MixedAccess {
    public static final String LOCAL_AREA_CODE = "613";
    @Id
    private int id;
    @Transient
    private String phoneNum;

    private String name;
    private long wage;

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

    public long getSalary() {
        return wage;
    }

    public void setSalary(long salary) {
        this.wage = salary;
    }

    public String getPhoneNumber() { return phoneNum; }
    public void setPhoneNumber(String num) { this.phoneNum = num; }

    @Access(AccessType.PROPERTY) @Column(name="PHONE")
    protected String getPhoneNumberForDb() {
        if (null != phoneNum && phoneNum.length() == 10) {
            return phoneNum;
        }
        else {
            return LOCAL_AREA_CODE + phoneNum;
        }
    }

    protected void setPhoneNumberForDb(String num) {
        if (num.startsWith(LOCAL_AREA_CODE))
            phoneNum = num.substring(3);
        else
            phoneNum = num;
    }

    public Employee03MixedAccess() {
    }

    public Employee03MixedAccess(int id, String phoneNum, String name, long wage) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.name = name;
        this.wage = wage;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() + " salary: " + getSalary() + " phone: " + getPhoneNumberForDb();
    }
}