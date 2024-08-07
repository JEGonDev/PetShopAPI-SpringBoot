package com.PetShop.persistence;

import com.PetShop.persistence.crud.PetCrudRepository;
import com.PetShop.persistence.entity.Pet;

import java.util.List;

public class PetRepository {
    private PetCrudRepository petCrudRepository;

    public List<Pet> getAll() {
        return (List<Pet>) petCrudRepository.findAll();
    }
}
