package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDomain {
    private Integer productID;
    private String productName;
    private String productCategory;
    private String brand;
    private Double price;
    private SupplierDomain supplierID;
}
