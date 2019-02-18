package org.timeforcetech.timeforceappberv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.timeforcetech.timeforceappberv1.entity.Servicio;

import java.util.List;
import java.util.Optional;

import static org.hibernate.loader.Loader.SELECT;

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

    List<Servicio> findByOfertanteIdUsuario(Long idUsuario);

    List<Servicio> findByConsumidorIdUsuario(Long idUsuario);

    //@Query(nativeQuery = true, value="SELECT ofertante_id, fecha_hora, categoria, descripcion_ser, precio  FROM SERVICIO, USUARIO u WHERE fecha_hora>CURRENT_TIMESTAMP  AND consumidor_id IS NULL AND u.provincia LIKE 'Sevilla' AND (categoria LIKE '%guitarra%' OR descripcion_ser LIKE '%guitarra%')")
    //List<Servicio> findMiconsultaEspecifica3 (@Param("nombre") String nombre, @Param("id") Long id);

    @Query(nativeQuery = true, value="SELECT ofertante_id, fecha_hora, categoria, descripcion_ser, precio  FROM SERVICIO WHERE categoria=:palabra OR descripcion_ser=:palabra")
    List<Servicio> findMiconsultaEspecifica3 (@Param("palabra") String palabra);



}
