package com.codeup.springblog.controllers;

import javax.persistence.*;

@Entity
public class DoggoController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "tinyint(3) unsigned", nullable = false, unique = true);
    private int age;
    @Column(columnDefinition = "varchar(200)", nullable = false);
    private String name;
    @Column(columnDefinition = "char(2) DEFAULT 'XX'");
    private String resideState;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
