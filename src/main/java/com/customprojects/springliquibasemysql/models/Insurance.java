package com.customprojects.springliquibasemysql.models;

import javax.persistence.*;

@Entity
@Table(name = "INSURANCE_TEST")
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TYPE", length = 200)
    private String type;
    @Column(name = "NAME", length = 200)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
