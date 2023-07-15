package com.certus.monitorgbs.repositorio;

import com.certus.monitorgbs.modelo.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    Vehiculo findAllById(int id);
}
