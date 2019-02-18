package org.timeforcetech.timeforceappberv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.timeforcetech.timeforceappberv1.entity.Servicio;
import org.timeforcetech.timeforceappberv1.repository.ServicioRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:4200","*" })
@RequestMapping("/api/servicios")
public class ServicioController {

    @Autowired //Inyección de dependencias: Spring instancia automaticamente controllers, services y dao y los pone donde esté la anotacion @autowired
    private final ServicioRepository servicioRepository;

    /**
     * Invoca al Repository
     * Constructor
     * @param servicioRepository: Atributo de tipo UsuarioRepository
     */
    public ServicioController(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    /**
     * CREATE
     * @param newServicio: Objeto de tipo Usuario
     * @return Un nuevo servicio que hemos creado
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Servicio createServicio(@RequestBody Servicio newServicio) {
        if(newServicio.getLocalizacionAcordada()==null){
            newServicio.setLocalizacionAcordada("3");
        }
        return servicioRepository.save(newServicio);
    }


    /**
     * READ
     * Spring devuelve todos los objetos como un JSON
     * @return listado con todos los servicios
     */
    /*@GetMapping
    List<Servicio> readAll() {
        return servicioRepository.findAll();
    }*/

    @GetMapping("/ofertante/{id}")
    List<Servicio> findMiConsultaEspecifica(@PathVariable Long id){ return servicioRepository.findByOfertanteIdUsuario(id);}

    @GetMapping("/consumidor/{id}")
    List<Servicio> findMiConsultaEspecifica2(@PathVariable Long id){ return servicioRepository.findByConsumidorIdUsuario(id);}

    @GetMapping("/buscadorservicios/{palabra}")
    List<Servicio> findMiconsultaEspecifica3(@PathVariable String palabra){return servicioRepository.findMiconsultaEspecifica3(palabra);}



    /**
     * READ
     * @param id: Clave primaria de Servicio
     * @return el servicio cuya Id se pasa por parámetro o un mensaje de excepción si no existe
     */
    @GetMapping("/{id}")
    Servicio readOneId(@PathVariable Long id) {
        return servicioRepository.findByIdServicio(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El servicio con id %s no existe", id)));
    }


    /**
     * UPDATE
     * @param newServicio: Objeto servicio que vamos a modificar
     * @param id: Clave primaria del servicio
     * @return El servicio modificado si encuentra un servicio con dicha clave primaria o un mensaje de excepción
     */
    @PutMapping("/{id}")
    Servicio updateServicio(@RequestBody Servicio newServicio, @PathVariable Long id) {
        return servicioRepository.findByIdServicio(id)
                .map(servicio -> {
                    servicio.setCategoria(newServicio.getCategoria());
                    servicio.setDescServicio(newServicio.getDescServicio());
                    servicio.setFechaHora(newServicio.getFechaHora());
                    servicio.setOfertante(newServicio.getOfertante());
                    servicio.setConsumidor(newServicio.getConsumidor());
                    servicio.setLocalizacionAcordada(newServicio.getLocalizacionAcordada());
                    servicio.setValoracion(newServicio.getValoracion());
                    servicio.setMensaje(newServicio.getMensaje());
                    servicio.setPrecio(newServicio.getPrecio());
                    servicio.setCancelado(newServicio.isCancelado());
                    return servicioRepository.save(servicio);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El servicio con id %s no existe", id)));
    }

    /**
     * UPDATE
     */
    @PostMapping("/cancelar/{id}")
    Servicio cancelServicio(@PathVariable Long id){
        Servicio servicio=servicioRepository.findByIdServicio(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El servicio con id %s no existe", id)));
        servicio.setCancelado(true);
        return servicioRepository.save(servicio);
    }


    /**
     * DELETE
     * @param id: Clave primaria del servicio
     */
    @DeleteMapping("/{id}")
    void deleteServicio(@PathVariable Long id) {
        servicioRepository.deleteById(id);
    }

}
