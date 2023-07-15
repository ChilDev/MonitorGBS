package com.certus.monitorgbs.repositorio;
import com.certus.monitorgbs.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional <Usuario> findByNombreAndPassword(String nombre,String password);
    Usuario findFirstByOrderByIdDesc();
}
