package org.timeforcetech.timeforceappberv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.timeforcetech.timeforceappberv1.entity.Rol;
import org.timeforcetech.timeforceappberv1.entity.Usuario;
import org.timeforcetech.timeforceappberv1.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired  //Inyección de dependencias: Spring instancia automaticamente controllers, services y dao y los pone donde esté la anotacion @autowired
    private final UsuarioRepository usuarioRepository;

    /**
     * Constructor
     * @param usuarioRepository: Atributo de tipo UsuarioRepository
     */
    public UsuarioController(UsuarioRepository usuarioRepository) { this.usuarioRepository = usuarioRepository; }

    /**
     * CREATE: Registro de usuarios
     * @param newUsuario: Objeto de tipo Usuario
     * @return un nuevo usuario que hemos creado
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/registro")
    Usuario createUsuario(@RequestBody Usuario newUsuario) {
        if(newUsuario.getRol() == null){
            Rol rol = new Rol();
            rol.setIdRol(1);
            newUsuario.setRol(rol);
        }if(newUsuario.getBalance()==0){
            newUsuario.setBalance(2);
        }
        return usuarioRepository.save(newUsuario);
    }


    /**
     * READ
     * Spring devuelve todos los objetos como un JSON
     * @return listado con todos los usuarios
     */
    @GetMapping("/usuarios")
    List<Usuario> readAll() {
        return usuarioRepository.findAll();
    }

    /**
     * READ
     * @param id: Clave primaria de Usuario
     * @return el usuario cuya Id se pasa por parámetro o un mensaje de excepción si no existe
     */
    @GetMapping("/usuarios/{id}")
    Usuario readOneId(@PathVariable Long id) {
        return usuarioRepository.findByIdUsuario(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El usuario con id %s no existe", id)));
    }


    @GetMapping(value ="/login")
    Usuario findByNifAndClaveAccesoAndBaneadoFalseAndSuspendidoFalse(@RequestBody Usuario usuario) {
        return usuarioRepository.findByNifAndClaveAccesoAndBaneadoFalseAndSuspendidoFalse(usuario.getNif(),usuario.getClaveAcceso())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, ("El usuario no existe")));
    }

    /**
     * UPDATE
     * @param newUsuario: Objeto Usuario que vamos a modificar
     * @param id: Clave primaria del usuario
     * @return El usuario modificado si encuentra un usuario con dicha clave primaria o un mensaje de excepción
     */
   @PutMapping("/{id}")
    Usuario updateUsuario(@RequestBody Usuario newUsuario, @PathVariable Long id) {
        return usuarioRepository.findByIdUsuario(id)
                .map(usuario -> {
                    usuario.setNif(newUsuario.getNif());
                    usuario.setClaveAcceso(newUsuario.getClaveAcceso());
                    usuario.setNombre(newUsuario.getNombre());
                    usuario.setApellidos(newUsuario.getApellidos());
                    usuario.setFechaNacimiento(newUsuario.getFechaNacimiento());
                    usuario.setRol(newUsuario.getRol());
                    usuario.setTipoVia(newUsuario.getTipoVia());
                    usuario.setNombreVia(newUsuario.getNombreVia());
                    usuario.setNumeroPortal(newUsuario.getNumeroPortal());
                    usuario.setEscalera(newUsuario.getEscalera());
                    usuario.setPuerta(newUsuario.getPuerta());
                    usuario.setLocalidad(newUsuario.getLocalidad());
                    usuario.setProvincia(newUsuario.getProvincia());
                    usuario.setCodPostal(newUsuario.getCodPostal());
                    usuario.setTelefono(newUsuario.getTelefono());
                    usuario.setMail(newUsuario.getMail());
                    usuario.setBalance(newUsuario.getBalance());
                    usuario.setSuspendido(newUsuario.isSuspendido());
                    usuario.setDiasSuspension(newUsuario.getDiasSuspension());
                    usuario.setBaneado(newUsuario.isBaneado());
                    usuario.setApellidos(newUsuario.getApellidos());
                    return usuarioRepository.save(usuario);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El usuario con id %s no existe", id)));
    }

    /**
     * DELETE
     * Borra el usuario cuya Id se pasa por parámetro
     * @param id: Clave primaria del usuario
     */
    @DeleteMapping("/{id}")
    void deleteUsuario(@PathVariable Long id) {
        usuarioRepository.deleteByIdUsuario(id);
    }


}
