package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MedicalAppointmentDomain {
    private Integer appointmentID;
    private String appointmentDate;
    private String appointmentTime;
    private double appointmentCost;
    private VeterinarianDomain veterinarianID;
}