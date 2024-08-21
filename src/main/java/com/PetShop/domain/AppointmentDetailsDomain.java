package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AppointmentDetailsDomain {
    private MedicalAppointmentDomain medicalAppointmentID;
    private PetDomain petID;
}