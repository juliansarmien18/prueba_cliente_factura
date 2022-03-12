package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "checkout")
public class CheckoutModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    public CheckoutModel() {
    }

    public CheckoutModel(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
