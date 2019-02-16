package org.timeforcetech.timeforceappberv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.timeforcetech.timeforceappberv1.entity.Usuario;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    /**
     * READ
     * @return todos los usuarios
     */
    List<Usuario> findAll();

    /**
     * READ
     * Optional evita los null.pointer
     * @param idUsuario: Clave primaria Usuario
     * @return el Usuario con esa Id
     */
    Optional<Usuario> findByIdUsuario(Long idUsuario);

    /**
     * READ
     * Optional evita los null.pointer
     * @param username: Atributo unique
     * @return el Usuario con ese nif
     */
    Optional<Usuario> findByUsername(String username);

    /**
     * Elimina el usuario
     * @param idUsuario: Clave primaria Usuario
     */
    void deleteByIdUsuario(Long idUsuario);
}
