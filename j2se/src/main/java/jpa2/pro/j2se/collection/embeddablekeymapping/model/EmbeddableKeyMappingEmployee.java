package jpa2.pro.j2se.collection.embeddablekeymapping.model;

import javax.persistence.*;

@Entity
@Table(name="EMBEDDABLEKEYMAPPING_EMPLOYEE")
public class EmbeddableKeyMappingEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="F_NAME")
    private String firstName;
    @Column(name="L_NAME")
    private String lastName;
    private long salary;
    @ManyToOne
    @JoinColumn(name="DEPARTMENT_ID")
    private EmbeddableKeyMappingDepartment department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public EmbeddableKeyMappingDepartment getDepartment() {
        return department;
    }

    public void setDepartment(EmbeddableKeyMappingDepartment department) {
        this.department = department;
    }
}
