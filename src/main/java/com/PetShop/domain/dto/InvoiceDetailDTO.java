package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvoiceDetailDTO {
    private Integer invoiceDetailID;
    private int quantity;
    private double unitPrice;
    private Integer invoiceID;
    private Integer productID;
}
