package org.timeforcetech.timeforceappberv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.timeforcetech.timeforceappberv1.entity.Servicio;

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

    @Query(nativeQuery = true, value="SELECT id_servicio, categoria, fecha_hora, consumidor_id, valoracion, localizacion_acor, cancelado FROM servicio WHERE ofertante_id=:ofertante")
    List<Servicio> findMiConsultaEspecifica(@Param("ofertante") Long idUsuario);



}
