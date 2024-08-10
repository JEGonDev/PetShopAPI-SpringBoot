package com.PetShop.persistence;

import com.PetShop.persistence.crud.ProductCrudRepository;
import com.PetShop.persistence.entity.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public Optional<Product> getProductByID(int id){
        return productCrudRepository.findById(id);
    }

    public Product save(Product product){
        return productCrudRepository.save(product);
    }

    public void delete(int id) {
        productCrudRepository.deleteById(id);
    }

    public boolean existsProduct(int id) {
        return productCrudRepository.existsById(id);
    }

    public long countAll() {
        return productCrudRepository.count();
    }
}
