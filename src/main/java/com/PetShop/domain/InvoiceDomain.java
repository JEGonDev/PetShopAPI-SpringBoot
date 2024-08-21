package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvoiceDomain {
    private Integer invoiceID;
    private String invoiceDate;
    private String invoiceTime;
    private Double totalAmount;
    private Double totalReceived;
    private Double totalReturn;
    private EmployeeDomain employeeID;
    private MedicalAppointmentDomain medicalAppointmentID;
}