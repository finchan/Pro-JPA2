package jpa2.pro.j2se.collection.manytomanyembeddablekeyoverride.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Entity
@Table(name="MANYTOMANYEMBEDDABLEKEYOVERRIDE_DEPARTMENT")
public class ManyToManyEmbeddableKeyOverrideDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany
    //The join table you can place it in here or in Employee Entity
    @JoinTable(name="MANYTOMANYEMBEDDABLEKEYOVERRIDE_DEPT_EMP",
    joinColumns = @JoinColumn(name="DEPT_ID"),
            inverseJoinColumns = @JoinColumn(name="EMP_ID"))
    @AttributeOverrides( {
            @AttributeOverride(name = "fName", column = @Column(table="MANYTOMANYEMBEDDABLEKEYOVERRIDE_DEPT_EMP", name = "EMP_FNAME")),
            @AttributeOverride(name = "lName", column = @Column(table="MANYTOMANYEMBEDDABLEKEYOVERRIDE_DEPT_EMP", name="EMP_LNAME"))
    })
    private Map<ManyToManyEmbeddableKeyOverrideEmployeeName, ManyToManyEmbeddableKeyOverrideEmployee> employees;

    public ManyToManyEmbeddableKeyOverrideDepartment( ) {
        this.employees = new HashMap<ManyToManyEmbeddableKeyOverrideEmployeeName, ManyToManyEmbeddableKeyOverrideEmployee>();
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

    public Map<ManyToManyEmbeddableKeyOverrideEmployeeName, ManyToManyEmbeddableKeyOverrideEmployee> getEmployees() {
        return employees;
    }

    public void addEmployee(ManyToManyEmbeddableKeyOverrideEmployee employee) {
        ManyToManyEmbeddableKeyOverrideEmployeeName ename = employee.getEmployeeName();
        employees.put(ename, employee);
        employee.getDepartments().add(this);
    }

    public void removeEmployee(ManyToManyEmbeddableKeyOverrideEmployee employee){
        Iterator it = employees.entrySet().iterator();
        while(it.hasNext()) {
            ManyToManyEmbeddableKeyOverrideEmployee emp = ((Map.Entry<ManyToManyEmbeddableKeyOverrideEmployeeName, ManyToManyEmbeddableKeyOverrideEmployee>)it.next()).getValue();
            if(emp.getId() == employee.getId()) {
                it.remove();
            }
        }
    }
}
