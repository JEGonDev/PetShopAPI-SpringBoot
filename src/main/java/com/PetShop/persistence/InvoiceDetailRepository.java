package com.PetShop.persistence;

import com.PetShop.persistence.crud.InvoiceDetailCrudRepository;
import com.PetShop.persistence.entity.InvoiceDetail;

import java.util.List;

public class InvoiceDetailRepository {
    private InvoiceDetailCrudRepository invoiceDetailCrudRepository;

    public List<InvoiceDetail> getAll() {
        return (List<InvoiceDetail>) invoiceDetailCrudRepository.findAll();
    }
}
