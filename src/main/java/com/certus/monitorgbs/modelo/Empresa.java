package com.certus.monitorgbs.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "EMPRESA")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_empresa", nullable = false)
    private String nombreEmpresa;

    @Column(name = "ruc_empresa", nullable = false)
    private String rucEmpresa;

    @Column(name = "direccion_empresa", nullable = false)
    private String direccionEmpresa;

    @Column(name = "distrito", nullable = false)
    private String distrito;

    @Column(name = "telefono_empresa", nullable = false)
    private int telefonoEmpresa;

    @Column(name = "correo_empresa", nullable = false)
    private String correoEmpresa;

    @Column(name = "nombre_propietario", nullable = false)
    private String nombrePropietario;

    @Column(name = "ap_paterno_propietario", nullable = false)
    private String apellidoPaternoPropietario;

    @Column(name = "ap_materno_propietario", nullable = false)
    private String apellidoMaternoPropietario;

    @Column(name = "dni_propietario ", nullable = false)
    private int dniPropietario;

    @Column(name = "telefono_propietario ", nullable = false)
    private int telefonoPropietario;

    @Column(name = "correo_propietario ", nullable = false)
    private String correoPropietario;

    @OneToMany(mappedBy = "empresa")
    @JsonIgnore
    private List<Vehiculo> vehiculos;
    //Anotación ManytoOne debe ir dentro la tabla que debe referenciar a la otra
    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    @JsonIgnoreProperties({"nombre", "apellidoPaterno", "apellidoMaterno", "dni", "correo", "contraseña"})
    private Admin admin;

    public Empresa() {

    }

    public Empresa(int id, String nombreEmpresa, String rucEmpresa, String direccionEmpresa, String distrito, int telefonoEmpresa, String correoEmpresa, String nombrePropietario, String apellidoPaternoPropietario, String apellidoMaternoPropietario, int dniPropietario, int telefonoPropietario, String correoPropietario, Admin admin) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.rucEmpresa = rucEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.distrito = distrito;
        this.telefonoEmpresa = telefonoEmpresa;
        this.correoEmpresa = correoEmpresa;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPaternoPropietario = apellidoPaternoPropietario;
        this.apellidoMaternoPropietario = apellidoMaternoPropietario;
        this.dniPropietario = dniPropietario;
        this.telefonoPropietario = telefonoPropietario;
        this.correoPropietario = correoPropietario;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidoPaternoPropietario() {
        return apellidoPaternoPropietario;
    }

    public void setApellidoPaternoPropietario(String apellidoPaternoPropietario) {
        this.apellidoPaternoPropietario = apellidoPaternoPropietario;
    }

    public String getApellidoMaternoPropietario() {
        return apellidoMaternoPropietario;
    }

    public void setApellidoMaternoPropietario(String apellidoMaternoPropietario) {
        this.apellidoMaternoPropietario = apellidoMaternoPropietario;
    }

    public int getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(int dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    public int getTelefonoPropietario() {
        return telefonoPropietario;
    }

    public void setTelefonoPropietario(int telefonoPropietario) {
        this.telefonoPropietario = telefonoPropietario;
    }

    public String getCorreoPropietario() {
        return correoPropietario;
    }

    public void setCorreoPropietario(String correoPropietario) {
        this.correoPropietario = correoPropietario;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}