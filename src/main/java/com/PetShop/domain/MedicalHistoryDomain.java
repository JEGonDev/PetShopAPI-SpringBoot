package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MedicalHistoryDomain {
    private Integer historyID;
    private String allergies;
    private String previousTreatment;
    private String previousMedications;
    private PetDomain petID;
    private MedicalAppointmentDomain medicalAppointmentID;
}
