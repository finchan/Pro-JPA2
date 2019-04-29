package jpa2.pro.j2se.ormapping.model;

import javax.persistence.*;

@Entity
@Table(name="employe_id_table_generated")
public class EmployeeIDTableGen {
    @TableGenerator(name="Address_Gen",
    table="ID_GEN",
    pkColumnName = "GEN_NAME",
    valueColumnName = "GEN_VAL",
    pkColumnValue = "Addr_Gen",
    initialValue = 10000,
    allocationSize = 100)
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator = "Address_Gen")
    private int id;
    private String name;

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

    public String toString() {
        return "Employee id: " + getId() +
                ", name: " + getName();
    }
}
