package com.PetShop.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "propietorios")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_propietario")
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

    //relationships
    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;

    @OneToMany(mappedBy = "owner")
    private List<MedicalAppointment> medicalAppointments;

    //getters and setters

    public Integer getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
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

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<MedicalAppointment> getMedicalAppointments() {
        return medicalAppointments;
    }

    public void setMedicalAppointments(List<MedicalAppointment> medicalAppointments) {
        this.medicalAppointments = medicalAppointments;
    }
}
