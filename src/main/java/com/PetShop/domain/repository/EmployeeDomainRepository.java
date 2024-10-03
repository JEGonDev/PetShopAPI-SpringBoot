package com.PetShop.domain.repository;

import com.PetShop.domain.EmployeeDomain;

import java.util.List;
import java.util.Optional;

public interface EmployeeDomainRepository {
    List<EmployeeDomain> getAll();
    Optional<EmployeeDomain> getEmployeeById(int id);
    EmployeeDomain save(EmployeeDomain employeeDomain);
    void deleteById(int id);
    boolean existsEmployeeById(int id);
    long countAll();
}
