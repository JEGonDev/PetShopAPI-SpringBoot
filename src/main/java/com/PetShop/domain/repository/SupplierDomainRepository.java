package com.PetShop.domain.repository;

import com.PetShop.domain.SupplierDomain;

import java.util.List;

public interface SupplierDomainRepository {
    List<SupplierDomain> getAll();
    SupplierDomain save(SupplierDomain supplierDomain);
    void delete(int supplierId);
    boolean existsSupplier(int supplierId);
    long countAll();
}
