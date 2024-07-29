package com.PetShop.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "propietorios")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_owner")
    private Integer ownerID;

    @Column (name = "nombre_propietario")
    private String ownerFistName;

    @Column (name = "apellido_propietario")
    private String ownerLastName;

    @Column (name = "email_propietario")
    private String ownerEmail;

    @Column (name = "telefono")
    private String ownerPhoneNumber;

    @Column (name = "direccion")
    private String ownerAddress;

    public Integer getID() {
        return ownerID;
    }

    public void setID(Integer ID) {
        this.ownerID = ID;
    }

    public String getOwnerFistName() {
        return ownerFistName;
    }

    public void setOwnerFistName(String ownerFistName) {
        this.ownerFistName = ownerFistName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.ownerPhoneNumber = phoneNumber;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
}
