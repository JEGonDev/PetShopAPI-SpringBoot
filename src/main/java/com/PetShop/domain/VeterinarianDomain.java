package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VeterinarianDomain {
    private Integer veterianarianID;
    private String veterinarianFirstName;
    private String veterinarianLastName;
    private String degree;
    private String veterinarianPhone;
    private String veterinarianEmail;
    private Integer age;
}
