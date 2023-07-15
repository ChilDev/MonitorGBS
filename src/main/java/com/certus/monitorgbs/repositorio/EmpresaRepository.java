package com.certus.monitorgbs.repositorio;

import com.certus.monitorgbs.modelo.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
