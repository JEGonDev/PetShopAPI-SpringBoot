package com.PetShop.domain.repository;

import com.PetShop.domain.PetDomain;

import java.util.List;

public interface PetDomainRepository {
    List<PetDomain> getAll();
    PetDomain save(PetDomain petDomain);
    void delete(int petID);
    boolean existsPet(int petID);
    long countAll();
}
