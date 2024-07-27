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
    private String nameOwner;

    @Column (name = "apellido_propietario")
    private String ownerLastName;

    @Column (name = "email_propietario")
    private String ownerEmail;

    @Column (name = "telefono")
    private String phoneNumber;

    @Column (name = "direccion")
    private String address;

    public Integer getID() {
        return ownerID;
    }

    public void setID(Integer ID) {
        this.ownerID = ID;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
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
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
