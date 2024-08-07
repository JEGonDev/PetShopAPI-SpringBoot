package com.PetShop.persistence;

import com.PetShop.persistence.crud.EmployeeCrudRepository;
import com.PetShop.persistence.entity.Employee;

import java.util.List;

public class EmployeeRepository {
    private EmployeeCrudRepository employeeCrudRepository;

    public List<Employee> getAll(){
        return (List<Employee>) employeeCrudRepository.findAll();
    }
}
