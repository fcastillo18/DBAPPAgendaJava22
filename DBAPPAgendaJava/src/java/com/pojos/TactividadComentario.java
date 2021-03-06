package com.pojos;
// Generated 01/04/2016 05:12:53 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TactividadComentario generated by hbm2java
 */
public class TactividadComentario  implements java.io.Serializable {


     private String codigoActividadComentario;
     private Tactividad tactividad;
     private TusuarioAmigo tusuarioAmigo;
     private String comentario;
     private Date fechaRegistro;
     private Date fechaModificacion;

    public TactividadComentario() {
    }

	
    public TactividadComentario(String codigoActividadComentario, Tactividad tactividad, TusuarioAmigo tusuarioAmigo, String comentario) {
        this.codigoActividadComentario = codigoActividadComentario;
        this.tactividad = tactividad;
        this.tusuarioAmigo = tusuarioAmigo;
        this.comentario = comentario;
    }
    public TactividadComentario(String codigoActividadComentario, Tactividad tactividad, TusuarioAmigo tusuarioAmigo, String comentario, Date fechaRegistro, Date fechaModificacion) {
       this.codigoActividadComentario = codigoActividadComentario;
       this.tactividad = tactividad;
       this.tusuarioAmigo = tusuarioAmigo;
       this.comentario = comentario;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
    }
   
    public String getCodigoActividadComentario() {
        return this.codigoActividadComentario;
    }
    
    public void setCodigoActividadComentario(String codigoActividadComentario) {
        this.codigoActividadComentario = codigoActividadComentario;
    }
    public Tactividad getTactividad() {
        return this.tactividad;
    }
    
    public void setTactividad(Tactividad tactividad) {
        this.tactividad = tactividad;
    }
    public TusuarioAmigo getTusuarioAmigo() {
        return this.tusuarioAmigo;
    }
    
    public void setTusuarioAmigo(TusuarioAmigo tusuarioAmigo) {
        this.tusuarioAmigo = tusuarioAmigo;
    }
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
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




}


