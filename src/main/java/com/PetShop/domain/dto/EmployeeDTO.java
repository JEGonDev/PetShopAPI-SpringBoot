package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDTO {
    private Integer employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeePhoneNumber;
    private String employeeEmail;
}
