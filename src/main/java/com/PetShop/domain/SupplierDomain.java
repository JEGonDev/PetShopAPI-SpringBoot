package com.PetShop.domain;

import java.util.List;

public class SupplierDomain {
    private Integer supplierId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    // Relationships
    private List<ProductDomain> product;

    // Getters and Setters

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public List<ProductDomain> getProduct() {
        return product;
    }

    public void setProduct(List<ProductDomain> product) {
        this.product = product;
    }
}
