package com.pojos;
// Generated 01/04/2016 05:12:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TusuarioAmigo generated by hbm2java
 */
public class TusuarioAmigo  implements java.io.Serializable {


     private String codigoUsuarioAmigo;
     private Tusuario tusuario;
     private String nombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String correoElectronico;
     private String contrasenia;
     private Date fechaNacimiento;
     private char sexo;
     private String telefono;
     private Date fechaRegistro;
     private Date fechaModificacion;
     private Set tusuarioAmigoTelefonos = new HashSet(0);
     private Set tactividadComentarios = new HashSet(0);
     private Set tactividadParticipantes = new HashSet(0);

    public TusuarioAmigo() {
    }

	
    public TusuarioAmigo(String codigoUsuarioAmigo, Tusuario tusuario, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String contrasenia, Date fechaNacimiento, char sexo, String telefono) {
        this.codigoUsuarioAmigo = codigoUsuarioAmigo;
        this.tusuario = tusuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
    }
    public TusuarioAmigo(String codigoUsuarioAmigo, Tusuario tusuario, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String contrasenia, Date fechaNacimiento, char sexo, String telefono, Date fechaRegistro, Date fechaModificacion, Set tusuarioAmigoTelefonos, Set tactividadComentarios, Set tactividadParticipantes) {
       this.codigoUsuarioAmigo = codigoUsuarioAmigo;
       this.tusuario = tusuario;
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.correoElectronico = correoElectronico;
       this.contrasenia = contrasenia;
       this.fechaNacimiento = fechaNacimiento;
       this.sexo = sexo;
       this.telefono = telefono;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
       this.tusuarioAmigoTelefonos = tusuarioAmigoTelefonos;
       this.tactividadComentarios = tactividadComentarios;
       this.tactividadParticipantes = tactividadParticipantes;
    }
   
    public String getCodigoUsuarioAmigo() {
        return this.codigoUsuarioAmigo;
    }
    
    public void setCodigoUsuarioAmigo(String codigoUsuarioAmigo) {
        this.codigoUsuarioAmigo = codigoUsuarioAmigo;
    }
    public Tusuario getTusuario() {
        return this.tusuario;
    }
    
    public void setTusuario(Tusuario tusuario) {
        this.tusuario = tusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set getTusuarioAmigoTelefonos() {
        return this.tusuarioAmigoTelefonos;
    }
    
    public void setTusuarioAmigoTelefonos(Set tusuarioAmigoTelefonos) {
        this.tusuarioAmigoTelefonos = tusuarioAmigoTelefonos;
    }
    public Set getTactividadComentarios() {
        return this.tactividadComentarios;
    }
    
    public void setTactividadComentarios(Set tactividadComentarios) {
        this.tactividadComentarios = tactividadComentarios;
    }
    public Set getTactividadParticipantes() {
        return this.tactividadParticipantes;
    }
    
    public void setTactividadParticipantes(Set tactividadParticipantes) {
        this.tactividadParticipantes = tactividadParticipantes;
    }




}


