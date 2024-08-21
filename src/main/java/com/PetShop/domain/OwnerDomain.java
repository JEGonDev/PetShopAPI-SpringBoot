package com.PetShop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OwnerDomain {
    private Integer ownerID;
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerEmail;
    private String ownerPhoneNumber;
    private String ownerAddress;
}