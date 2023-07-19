package com.certus.monitorgbs.servicio;

import com.certus.monitorgbs.modelo.Usuario;
import com.certus.monitorgbs.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepository repo;

    public Usuario registrarUsuario(String nombres, String apellidop, String apellidom, String nombre, String usuario, String correo,String password) {
            Usuario usuarios= new Usuario();
            usuarios.setNombres(nombres);
            usuarios.setApellidopaterno(apellidop);
            usuarios.setApellidomaterno(apellidom);
            usuarios.setNombre(nombre);
            usuarios.setUsuario(usuario);
            usuarios.setPassword(password);
            usuarios.setCorreo(correo);
            return repo.save(usuarios);

    }
    public Usuario autenticar(String nombre, String password){
       return repo.findByNombreAndPassword(nombre,password).orElse(null);
    }
    public Usuario obtenerUsuarioRegistrado() {
        return repo.findFirstByOrderByIdDesc();
    }
}
