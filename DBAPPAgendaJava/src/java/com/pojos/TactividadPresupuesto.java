package com.pojos;
// Generated 01/04/2016 05:12:53 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * TactividadPresupuesto generated by hbm2java
 */
public class TactividadPresupuesto  implements java.io.Serializable {


     private String codigoActividadPresupuesto;
     private Tactividad tactividad;
     private TunidadMedida tunidadMedida;
     private String descripcion;
     private BigDecimal precioUnitario;
     private double cantidad;
     private Date fechaRegistro;
     private Date fechaModificacion;

    public TactividadPresupuesto() {
    }

	
    public TactividadPresupuesto(String codigoActividadPresupuesto, Tactividad tactividad, TunidadMedida tunidadMedida, String descripcion, BigDecimal precioUnitario, double cantidad) {
        this.codigoActividadPresupuesto = codigoActividadPresupuesto;
        this.tactividad = tactividad;
        this.tunidadMedida = tunidadMedida;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
    public TactividadPresupuesto(String codigoActividadPresupuesto, Tactividad tactividad, TunidadMedida tunidadMedida, String descripcion, BigDecimal precioUnitario, double cantidad, Date fechaRegistro, Date fechaModificacion) {
       this.codigoActividadPresupuesto = codigoActividadPresupuesto;
       this.tactividad = tactividad;
       this.tunidadMedida = tunidadMedida;
       this.descripcion = descripcion;
       this.precioUnitario = precioUnitario;
       this.cantidad = cantidad;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
    }
   
    public String getCodigoActividadPresupuesto() {
        return this.codigoActividadPresupuesto;
    }
    
    public void setCodigoActividadPresupuesto(String codigoActividadPresupuesto) {
        this.codigoActividadPresupuesto = codigoActividadPresupuesto;
    }
    public Tactividad getTactividad() {
        return this.tactividad;
    }
    
    public void setTactividad(Tactividad tactividad) {
        this.tactividad = tactividad;
    }
    public TunidadMedida getTunidadMedida() {
        return this.tunidadMedida;
    }
    
    public void setTunidadMedida(TunidadMedida tunidadMedida) {
        this.tunidadMedida = tunidadMedida;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public double getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
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


