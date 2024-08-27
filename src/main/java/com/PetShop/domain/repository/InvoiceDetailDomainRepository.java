package com.PetShop.domain.repository;

import com.PetShop.domain.InvoiceDetailDomain;

import java.util.List;

public interface InvoiceDetailDomainRepository {
    List<InvoiceDetailDomain> getAll();
    InvoiceDetailDomain save(InvoiceDetailDomain invoiceDetailDomain);
    void delete(int invoiceDetailID);
    boolean existsInvoiceDetail(int invoiceDetailID);
    long countAll();
}
