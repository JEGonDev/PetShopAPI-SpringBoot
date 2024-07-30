package com.PetShop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CitasMedicas")
public class MedicalAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Integer appointmentID;

    @Column(name = "numero_cita")
    private int appointmentNumber;

    @Column(name = "fecha_cita")
    private String appointmentDate;

    @Column(name = "hora_cita")
    private String appointmentTime;

    @Column(name = "costo_cita")
    private double appointmentCost;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "id_veterinario")
    private Veterinarian veterinarian;

    @OneToMany(mappedBy = "appointment")
    private List<Invoice> invoices;

    @OneToMany(mappedBy = "appointment")
    private List<MedicalHistory> medicalHistory;

    // Getters and setters

    public Integer getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public double getAppointmentCost() {
        return appointmentCost;
    }

    public void setAppointmentCost(double appointmentCost) {
        this.appointmentCost = appointmentCost;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<MedicalHistory> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalHistory> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
