package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

// DTO para la entidad Pet
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetDTO {
    private Integer petID;
    private String namePet;
    private String species;
    private int age;
    private String gender;
    private Integer OwnerID;
}

