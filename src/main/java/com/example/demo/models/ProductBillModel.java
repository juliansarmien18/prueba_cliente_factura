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

    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BillModel billId;

    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ProductModel productId;
    
    public ProductBillModel() {
    }

    public ProductBillModel(Integer id) {
        this.id = id;
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
