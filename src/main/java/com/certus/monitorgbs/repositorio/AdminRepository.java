package com.certus.monitorgbs.repositorio;

import com.certus.monitorgbs.modelo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findAllById(int id);
}
