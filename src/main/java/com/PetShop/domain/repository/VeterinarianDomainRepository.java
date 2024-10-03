package com.PetShop.domain.repository;

import com.PetShop.domain.VeterinarianDomain;

import java.util.List;
import java.util.Optional;

public interface VeterinarianDomainRepository {
    List<VeterinarianDomain> getAll();
    Optional<VeterinarianDomain> getVeterinarianById(int id);
    VeterinarianDomain save(VeterinarianDomain veterinarianDomain);
    void delete(int id);
    boolean existsVeterinarian(int id);
    long countAll();
}
