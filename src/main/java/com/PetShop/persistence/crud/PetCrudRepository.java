package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetCrudRepository extends CrudRepository<Pet,Integer> {
}
