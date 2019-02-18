package org.timeforcetech.timeforceappberv1.entity;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Servicio implements Serializable {

    private static final long serialVersionUID = 4292328783067995491L;

    //ATRIBUTOS DE LA CLASE/COLUMNAS DE LA TABLA

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicio;

    @Column(nullable = false)
    private String categoria;

    @Column(name = "descripcion_ser",nullable = false)
    private String descServicio;

    @Column(name = "fecha_hora",nullable = false)
    private LocalDateTime fechaHora;

    @ManyToOne
    @JoinColumn(name = "ofertante_id", nullable = false)
    private Usuario ofertante;

    @ManyToOne
    @JoinColumn(name = "consumidor_id")
    private Usuario consumidor;

    @Column(name = "localizacion_acor",nullable = false)
    @ColumnDefault("3")
    private String localizacionAcordada;

    private String valoracion;

    private String mensaje;

    @Column(nullable = false)
    @ColumnDefault("0")
    private int precio;

    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean cancelado;

    //GETTERS/SETTERS

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescServicio() {
        return descServicio;
    }

    public void setDescServicio(String descServicio) {
        this.descServicio = descServicio;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Usuario getOfertante() {
        return ofertante;
    }

    public void setOfertante(Usuario ofertante) {
        this.ofertante = ofertante;
    }

    public Usuario getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Usuario consumidor) {
        this.consumidor = consumidor;
    }

    public String getLocalizacionAcordada() {
        return localizacionAcordada;
    }

    public void setLocalizacionAcordada(String localizacionAcordada) {
        this.localizacionAcordada = localizacionAcordada;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }
}
