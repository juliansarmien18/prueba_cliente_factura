package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;




@Entity
@Table(name = "bill")
public class BillModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "products_quantity",nullable = false)
    private long productsQuantity;

    @Basic(optional = false)
    @Column(name = "total_price",nullable = false)
    private float totalPrice;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "billId")
    private List<ProductBillModel> productBillList;
    
    @JoinColumn(name = "cashier_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CashierModel cashierId;

    @JoinColumn(name = "checkout_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CheckoutModel checkoutId;

    @JoinColumn(name = "client_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ClientModel clientId;

    public BillModel() {
    }

    public BillModel(Long id) {
        this.id = id;
    }


    public BillModel(Long id, long productsQuantity, float totalPrice, List<ProductBillModel> productBillList, CashierModel cashierId, CheckoutModel checkoutId, ClientModel clientId) {
        this.id = id;
        this.productsQuantity = productsQuantity;
        this.totalPrice = totalPrice;
        this.productBillList = productBillList;
        this.cashierId = cashierId;
        this.checkoutId = checkoutId;
        this.clientId = clientId;
    }
    


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getProductsQuantity() {
        return this.productsQuantity;
    }

    public void setProductsQuantity(long productsQuantity) {
        this.productsQuantity = productsQuantity;
    }


    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ProductBillModel> getproductBillList() {
        return this.productBillList;
    }

    public void setproductBillList(List<ProductBillModel> productBillList) {
        this.productBillList = productBillList;
    }

    public CashierModel getCashierId() {
        return this.cashierId;
    }

    public void setCashierId(CashierModel cashierId) {
        this.cashierId = cashierId;
    }

    public CheckoutModel getCheckoutId() {
        return this.checkoutId;
    }

    public void setCheckoutId(CheckoutModel checkoutId) {
        this.checkoutId = checkoutId;
    }

    public ClientModel getClientId() {
        return this.clientId;
    }

    public void setClientId(ClientModel clientId) {
        this.clientId = clientId;
    }



    
}
