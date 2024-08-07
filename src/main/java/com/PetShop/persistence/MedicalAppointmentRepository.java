package com.PetShop.persistence;

import com.PetShop.persistence.crud.MedicalAppointmentCrudRepository;
import com.PetShop.persistence.entity.MedicalAppointment;

import java.util.List;
import java.util.Optional;

public class MedicalAppointmentRepository {
    private MedicalAppointmentCrudRepository medicalAppointmentCrudRepository;

    public List<MedicalAppointment> getAll (){
        return (List<MedicalAppointment>) medicalAppointmentCrudRepository.findAll();
    }

    public Optional<MedicalAppointment> getMedicalAppointmentByID(int id){
        return medicalAppointmentCrudRepository.findById(id);
    }

    public MedicalAppointment save(MedicalAppointment medicalAppointment){
        return medicalAppointmentCrudRepository.save(medicalAppointment);
    }

    public void delete(int id){
        medicalAppointmentCrudRepository.deleteById(id);
    }
}
