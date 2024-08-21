package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

// DTO para la entidad Pet
@Data
@NoArgsConstructor
public class PetDomain {
    private Integer petID;
    private String namePet;
    private String species;
    private int age;
    private String gender;
    private OwnerDomain ownerID;
}