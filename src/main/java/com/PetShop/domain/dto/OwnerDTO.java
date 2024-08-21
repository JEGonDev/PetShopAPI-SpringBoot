package com.PetShop.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OwnerDTO {
    private Integer ownerID;
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerEmail;
    private String ownerPhoneNumber;
    private String ownerAddress;
}
