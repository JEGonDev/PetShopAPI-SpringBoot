package com.PetShop.domain.repository;

import com.PetShop.domain.ProductDomain;

import java.util.List;

public interface ProductDomainRepository {
    List<ProductDomain> getAll();
    ProductDomain save(ProductDomain productDomain);
    void delete(int productID);
    boolean existsProduct(int productID);
    long countAll();
}
