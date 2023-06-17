package com.certus.monitorgbs.controlador;

import com.certus.monitorgbs.modelo.Usuario;
import com.certus.monitorgbs.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api") //Ruta:localhost:puerto/api
public class UsuarioController {

    //Usar usuarioRepository para hacer llamado a la interface del repositorio
    @Autowired
    UsuarioRepository usuarioRepository;

    //Método GET - Giovani

    //Método POST - Dennis

    //Método UPDATE - Sonny
    @PutMapping("/usuarios/{id}")
    public Optional<Usuario> editarUsuario(@PathVariable Long id, @RequestBody Usuario editarUsuario) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setNombre(editarUsuario.getNombre());
                    usuario.setAp_paterno(editarUsuario.getAp_paterno());
                    usuario.setAp_materno(editarUsuario.getAp_materno());
                    usuario.setDni(editarUsuario.getDni());
                    usuario.setCorreo(editarUsuario.getCorreo());
                    usuario.setTelefono(editarUsuario.getTelefono());
                    usuario.setUsuario(editarUsuario.getUsuario());
                    usuario.setPassword(editarUsuario.getPassword());
                    return usuarioRepository.save(usuario);
                });
    }
    //Método DELETE - Eddy
}
