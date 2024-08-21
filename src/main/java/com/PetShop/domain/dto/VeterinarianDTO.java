package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VeterinarianDTO {
    private Integer veterianarianID;
    private String veterinarianFirstName;
    private String veterinarianLastName;
    private String degree;
    private String veterinarianPhone;
    private String veterinarianEmail;
    private Integer age;
}
