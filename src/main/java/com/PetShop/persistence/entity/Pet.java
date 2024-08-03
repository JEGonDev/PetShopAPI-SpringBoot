package com.PetShop.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "mascotas")  // Nombre de la tabla en la base de datos
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Integer petID;

    @Column(name = "nombres")
    private String namePet;

    @Column(name = "especies")
    private String species;

    @Column(name = "edad")
    private int age;

    @Column(name = "genero")
    private String gender;

    // relationships
    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Owner owner;

    @OneToMany (mappedBy = "pet")
    private List<MedicalHistory> medicalHistory;

    @OneToMany (mappedBy = "pet")
    private List<AppointmentDetails> appointmentDetails;

    // getters and setters

    public Integer getPetID() {
        return petID;
    }

    public void setPetID(Integer petID) {
        this.petID = petID;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<MedicalHistory> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalHistory> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<AppointmentDetails> getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(List<AppointmentDetails> appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }
}
