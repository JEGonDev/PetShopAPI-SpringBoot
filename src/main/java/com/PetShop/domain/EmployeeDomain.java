package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDomain {
    private Integer employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeePhoneNumber;
    private String employeeEmail;
}