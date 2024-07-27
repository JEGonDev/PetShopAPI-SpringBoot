package com.PetShop.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer employeeID;

    @Column(name = "nombre_empleado")
    private String fistName;

    @Column(name = "apellido_empleado")
    private String lastName;

    @Column(name = "email_empleado")
    private String email;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer ID) {
        this.employeeID = ID;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
