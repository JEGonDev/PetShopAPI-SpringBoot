package com.PetShop.domain;

import java.util.List;

public class VeterinarianDomain {
    private Integer veterinarianId;
    private String firstName;
    private String lastName;
    private String position;
    private String phoneNumber;
    private String email;
    private Integer age;

    // Relationships
    private List<MedicalAppointmentDomain> medicalAppointment;

    // Getters and Setters

    public Integer getVeterinarianId() {
        return veterinarianId;
    }

    public void setVeterinarianId(Integer veterinarianId) {
        this.veterinarianId = veterinarianId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<MedicalAppointmentDomain> getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(List<MedicalAppointmentDomain> medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }
}
