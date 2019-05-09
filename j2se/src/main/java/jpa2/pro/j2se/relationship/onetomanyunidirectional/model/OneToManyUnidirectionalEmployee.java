package jpa2.pro.j2se.relationship.onetomanyunidirectional.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="onetomanyunidirectional_employee")
public class OneToManyUnidirectionalEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    @OneToMany
    @JoinTable(name="onetomanyunidirectional_emp_phone",
            joinColumns = @JoinColumn(name="emp_id"),
            inverseJoinColumns = @JoinColumn(name="ONETOMANYUNIDIRECTIONAL_PHONE_ID"))
    private Collection<OneToManyUnidirectionalPhone> phones;

    public OneToManyUnidirectionalEmployee() {
        phones = new ArrayList<OneToManyUnidirectionalPhone>();
    }

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
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Collection<OneToManyUnidirectionalPhone> getPhones() {
        return phones;
    }

    public void addPhone(OneToManyUnidirectionalPhone phone) {
        if(!getPhones().contains(phone)){
            getPhones().add(phone);
        }
    }
}
