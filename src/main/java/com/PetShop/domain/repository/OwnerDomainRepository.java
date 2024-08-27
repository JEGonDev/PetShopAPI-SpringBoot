package com.PetShop.domain.repository;

import com.PetShop.domain.OwnerDomain;

import java.util.List;

public interface OwnerDomainRepository {
    List<OwnerDomain> getAll();
    OwnerDomain save(OwnerDomain ownerDomain);
    void delete(int ownerID);
    boolean existsOwner(int ownerID);
    long countAll();
}
