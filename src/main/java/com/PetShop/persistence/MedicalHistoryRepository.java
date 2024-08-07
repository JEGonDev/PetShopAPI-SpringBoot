package com.PetShop.persistence;

import com.PetShop.persistence.crud.MedicalHistoryCrudRepository;
import com.PetShop.persistence.entity.MedicalHistory;

import java.util.List;

public class MedicalHistoryRepository {
    private MedicalHistoryCrudRepository medicalHistoryCrudRepository;

    public List<MedicalHistory> getAll() {
        return (List<MedicalHistory>) medicalHistoryCrudRepository.findAll();
    }
}
