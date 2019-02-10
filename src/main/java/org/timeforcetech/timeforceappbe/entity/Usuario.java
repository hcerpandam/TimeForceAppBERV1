package org.timeforcetech.timeforceappbe.entity;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1020543092665927944L;

    //ATRIBUTOS DE LA CLASE/COLUMNAS DE LA TABLA

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(unique = true, length = 50, nullable = false)
    private String nif;

    @Column(name = "clave_acc",nullable = false)
    private String claveAcceso;

    @Column(name = "nombre_usu",nullable = false)
    private String nombreUsuario;

    @Column(nullable = false)
    private String apellidos;

    @Column(name = "fecha_nac",nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "tipo_via",nullable = false)
    private String tipoVia;

    @Column(name = "nombre_via",nullable = false)
    private String nombreVia;

    @Column(name = "numero_por",nullable = false)
    private int numeroPortal;

    private String escalera;

    private Integer puerta;

    @Column(nullable = false)
    private String localidad;

    @Column(nullable = false)
    private String provincia;

    @Column(name = "codigo_pos",nullable = false)
    private int codPostal;

    @Column(nullable = false)
    private int telefono;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    @ColumnDefault("2")
    private int balance;

    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean suspendido;

    @Column(name = "dias_sus")
    private int diasSuspension;

    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean baneado;

    @Column(name = "es_admin",nullable = false)
    @ColumnDefault("false")
    private boolean esAdministrador;

    @Column(name="es_supadmin",nullable = false)
    @ColumnDefault("false")
    private boolean esSuperAdministrador;


    //CONSTRUCTOR SIN ARGUMENTOS

    public Usuario(){}


    //GETTERS Y SETTERS

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public int getNumeroPortal() {
        return numeroPortal;
    }

    public void setNumeroPortal(int numeroPortal) {
        this.numeroPortal = numeroPortal;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public Integer getPuerta() {
        return puerta;
    }

    public void setPuerta(Integer puerta) {
        this.puerta = puerta;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isSuspendido() {
        return suspendido;
    }

    public void setSuspendido(boolean suspendido) {
        this.suspendido = suspendido;
    }

    public int getDiasSuspension() {
        return diasSuspension;
    }

    public void setDiasSuspension(int diasSuspension) {
        this.diasSuspension = diasSuspension;
    }

    public boolean isBaneado() {
        return baneado;
    }

    public void setBaneado(boolean baneado) {
        this.baneado = baneado;
    }

    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    public boolean isEsSuperAdministrador() {
        return esSuperAdministrador;
    }

    public void setEsSuperAdministrador(boolean esSuperAdministrador) {
        this.esSuperAdministrador = esSuperAdministrador;
    }
}