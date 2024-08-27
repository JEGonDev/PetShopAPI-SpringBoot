package com.PetShop.domain.repository;

import com.PetShop.domain.InvoiceDomain;

import java.util.List;

public interface InvoiceDomainRepository {
    List<InvoiceDomain> getAll();
    InvoiceDomain save(InvoiceDomain invoiceDomain);
    void delete(int invoiceID);
    boolean existsInvoice(int invoiceID);
    long countAll();
}
