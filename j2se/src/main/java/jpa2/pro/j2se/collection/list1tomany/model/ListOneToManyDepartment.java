package jpa2.pro.j2se.collection.list1tomany.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="listonetomanydepartment")
public class ListOneToManyDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany (mappedBy = "dept")
    @OrderBy("name ASC")
    private List<ListOneToManyEmployee> employees;

    public ListOneToManyDepartment() {
        this.employees = new ArrayList<ListOneToManyEmployee>();
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

    public List<ListOneToManyEmployee> getEmployees() {
        return employees;
    }

    public void addEmployees(ListOneToManyEmployee employee) {
        int initialSize = employees.size();
        if(!employees.contains(employee)){
            for (int i=0; i < initialSize; i++) {
                if (employees.get(i).getName().compareTo(employee.getName()) > 0) {
                    employees.add(i, employee);
                    break;
                }
            }
            //insert into the last position
            if(employees.size() == initialSize) {
                employees.add(employee);
            }
            if(employee != null) {
                employee.getDept().getEmployees().remove(employee);
            }
            employee.setDept(this);
        }
    }
}
