/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;


public class Cotizacion {
    
    private String nombre;
    private Double cotizacion;

    public Cotizacion() {
    }

    public Cotizacion(String nombre, Double cotizacion) {
        this.nombre = nombre;
        this.cotizacion = cotizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Double cotizacion) {
        this.cotizacion = cotizacion;
    }
    
    
    
}
