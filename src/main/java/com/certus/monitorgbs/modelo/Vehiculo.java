package com.certus.monitorgbs.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "VEHICULO")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "placa", nullable = false)
    private String placa;
    @Column(name = "modelo", nullable = false)
    private String modelo;
    @Column(name = "color", nullable = false)
    private String color;
    @Column(name = "soat", nullable = false)
    private String soat;
    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    @JsonIgnoreProperties({"nombreEmpresa", "rucEmpresa", "direccionEmpresa", "distrito", "telefonoEmpresa",
            "correoEmpresa", "nombrePropietario", "apellidoPaternoPropietario", "apellidoMaternoPropietario",
            "dniPropietario","telefonoPropietario", "correoPropietario"})
    private Empresa empresa;

    Vehiculo(){

    }
    public Vehiculo(int id, String placa, String modelo, String color, String soat, Empresa empresa) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.soat = soat;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
