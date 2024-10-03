package com.PetShop.domain;

import java.util.List;

public class MedicalAppointmentDomain {
    private Integer medicalAppointmentId;
    private String date;
    private String time;
    private Double cost;

    // Relationships
    private VeterinarianDomain veterinarian;
    private List<InvoiceDomain> invoice;
    private List<MedicalHistoryDomain> medicalHistory;
    private List<AppointmentDetailsDomain> appointmentDetail;

    // Getters and Setters

    public Integer getMedicalAppointmentId() {
        return medicalAppointmentId;
    }

    public void setMedicalAppointmentId(Integer medicalAppointmentId) {
        this.medicalAppointmentId = medicalAppointmentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public VeterinarianDomain getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(VeterinarianDomain veterinarian) {
        this.veterinarian = veterinarian;
    }

    public List<InvoiceDomain> getInvoice() {
        return invoice;
    }

    public void setInvoice(List<InvoiceDomain> invoice) {
        this.invoice = invoice;
    }

    public List<MedicalHistoryDomain> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalHistoryDomain> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<AppointmentDetailsDomain> getAppointmentDetail() {
        return appointmentDetail;
    }

    public void setAppointmentDetail(List<AppointmentDetailsDomain> appointmentDetail) {
        this.appointmentDetail = appointmentDetail;
    }
}
