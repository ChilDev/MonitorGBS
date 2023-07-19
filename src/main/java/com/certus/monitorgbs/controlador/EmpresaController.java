package com.certus.monitorgbs.controlador;

import com.certus.monitorgbs.modelo.Empresa;
import com.certus.monitorgbs.repositorio.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/lista")
    public List<Empresa> getAllAdmins() {
        return empresaRepository.findAll();
    }
    //METODO POST
    @PostMapping
    public Empresa crearEmpresa(@RequestBody Empresa empresa){
        return empresaRepository.save(empresa);
    }
    //METODO PUT
    @PutMapping("/lista/{id}")
    public Optional<Empresa> actualizarEmpresa(@PathVariable Integer id,@RequestBody Empresa empresaActualizada){
        return empresaRepository.findById(id)
                .map(empresa -> {
                    empresa.setNombreEmpresa(empresaActualizada.getNombreEmpresa());
                    empresa.setRucEmpresa(empresaActualizada.getRucEmpresa());
                    empresa.setDireccionEmpresa(empresaActualizada.getDireccionEmpresa());
                    empresa.setDistrito(empresaActualizada.getDistrito());
                    empresa.setTelefonoEmpresa(empresaActualizada.getTelefonoEmpresa());
                    empresa.setCorreoEmpresa(empresaActualizada.getCorreoEmpresa());
                    empresa.setNombrePropietario(empresaActualizada.getNombrePropietario());
                    empresa.setApellidoPaternoPropietario(empresaActualizada.getApellidoPaternoPropietario());
                    empresa.setApellidoMaternoPropietario(empresaActualizada.getApellidoMaternoPropietario());
                    empresa.setDniPropietario(empresaActualizada.getDniPropietario());
                    empresa.setTelefonoPropietario(empresaActualizada.getTelefonoPropietario());
                    empresa.setCorreoPropietario(empresaActualizada.getCorreoPropietario());
                    empresa.setAdmin(empresaActualizada.getAdmin());
                    return empresaRepository.save(empresa);
                });
    }

    @DeleteMapping("/lista/{id}")
    public void eliminarEmpresa(@PathVariable Integer id){
        empresaRepository.deleteById(id);
    }

}
