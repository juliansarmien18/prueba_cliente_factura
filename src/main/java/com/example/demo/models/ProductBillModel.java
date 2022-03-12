package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "product_bill")
public class ProductBillModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id",nullable = false)
    private Integer id;

    @Basic(optional = false)
    @Column(name = "quantity",nullable = false)
    private Integer quantity;


    private BillModel billId;

    private ProductModel productId;


    
    public ProductBillModel() {
    }

    public ProductBillModel(Integer id) {
        this.id = id;
    }


    public ProductBillModel(Integer id, Integer quantity, BillModel billId, ProductModel productId) {
        this.id = id;
        this.quantity = quantity;
        this.billId = billId;
        this.productId = productId;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BillModel getBillId() {
        return this.billId;
    }

    public void setBillId(BillModel billId) {
        this.billId = billId;
    }

    public ProductModel getProductId() {
        return this.productId;
    }

    public void setProductId(ProductModel productId) {
        this.productId = productId;
    }

}
