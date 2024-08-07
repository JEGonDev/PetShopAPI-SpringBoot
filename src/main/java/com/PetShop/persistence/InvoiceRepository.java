package com.PetShop.persistence;

import com.PetShop.persistence.crud.InvoiceCrudRepository;
import com.PetShop.persistence.entity.Invoice;

import java.util.List;

public class InvoiceRepository {
    private InvoiceCrudRepository invoiceCrudRepository;

    public List<Invoice> getAll(){
        return (List<Invoice>) invoiceCrudRepository.findAll();
    }
}
