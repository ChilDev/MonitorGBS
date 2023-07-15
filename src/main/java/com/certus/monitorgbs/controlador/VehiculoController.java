package com.certus.monitorgbs.controlador;

import com.certus.monitorgbs.modelo.Admin;
import com.certus.monitorgbs.modelo.Vehiculo;
import com.certus.monitorgbs.repositorio.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @GetMapping("/lista")
    public List<Vehiculo> obtenerListaVehiculos() {
        return vehiculoRepository.findAll();
    }
    @PostMapping
    public Vehiculo insertarVehiculo(@RequestBody Vehiculo vehiculo){
        return vehiculoRepository.save(vehiculo);
    }
    @PutMapping("/lista/{id}")
    public Optional<Vehiculo> editarVehiculo(@PathVariable int id, @RequestBody Vehiculo editarVehiculo) {
        return vehiculoRepository.findById(id)
                .map(vehiculo -> {
                    vehiculo.setPlaca(editarVehiculo.getPlaca());
                    vehiculo.setModelo(editarVehiculo.getModelo());
                    vehiculo.setColor(editarVehiculo.getColor());
                    vehiculo.setSoat(editarVehiculo.getSoat());
                    vehiculo.setEmpresa(editarVehiculo.getEmpresa());
                    return vehiculoRepository.save(vehiculo);
                });
    }
    @DeleteMapping("/lista/{id}")
    public void eliminarVehiculo(@PathVariable int id){
        Vehiculo vehiculo = vehiculoRepository.findAllById(id);
        vehiculoRepository.delete(vehiculo);
    }
    @GetMapping("/status")
    public String getStatus() {
        try {
            vehiculoRepository.count();
            return "Conexión a la base de datos exitosa y consulta ejecutada correctamente";
        } catch (Exception e) {
            return "Error al conectarse a la base de datos o al ejecutar la consulta: " + e.getMessage();
        }
    }

}


