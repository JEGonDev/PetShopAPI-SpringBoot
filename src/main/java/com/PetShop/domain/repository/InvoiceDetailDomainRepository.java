package com.PetShop.domain.repository;

import com.PetShop.domain.InvoiceDetailDomain;

import java.util.List;
import java.util.Optional;

public interface InvoiceDetailDomainRepository {
    List<InvoiceDetailDomain> getAll();
    Optional<InvoiceDetailDomain> getInvoiceDetailById(int id);
    InvoiceDetailDomain save(InvoiceDetailDomain invoiceDetailDomain);
    void delete(int id);
    boolean existsInvoiceDetail(int id);
    long countAll();
}
