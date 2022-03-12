package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @Column(length = 30,name = "name",nullable = false)
    private String name;

    @Basic(optional = false)
    @Column(name = "unity_price",nullable = false)
    private float unityPrice;

    @JoinColumn(name = "status_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StatusModel statusId;
    
    public ProductModel() {
    }

    public ProductModel(Integer id) {
        this.id = id;
    }


    public ProductModel(Integer id, String name, float unityPrice, StatusModel statusId) {
        this.id = id;
        this.name = name;
        this.unityPrice = unityPrice;
        this.statusId = statusId;
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

    public float getUnityPrice() {
        return this.unityPrice;
    }

    public void setUnityPrice(float unityPrice) {
        this.unityPrice = unityPrice;
    }

    public StatusModel getStatusId() {
        return this.statusId;
    }

    public void setStatusId(StatusModel statusId) {
        this.statusId = statusId;
    }

}
