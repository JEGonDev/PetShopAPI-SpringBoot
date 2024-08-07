package com.PetShop.persistence;

import com.PetShop.persistence.crud.VeterinarianCrudRepository;
import com.PetShop.persistence.entity.Veterinarian;

import java.util.List;

public class VeterinarianRepository {
    private VeterinarianCrudRepository veterinarianCrudRepository;

    public List<Veterinarian> getAll() {
        return (List<Veterinarian>) veterinarianCrudRepository.findAll();
    }
}
