package com.certus.monitorgbs.repositorio;
import com.certus.monitorgbs.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //Usuario findAllById(Long id);
}
