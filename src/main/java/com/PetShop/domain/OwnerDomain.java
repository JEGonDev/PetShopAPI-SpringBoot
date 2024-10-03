package com.PetShop.domain;

import java.util.List;

public class OwnerDomain {
    private Integer ownerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;

    // Relationships
    private List<PetDomain> pet;

    // Getters and Setters

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<PetDomain> getPet() {
        return pet;
    }

    public void setPet(List<PetDomain> pet) {
        this.pet = pet;
    }
}
