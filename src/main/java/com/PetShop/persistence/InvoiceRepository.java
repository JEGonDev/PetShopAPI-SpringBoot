package com.PetShop.persistence;

import com.PetShop.persistence.crud.InvoiceCrudRepository;
import com.PetShop.persistence.entity.Invoice;

import java.util.List;
import java.util.Optional;

public class InvoiceRepository {
    private InvoiceCrudRepository invoiceCrudRepository;

    public List<Invoice> getAll(){
        return (List<Invoice>) invoiceCrudRepository.findAll();
    }

    public Optional<Invoice> getInvoiceByID(int id){
        return invoiceCrudRepository.findById(id);
    }

    public Invoice save(Invoice invoice){
        return invoiceCrudRepository.save(invoice);
    }

    public void delete(int id){
        invoiceCrudRepository.deleteById(id);
    }
}
