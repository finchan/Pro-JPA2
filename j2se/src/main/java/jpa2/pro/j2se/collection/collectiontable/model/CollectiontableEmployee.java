package jpa2.pro.j2se.collection.collectiontable.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table (name="collectiontable_employee")
public class CollectiontableEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

//    Using a targetClass instead of generics
    @ElementCollection(targetClass = CollectiontableEmployeeVacationbookings.class)
    @CollectionTable(name="collectiontable_employee_vacationbookings",
    joinColumns = @JoinColumn(name="EMPLOYEE_ID"))
    @AttributeOverride(name="daysTaken", column=@Column(name="DAYS"))
    private Collection vactionBookings;

    //If you use Generics, no need to provide targetClass
//    @ElementCollection
//    @CollectionTable(name="collectiontable_employee_vacationbookings",
//            joinColumns = @JoinColumn(name="EMPLOYEE_ID"))
//    @AttributeOverride(name="daysTaken", column=@Column(name="DAYS"))
//    private Collection <CollectiontableEmployeeVacationbookings> vactionBookings;

    //Using generics in place of a targetClass
    @ElementCollection
    @CollectionTable(name="collectiontable_employee_nicknames",
    joinColumns = @JoinColumn(name="EMPLOYEE_ID"))
    @Column(name="NICKNAMES")
    private Set<String> nickNames;

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

    public Collection getVactionBookings() {
        return vactionBookings;
    }

    public void setVactionBookings(Collection vactionBookings) {
        this.vactionBookings = vactionBookings;
    }

    public Set<String> getNickNames() {
        return nickNames;
    }

    public void setNickNames(Set<String> nickNames) {
        this.nickNames = nickNames;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
                " salary: " + getSalary() +
                " nickNames: " + nickNames;
    }
}
