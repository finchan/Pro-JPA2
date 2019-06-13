package jpa2.pro.j2se.collection.embeddablekeymapping.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Entity
@Table(name="EMBEDDABLEKEYMAPPING_DEPARTMENT")
public class EmbeddableKeyMappingDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private Map<EmployeeName, EmbeddableKeyMappingEmployee> employees;

    public EmbeddableKeyMappingDepartment() {
        employees = new HashMap<EmployeeName, EmbeddableKeyMappingEmployee> ();
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

    public Map<EmployeeName, EmbeddableKeyMappingEmployee> getEmployees() {
        return employees;
    }

    public void addEmployee(EmbeddableKeyMappingEmployee employee) {
        EmployeeName empName = new EmployeeName();
        empName.setfName(employee.getFirstName());
        empName.setlName(employee.getLastName());
        employees.put(empName, employee);
        employee.setDepartment(this);
    }

    public void removeEmployee(EmbeddableKeyMappingEmployee employee) {
        Iterator it = employees.entrySet().iterator();
        while(it.hasNext()) {
            EmbeddableKeyMappingEmployee emp = ((Map.Entry<EmployeeName, EmbeddableKeyMappingEmployee>)it.next()).getValue();
            if(emp.getId() == employee.getId()) {
                it.remove();
                emp.setDepartment(null);
            }
        }
    }
}
