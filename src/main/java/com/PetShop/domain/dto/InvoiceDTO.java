package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvoiceDTO {
    private Integer invoiceID;
    private String invoiceDate;
    private String invoiceTime;
    private Double totalAmount;
    private Double totalReceived;
    private Double totalReturn;
    private Integer employeeID;
    private Integer medicalAppointmentID;
}
