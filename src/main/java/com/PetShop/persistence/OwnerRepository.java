package com.PetShop.persistence;

import com.PetShop.persistence.crud.OwnerCrudRepository;
import com.PetShop.persistence.entity.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OwnerRepository {
    private OwnerCrudRepository ownerCrudRepository;

    public List<Owner> getAll(){
        return (List<Owner>) ownerCrudRepository.findAll();
    }

    public Optional<Owner> getOwnerByID(int id){
        return ownerCrudRepository.findById(id);
    }

    public Owner save(Owner owner){
        return ownerCrudRepository.save(owner);
    }

    public void delete(int id) {
        ownerCrudRepository.deleteById(id);
    }

    public boolean existsOwner(int id) {
        return ownerCrudRepository.existsById(id);
    }

    public long countAll(){
        return ownerCrudRepository.count();
    }
}

