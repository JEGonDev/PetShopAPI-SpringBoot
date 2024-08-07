package com.PetShop.persistence;

import com.PetShop.persistence.crud.ProductCrudRepository;
import com.PetShop.persistence.entity.Product;

import java.util.List;

public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }
}
