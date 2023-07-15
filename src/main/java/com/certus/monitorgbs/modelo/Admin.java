package com.certus.monitorgbs.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ADMINISTRADOR")
public class Admin {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ap_paterno")
    private String apellidoPaterno;
    @Column(name = "ap_materno")
    private String apellidoMaterno;
    @Column(name = "dni")
    private int dni;
    @Column(name = "correo")
    private String correo;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contraseña")
    private String contraseña;
    @OneToMany(mappedBy = "admin")
    @JsonIgnore
    private List<Empresa> empresas;

    public Admin(){

    }

    public Admin(int id, String nombre, String apellidoPaterno, String apellidoMaterno, int dni, String correo, String usuario, String contraseña, List<Empresa> empresas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.empresas = empresas;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }
    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
}
