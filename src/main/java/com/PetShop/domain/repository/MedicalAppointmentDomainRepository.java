package com.PetShop.domain.repository;

import com.PetShop.domain.MedicalAppointmentDomain;

import java.util.List;
import java.util.Optional;

public interface MedicalAppointmentDomainRepository {
    List<MedicalAppointmentDomain> getAll();
    Optional<MedicalAppointmentDomain> getMedicalAppointmentById(int id);
    MedicalAppointmentDomain save(MedicalAppointmentDomain medicalAppointmentDomain);
    void delete(int id);
    boolean existsMedicalAppointment(int id);
    long countAll();
}
