package com.PetShop.persistence;

import com.PetShop.persistence.crud.EmployeeCrudRepository;
import com.PetShop.persistence.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository {
    private EmployeeCrudRepository employeeCrudRepository;

    public List<Employee> getAll(){
        return (List<Employee>) employeeCrudRepository.findAll();
    }

    public Optional<Employee> getEmployeeByID(int id){
        return employeeCrudRepository.findById(id);
    }

    public Employee save(Employee employee){
        return employeeCrudRepository.save(employee);
    }

    public void deleteById(int id){
        employeeCrudRepository.deleteById(id);
    }

    public boolean existsEmployeeById(int id){
        return employeeCrudRepository.existsById(id);
    }

    public long countAll(){
        return employeeCrudRepository.count();
    }
}
