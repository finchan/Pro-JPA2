package jpa2.pro.j2se.relationship.onetomanybidirectional.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="onetomanybidirectional_department")
public class OneToManyBidirectionalDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "department")
    private Collection<OneToManyBidirectionalEmployee> employees;

    public OneToManyBidirectionalDepartment() {
        employees = new ArrayList<OneToManyBidirectionalEmployee>();
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

    public Collection<OneToManyBidirectionalEmployee> getEmployees() {
        return employees;
    }

    public void addEmployee(OneToManyBidirectionalEmployee employee) {
        if(!employees.contains(employee)){
            employees.add(employee);
            //Note: this part is redundant! I cannot figure out what the purpose is...
            if (employee.getDepartment() != null) {
                employee.getDepartment().getEmployees().remove(employee);
            }
            //set employee's department
            employee.setDepartment(this);
        }
    }
}
