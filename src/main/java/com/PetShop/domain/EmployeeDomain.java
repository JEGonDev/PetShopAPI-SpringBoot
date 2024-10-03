package com.PetShop.domain;

import java.util.List;

public class EmployeeDomain {
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    // Relationships
    private List<InvoiceDomain> invoice;

    // Getters and Setters

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    public List<InvoiceDomain> getInvoice() {
        return invoice;
    }

    public void setInvoice(List<InvoiceDomain> invoice) {
        this.invoice = invoice;
    }
}
