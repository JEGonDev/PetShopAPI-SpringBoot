package com.PetShop.domain.repository;

import com.PetShop.domain.OwnerDomain;

import java.util.List;
import java.util.Optional;

public interface OwnerDomainRepository {
    List<OwnerDomain> getAll();
    Optional<OwnerDomain> getOwnerById(int id);
    OwnerDomain save(OwnerDomain ownerDomain);
    void delete(int id);
    boolean existsOwner(int id);
    long countAll();
}
