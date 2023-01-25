package com.customprojects.springliquibasemysql.models;

import javax.persistence.*;

@Entity
@Table(name = "ADVERTISEMENT")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME", length = 200)
    private String name;
    @Column(name = "TYPE", length = 50)
    private String type;
    @Column(name = "PRICE", length = 150)
    private String priceModel;
}
