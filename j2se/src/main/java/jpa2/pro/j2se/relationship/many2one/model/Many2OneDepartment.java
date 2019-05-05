package jpa2.pro.j2se.relationship.many2one.model;

import javax.persistence.*;

@Entity
@Table(name="manytoonedepartment")
public class Many2OneDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        return "Department id: " + getId() +
                ", name: " + getName();
    }

}
