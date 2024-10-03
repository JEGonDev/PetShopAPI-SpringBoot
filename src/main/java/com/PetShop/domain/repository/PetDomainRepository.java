package com.PetShop.domain.repository;

import com.PetShop.domain.PetDomain;

import java.util.List;
import java.util.Optional;

public interface PetDomainRepository {
    List<PetDomain> getAll();
    Optional<PetDomain> getPetById(int id);
    PetDomain save(PetDomain petDomain);
    void delete(int id);
    boolean existsPet(int id);
    long countAll();
    List<PetDomain> getBySpecies(String species);
}
