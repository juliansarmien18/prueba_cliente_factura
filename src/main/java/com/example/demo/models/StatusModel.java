package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class StatusModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @Column(length = 20,name = "name",nullable = false)
    private String name;
    

    public StatusModel() {
    }

    public StatusModel(Integer id) {
        this.id = id;
    }



    public StatusModel(Integer id, String name) {
        this.id = id;
        this.name = name;
    }



    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
