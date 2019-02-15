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
     * @param id: Clave primaria Usuario
     * @return el Usuario con esa Id
     */
    Optional<Usuario> findByIdUsuario(Long id);

    /**
     * READ
     * Optional evita los null.pointer
     * @param nif: Atributo unique
     * @return el Usuario con ese nif
     */
    Optional<Usuario> findByNif(String nif);

    /**
     * READ
     * LOGIN
     * @param nif: Atributo unique
     * @param claveAcceso: El pass para acceder
     * Que no haya sido baneado
     * @return Usuario no baneado que tenga ese nif y clave de acceso
     */
    //Optional<Usuario> findByNifAndClaveAccesoAndBaneadoFalse(String nif, String claveAcceso);

    //Boolean existsUsuarioByNifAndClaveAccesoAndBaneadoIsFalse(String nif, String claveAcceso);


    /**
     * Elimina el usuario
     * @param idUsuario: Clave primaria Usuario
     */
    void deleteByIdUsuario(Long idUsuario);
}
