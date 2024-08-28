package com.PetShop.persistence.mapper;

import com.PetShop.domain.ProductDomain;
import com.PetShop.persistence.entity.Product;


public interface

ProductMapper {

    //Envia datos del dominio a la base de datos
    ProductDomain toProductDB(Product product);

    //Envia datos de la base de datos al dominio
    Product toProductDomain(ProductDomain productDomain);
}
