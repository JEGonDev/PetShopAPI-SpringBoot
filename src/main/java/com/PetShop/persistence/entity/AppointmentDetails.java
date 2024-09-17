package com.PetShop.persistence.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "DetallesCitas")
public class AppointmentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_cita")
    private MedicalAppointment medicalAppointment;

    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Pet pet;  // Asegúrate de que este nombre coincida con el mappedBy en Pet

    // Getters and Setters
    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
