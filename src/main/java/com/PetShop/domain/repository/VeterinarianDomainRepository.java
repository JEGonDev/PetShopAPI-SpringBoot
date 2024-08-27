package com.PetShop.domain.repository;

import com.PetShop.domain.VeterinarianDomain;

import java.util.List;

public interface VeterinarianDomainRepository {
    List<VeterinarianDomain> getAll();
    VeterinarianDomain save(VeterinarianDomain veterinarianDomain);
    void delete(int veterinarianID);
    boolean existsVeterinarian(int veterinarianID);
    long countAll();
}
