package org.timeforcetech.timeforceappberv1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.timeforcetech.timeforceappberv1.entity.Usuario;
import org.timeforcetech.timeforceappberv1.repository.UsuarioRepository;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "*"})
@RequestMapping("/login")
public class LoginController {

    private final UsuarioRepository usuarioRepository;

    public LoginController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @PreAuthorize("permitAll()")
    @GetMapping
    public Usuario login(Principal principal) {
        return usuarioRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El usuario %s no existe", principal.getName())));
    }

    @RequestMapping("/usuariolog")
    public Principal usuariolog(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization").substring("Basic" .length()).trim();
        return () -> new String(Base64.getDecoder().decode(authToken)).split(":")[0];
    }

}