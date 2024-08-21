package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MedicalHistoryDTO {
    private Integer historyID;
    private String allergies;
    private String previousTreatment;
    private String previousMedications;
    private Integer petID;
    private Integer medicalAppointmentID;
}
