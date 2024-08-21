package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO {
    private Integer productID;
    private String productName;
    private String productCategory;
    private String brand;
    private Double price;
    private Integer supplierDTO;
}
