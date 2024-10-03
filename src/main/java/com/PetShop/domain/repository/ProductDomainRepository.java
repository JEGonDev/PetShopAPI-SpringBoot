package com.PetShop.domain.repository;

import com.PetShop.domain.ProductDomain;

import java.util.List;
import java.util.Optional;

public interface ProductDomainRepository {
    List<ProductDomain> getAll();
    Optional<ProductDomain> getProductById(int id);
    ProductDomain save(ProductDomain productDomain);
    void delete(int id);
    boolean existsProduct(int id);
    long countAll();
}
