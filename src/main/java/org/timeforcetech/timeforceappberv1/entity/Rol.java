package org.timeforcetech.timeforceappberv1.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Rol implements Serializable {

    private static final long serialVersionUID = -2967224974183698255L;

    //ATRIBUTOS DE LA CLASE/COLUMNAS DE LA TABLA

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name = "nombre_rol",unique = true, length = 50, nullable = false)
    private String nombreRol;


    //GETTERS/SETTERS

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}
