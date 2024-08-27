package com.PetShop.domain.repository;

import com.PetShop.domain.MedicalHistoryDomain;

import java.util.List;

public interface MedicalHistoryDomainRepository {
    List<MedicalHistoryDomain> getAll();
    MedicalHistoryDomain save(MedicalHistoryDomain medicalHistoryDomain);
    void delete(int historyID);
    boolean existsMedicalHistory(int historyID);
    long countAll();
}
