package com.PetShop.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer invoiceID;

    @Column(name = "fecha_factura")
    private String invoiceDate;

    @Column(name = "hora_factura")
    private String invoiceTime;

    @Column(name = "total_factura")
    private Double totalAmount;

    @Column(name = "total_recibido")
    private Double totalReceived;

    @Column(name = "total_devuelto")
    private Double totalReturn;

    //Relationships
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_cita")
    private MedicalAppointment medicalAppointment;

    //Getters and Setters

    public Integer getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Integer invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalReceived() {
        return totalReceived;
    }

    public void setTotalReceived(Double totalReceived) {
        this.totalReceived = totalReceived;
    }

    public Double getTotalReturn() {
        return totalReturn;
    }

    public void setTotalReturn(Double totalReturn) {
        this.totalReturn = totalReturn;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }
}
