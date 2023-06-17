package com.certus.monitorgbs.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios") //Nombre de la tabla - @Column: Rows de la tabla

//Clase Usuario
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "ap_paterno")
    private String ap_paterno;
    @Column (name = "ap_materno")
    private String ap_materno;
    @Column (name = "dni")
    private int dni;
    @Column (name = "correo")
    private String correo;
    @Column (name = "telefono")
    private int telefono;
    @Column (name = "usuario")
    private String usuario;
    @Column (name = "password")
    private String password;

    //Constructor vacío
    public Usuario(){

    }

    //Constructor
    public Usuario(long id, String nombre, String ap_paterno, String ap_materno, int dni, String correo, int telefono, String usuario, String password) {
        this.id = id;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
    }

    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
