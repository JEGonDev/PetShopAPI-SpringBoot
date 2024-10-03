package com.PetShop.domain.repository;

import com.PetShop.domain.MedicalHistoryDomain;

import java.util.List;
import java.util.Optional;

public interface MedicalHistoryDomainRepository {
    List<MedicalHistoryDomain> getAll();
    Optional<MedicalHistoryDomain> getMedicalHistoryById(int id);
    MedicalHistoryDomain save(MedicalHistoryDomain medicalHistoryDomain);
    void delete(int id);
    boolean existsMedicalHistory(int id);
    long countAll();
}
