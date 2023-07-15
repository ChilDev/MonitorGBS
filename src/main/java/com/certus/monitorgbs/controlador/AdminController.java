package com.certus.monitorgbs.controlador;

import com.certus.monitorgbs.modelo.Admin;

import com.certus.monitorgbs.repositorio.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;
    @GetMapping("/lista")
    public List<Admin> obtenerListaAdmins() {
        return adminRepository.findAll();
    }
    @PostMapping
    public Admin crearAdmin(@RequestBody Admin admin){
        return adminRepository.save(admin);
    }
    @PutMapping("/lista/{id}")
    public Optional<Admin> editarAdmin(@PathVariable int id, @RequestBody Admin editarAdmin) {
        return adminRepository.findById(id)
                .map(admin -> {
                    admin.setNombre(editarAdmin.getNombre());
                    admin.setApellidoPaterno(editarAdmin.getApellidoPaterno());
                    admin.setApellidoMaterno(editarAdmin.getApellidoMaterno());
                    admin.setDni(editarAdmin.getDni());
                    admin.setCorreo(editarAdmin.getCorreo());
                    admin.setUsuario(editarAdmin.getUsuario());
                    admin.setContraseña(editarAdmin.getContraseña());
                    return adminRepository.save(admin);
                });
    }
    @DeleteMapping("/lista/{id}")
    public void eliminarAdmin(@PathVariable int id){
        Admin admin = adminRepository.findAllById(id);
        adminRepository.delete(admin);
    }
    @GetMapping("/status")
    public String getStatus() {
        try {
            adminRepository.count();
            return "Conexión a la base de datos exitosa y consulta ejecutada correctamente";
        } catch (Exception e) {
            return "Error al conectarse a la base de datos o al ejecutar la consulta: " + e.getMessage();
        }
    }

}
