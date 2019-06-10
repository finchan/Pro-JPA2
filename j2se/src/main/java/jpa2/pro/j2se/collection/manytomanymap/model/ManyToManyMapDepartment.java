package jpa2.pro.j2se.collection.manytomanymap.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Entity
@Table(name="MANYTOMANYMAP_DEPARTMENT")
public class ManyToManyMapDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="MANYTOMANYMAP_DEPT_EMP",
            joinColumns = @JoinColumn(name = "DEPT_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMP_ID")
    )
    @MapKeyColumn(table="MANYTOMANYMAP_DEPT_EMP", name="CUB_ID")
    private Map<String, ManyToManyMapEmployee> employeesByCubicle;

    public ManyToManyMapDepartment() {
        employeesByCubicle = new HashMap<String, ManyToManyMapEmployee>();
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

    public Map<String, ManyToManyMapEmployee> getEmployeesByCubicle() {
        return employeesByCubicle;
    }

    public void addEmployee(String cubicId, ManyToManyMapEmployee emp) {
        employeesByCubicle.put(cubicId, emp);
    }

    public void removeEmployee(ManyToManyMapEmployee emp) {
        Iterator iter = employeesByCubicle.entrySet().iterator();
        while(iter.hasNext()) {
            ManyToManyMapEmployee current = ((Map.Entry<String, ManyToManyMapEmployee>)iter.next()).getValue();
            if (current.getId() == emp.getId()) {
                iter.remove();
            }
        }
    }

}
