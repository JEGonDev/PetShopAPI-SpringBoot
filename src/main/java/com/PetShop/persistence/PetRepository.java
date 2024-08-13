package com.PetShop.persistence;

import com.PetShop.persistence.crud.PetCrudRepository;
import com.PetShop.persistence.entity.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository {
    private PetCrudRepository petCrudRepository;

    public List<Pet> getAll() {
        return (List<Pet>) petCrudRepository.findAll();
    }

    public Optional<Pet> getPetByID(int id){
        return petCrudRepository.findById(id);
    }

    public Pet save(Pet pet){
        return petCrudRepository.save(pet);
    }

    public void delete(int id) {
        petCrudRepository.deleteById(id);
    }

    public boolean existsPet(int id) {
        return petCrudRepository.existsById(id);
    }

    public long countAll(){
        return petCrudRepository.count();
    }

    public List<Pet> getBySpecies(String species) {
        return petCrudRepository.findBySpeciesOrderByIdAsc(species);
    }
}
