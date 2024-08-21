package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

// DTO para la entidad Pet
@Data
@NoArgsConstructor
public class PetDTO {
    private Integer petID;
    private String namePet;
    private String species;
    private int age;
    private String gender;
    private Integer OwnerID;
}

