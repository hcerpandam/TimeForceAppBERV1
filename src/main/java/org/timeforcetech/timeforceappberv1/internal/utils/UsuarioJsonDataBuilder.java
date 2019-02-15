package org.timeforcetech.timeforceappberv1.internal.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.timeforcetech.timeforceappberv1.entity.Usuario;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class UsuarioJsonDataBuilder {

    public static void main(String[] args) throws Exception {
        PodamFactory podamFactory = new PodamFactoryImpl();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        Usuario usuario = podamFactory.manufacturePojo(Usuario.class);
        usuario.setIdUsuario(null);
        System.out.println(mapper.writeValueAsString(usuario));
    }
}
