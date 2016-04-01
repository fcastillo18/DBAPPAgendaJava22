package com.pojos;
// Generated 01/04/2016 05:12:53 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TactividadParticipante generated by hbm2java
 */
public class TactividadParticipante  implements java.io.Serializable {


     private String codigoActividadParticipante;
     private Tactividad tactividad;
     private TusuarioAmigo tusuarioAmigo;
     private Date fechaRegistro;
     private Date fechaModificacion;

    public TactividadParticipante() {
    }

	
    public TactividadParticipante(String codigoActividadParticipante, Tactividad tactividad, TusuarioAmigo tusuarioAmigo) {
        this.codigoActividadParticipante = codigoActividadParticipante;
        this.tactividad = tactividad;
        this.tusuarioAmigo = tusuarioAmigo;
    }
    public TactividadParticipante(String codigoActividadParticipante, Tactividad tactividad, TusuarioAmigo tusuarioAmigo, Date fechaRegistro, Date fechaModificacion) {
       this.codigoActividadParticipante = codigoActividadParticipante;
       this.tactividad = tactividad;
       this.tusuarioAmigo = tusuarioAmigo;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
    }
   
    public String getCodigoActividadParticipante() {
        return this.codigoActividadParticipante;
    }
    
    public void setCodigoActividadParticipante(String codigoActividadParticipante) {
        this.codigoActividadParticipante = codigoActividadParticipante;
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


