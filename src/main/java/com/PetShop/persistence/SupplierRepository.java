package com.PetShop.persistence;

import com.PetShop.persistence.crud.SupplierCrudRepository;
import com.PetShop.persistence.entity.Supplier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SupplierRepository {
    private SupplierCrudRepository supplierCrudRepository;

    public List<Supplier> getAll() {
        return (List<Supplier>) supplierCrudRepository.findAll();
    }

    public Optional<Supplier> getSupplierByID(int id){
        return supplierCrudRepository.findById(id);
    }

    public Supplier save(Supplier supplier){
        return supplierCrudRepository.save(supplier);
    }

    public void delete(int id) {
        supplierCrudRepository.deleteById(id);
    }

    public boolean existsSupplier(int id) {
        return supplierCrudRepository.existsById(id);
    }

    public long countAll() {
        return supplierCrudRepository.count();
    }
}
