package com.PetShop.domain.repository;

import com.PetShop.domain.SupplierDomain;

import java.util.List;
import java.util.Optional;

public interface SupplierDomainRepository {
    List<SupplierDomain> getAll();
    Optional<SupplierDomain> getSupplierById(int id);
    SupplierDomain save(SupplierDomain supplierDomain);
    void delete(int id);
    boolean existsSupplier(int id);
    long countAll();
}
