package com.PetShop.persistence;

import com.PetShop.persistence.crud.OwnerCrudRepository;
import com.PetShop.persistence.entity.Owner;

import java.util.List;

public class OwnerRepository {
    private OwnerCrudRepository ownerCrudRepository;

    public List<Owner> getAll(){
        return (List<Owner>) ownerCrudRepository.findAll();
    }
}
