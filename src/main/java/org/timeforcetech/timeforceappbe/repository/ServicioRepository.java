package org.timeforcetech.timeforceappbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.timeforcetech.timeforceappbe.entity.Servicio;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {

    /**
     * READ
     * @return todos los servicios
     */
    List<Servicio> findAll();

    /**
     * READ
     * Optional evita los null.pointer
     * @param id: Clave primaria Servicio
     * @return el Usuario con esa Id
     */
    Optional<Servicio> findByIdServicio(Long id);

}
