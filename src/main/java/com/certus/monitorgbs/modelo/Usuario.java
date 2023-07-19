package com.certus.monitorgbs.modelo;

import jakarta.persistence.*;

//Clase Usuario
@Entity
@Table(name="administrador") //Nombre de la tabla - @Column: Rows de la tabla
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "nombre")
    private String nombres;
    @Column (name = "ap_paterno")
    private String apellidopaterno;
    @Column (name = "ap_materno")
    private String apellidomaterno;

    @Column (name = "usuario")
    private String nombre;
    @Column (name = "dni")
    private String usuario;

    @Column (name = "contraseña")
    private String password;
    @Column (name = "correo")
   private String correo;



    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {     return password;}

    public void setPassword(String password) {
        this.password = password;
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
