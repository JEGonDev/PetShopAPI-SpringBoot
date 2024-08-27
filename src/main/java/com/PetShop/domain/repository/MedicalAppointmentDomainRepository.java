package com.PetShop.domain.repository;

import com.PetShop.domain.MedicalAppointmentDomain;

import java.util.List;

public interface MedicalAppointmentDomainRepository {
    List<MedicalAppointmentDomain> getAll();
    MedicalAppointmentDomain save(MedicalAppointmentDomain medicalAppointmentDomain);
    void delete(int appointmentID);
    boolean existsMedicalAppointment(int appointmentID);
    long countAll();
}
