package org.timeforcetech.timeforceappbe.internal.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.timeforcetech.timeforceappbe.entity.Servicio;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class ServicioJsonDataBuilder {

    public static void main(String[] args) throws Exception {
        PodamFactory podamFactory = new PodamFactoryImpl();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        Servicio servicio = podamFactory.manufacturePojo(Servicio.class);
        servicio.setIdServicio(null);
        servicio.setOfertante(null);
        servicio.setConsumidor(null);
        System.out.println(mapper.writeValueAsString(servicio));
    }

}
