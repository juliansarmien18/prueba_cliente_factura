package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class ClientModel implements Serializable {

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
    
    @Column(length = 20,name = "second_lastname")
    private String secondLastname;

    @Basic(optional = false)
    @Column(name = "document_number",nullable = false)
    private long documentNumber;

    @Basic(optional = false)
    @Column(length = 255,name = "adress",nullable = false)
    private String adress;

    @JoinColumn(name = "document_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DocumentTypeModel documentTypeId;
    


    public ClientModel(Integer id, String firstName, String firstLastname, String secondLastname, long documentNumber, String adress, DocumentTypeModel documentTypeId) {
        this.id = id;
        this.firstName = firstName;
        this.firstLastname = firstLastname;
        this.secondLastname = secondLastname;
        this.documentNumber = documentNumber;
        this.adress = adress;
        this.documentTypeId = documentTypeId;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstLastname() {
        return this.firstLastname;
    }

    public void setFirstLastname(String firstLastname) {
        this.firstLastname = firstLastname;
    }

    public String getSecondLastname() {
        return this.secondLastname;
    }

    public void setSecondLastname(String secondLastname) {
        this.secondLastname = secondLastname;
    }

    public long getDocumentNumber() {
        return this.documentNumber;
    }

    public void setDocumentNumber(long documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public DocumentTypeModel getDocumentTypeId() {
        return this.documentTypeId;
    }

    public void setDocumentTypeId(DocumentTypeModel documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

}
