package com.PetShop.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DetallesCitas")
public class AppointmentDetails {

    @ManyToOne
    @JoinColumn(name = "id_cita")
    private MedicalAppointment medicalAppointment;

    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Pet pets;

    // Getters and Setters

    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    public Pet getPets() {
        return pets;
    }

    public void setPets(Pet pets) {
        this.pets = pets;
    }
}
