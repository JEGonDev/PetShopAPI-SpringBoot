package com.PetShop.domain.repository;

import com.PetShop.domain.EmployeeDomain;

import java.util.List;

public interface EmployeeDomainRepository {
    List<EmployeeDomain> getAll();
    EmployeeDomain save(EmployeeDomain employeeDomain);
    void delete(int employeeID);
    boolean existsEmployee(int employeeID);
    long countAll();
}
