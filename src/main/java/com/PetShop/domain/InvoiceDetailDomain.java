package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvoiceDetailDomain {
    private Integer invoiceDetailID;
    private int quantity;
    private double unitPrice;
    private InvoiceDomain invoiceID;
    private ProductDomain productID;
}