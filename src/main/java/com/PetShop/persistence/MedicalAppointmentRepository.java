package com.PetShop.persistence;

import com.PetShop.persistence.crud.MedicalAppointmentCrudRepository;
import com.PetShop.persistence.entity.MedicalAppointment;

import java.util.List;

public class MedicalAppointmentRepository {
    private MedicalAppointmentCrudRepository medicalAppointmentCrudRepository;

    public List<MedicalAppointment> getAll (){
        return (List<MedicalAppointment>) medicalAppointmentCrudRepository.findAll();
    }
}
