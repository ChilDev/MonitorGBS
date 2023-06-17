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

    //Método DELETE - Eddy
}
