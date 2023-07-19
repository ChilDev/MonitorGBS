package com.certus.monitorgbs.controlador;

import com.certus.monitorgbs.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.certus.monitorgbs.servicio.UsuarioServicio;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioServicio serviceuser;


    @GetMapping("/register")
    public String mostrarRegistroPage(Model model) {
        model.addAttribute("registerRequest", new Usuario());
        return "register_page";
    }

    @GetMapping("/login")
    public String mostrarpaginalogin(Model model) {
        model.addAttribute("loginRequest", new Usuario());
        return "login_page";
    }

    // metodos deenvio de datos
    @PostMapping("/register")
    public String register(@ModelAttribute Usuario usuarios) {

        Usuario registrando = serviceuser.registrarUsuario(usuarios.getNombres(), usuarios.getApellidopaterno(), usuarios.getApellidopaterno(), usuarios.getNombre(), usuarios.getUsuario(), usuarios.getCorreo(), usuarios.getPassword());
        return registrando == null ? "error_page" : "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Usuario usuarios, Model model) {

        Usuario autenticando = serviceuser.autenticar(usuarios.getNombre(), usuarios.getPassword());
        if (autenticando != null) {
            Usuario obtener = serviceuser.obtenerUsuarioRegistrado();
            model.addAttribute("apellidop", obtener.getApellidopaterno());
            model.addAttribute("apellidom", obtener.getApellidomaterno());
            model.addAttribute("nombrees", obtener.getNombres());
            model.addAttribute("dnis", obtener.getUsuario());
            model.addAttribute("correous", obtener.getCorreo());
            model.addAttribute("userLogin", autenticando.getNombre());

            return "perfil_page";
        } else {
            return "error_page";
        }
    }

    @GetMapping("/perfil")
    public String mostrarPerfil(Model model) {
        Usuario usuarioRegistrado = serviceuser.obtenerUsuarioRegistrado();

        if (usuarioRegistrado != null) {
            model.addAttribute("apellidop", usuarioRegistrado.getApellidopaterno());
            model.addAttribute("apellidom", usuarioRegistrado.getApellidomaterno());
            model.addAttribute("nombrees", usuarioRegistrado.getNombres());
            model.addAttribute("dnis", usuarioRegistrado.getUsuario());
            model.addAttribute("correous", usuarioRegistrado.getCorreo());
            model.addAttribute("userLogin", usuarioRegistrado.getNombre());
            return "perfil_page";
        } else {
            return "error_page";
        }
    }
}

