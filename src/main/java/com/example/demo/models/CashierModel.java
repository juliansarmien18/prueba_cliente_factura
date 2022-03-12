package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "cashier")
public class CashierModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @Column(length = 20,name = "first_name",nullable = false)
    private String firstName;

    @Basic(optional = false)
    @Column(length = 20,name = "first_lastname",nullable = false)
    private String firstLastname;


    public CashierModel() {
    }

    public CashierModel(Integer id) {
        this.id = id;
    }

    public CashierModel(Integer id, String firstName, String firstLastname) {
        this.id = id;
        this.firstName = firstName;
        this.firstLastname = firstLastname;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getFirstLastname() {
        return firstLastname;
    }


    public void setFirstLastname(String firstLastname) {
        this.firstLastname = firstLastname;
    }

    


}
