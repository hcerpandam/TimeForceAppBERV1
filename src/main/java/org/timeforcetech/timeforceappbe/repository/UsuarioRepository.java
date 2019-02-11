package org.timeforcetech.timeforceappbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.timeforcetech.timeforceappbe.entity.Usuario;

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
     * @return todos los usuarios que no sean administradores ni superadministradores
     */
    List<Usuario> findAllByEsAdministradorFalseAndEsSuperAdministradorFalse();

    /**
     * READ
     * @return solo los administradores
     */
    List<Usuario> findAllByEsAdministradorTrue();

    /**
     * READ
     * @return solo los superAdministradores
     */
    List<Usuario> findAllByEsSuperAdministradorTrue();

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
    Optional<Usuario> findByNifAndClaveAccesoAndBaneadoFalse(String nif, String claveAcceso);

    Boolean existsUsuarioByNifAndClaveAccesoAndBaneadoIsFalse(String nif, String claveAcceso);


    /**
     * Elimina el usuario
     * @param idUsuario: Clave primaria Usuario
     */
    void deleteByIdUsuario(Long idUsuario);
}
