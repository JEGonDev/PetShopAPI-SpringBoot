package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AppointmentDetailsDTO {
    private Integer medicalAppointmentID;
    private Integer petID;
}
