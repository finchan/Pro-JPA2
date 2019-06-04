package jpa2.pro.j2se.collection.onetomanymap.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Entity
@Table(name="ONETOMANYMAP_DEPARTMENT")
public class OneToManyDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    @MapKeyColumn(name="CUB_ID")
    private Map<String, OneToManyEmployee> employees;

    public OneToManyDepartment() {
        employees = new HashMap<String, OneToManyEmployee>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, OneToManyEmployee> getEmployees() {
        return employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(String cubid, OneToManyEmployee employee){
        employees.put(cubid, employee);
        employee.setDepartment(this);
    }

    public void removeEmployee(OneToManyEmployee employee) {
        Iterator iter = employees.entrySet().iterator();
        while(iter.hasNext()) {
            OneToManyEmployee current = ((Map.Entry<String, OneToManyEmployee>)iter.next()).getValue();
            if(current.getId() == employee.getId()){
                iter.remove();;
                current.setDepartment(null);
            }
        }
    }
}
