package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MedicalAppointmentDTO {
    private Integer appointmentID;
    private String appointmentDate;
    private String appointmentTime;
    private double appointmentCost;
    private Integer veterinarianID;
}
