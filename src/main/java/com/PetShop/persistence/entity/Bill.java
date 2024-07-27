package com.PetShop.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer billID;

    //BUSCAR COMO HACER LAS RELACIONES
    @Column(name = "id_empleado")
    private Integer employeeID;

    //BUSCAR COMO HACER LAS RELACIONES
    @Column(name = "id_producto")
    private Integer productID;

    //BUSCAR COMO HACER LAS RELACIONES
    @Column(name = "id_cita")
    private Integer medicalAppointmentID;

    @Column(name = "total_a_pagar")
    private Double totalToPay;

    @Column (name = "total_recibido")
    private Double receivedAmount;

    @Column(name = "total_devolucion")
    private Double refund;

    // Getters and Setters

    public Integer getBillID() {
        return billID;
    }

    public void setBillID(Integer billID) {
        this.billID = billID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getMedicalAppointmentID() {
        return medicalAppointmentID;
    }

    public void setMedicalAppointmentID(Integer medicalAppointmentID) {
        this.medicalAppointmentID = medicalAppointmentID;
    }

    public Double getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(Double totalToPay) {
        this.totalToPay = totalToPay;
    }

    public Double getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Double receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public Double getRefund() {
        return refund;
    }

    public void setRefund(Double refund) {
        this.refund = refund;
    }
}
