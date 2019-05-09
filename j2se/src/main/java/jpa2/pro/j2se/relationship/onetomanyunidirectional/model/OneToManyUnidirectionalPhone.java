package jpa2.pro.j2se.relationship.onetomanyunidirectional.model;

import javax.persistence.*;

@Entity
@Table(name="onetomanyunidirectional_phone")
public class OneToManyUnidirectionalPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
