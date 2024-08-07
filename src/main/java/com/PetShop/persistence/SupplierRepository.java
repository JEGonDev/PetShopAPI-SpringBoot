package com.PetShop.persistence;

import com.PetShop.persistence.crud.SupplierCrudRepository;
import com.PetShop.persistence.entity.Supplier;

import java.util.List;

public class SupplierRepository {
    private SupplierCrudRepository supplierCrudRepository;

    public List<Supplier> getAll() {
        return (List<Supplier>) supplierCrudRepository.findAll();
    }
}
