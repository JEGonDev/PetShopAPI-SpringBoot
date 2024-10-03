package com.PetShop.domain.repository;

import com.PetShop.domain.InvoiceDomain;

import java.util.List;
import java.util.Optional;

public interface InvoiceDomainRepository {
    List<InvoiceDomain> getAll();
    Optional<InvoiceDomain> getInvoiceById(int id);
    InvoiceDomain save(InvoiceDomain invoiceDomain);
    void delete(int id);
    boolean existsInvoice(int id);
    long countAll();
}
