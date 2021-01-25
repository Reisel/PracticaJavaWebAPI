/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="alumnoManagedBean")
@SessionScoped
public class AlumnoManagedBean {
    
    private Alumno alumno = new Alumno();
    private ArrayList<Provincia> provincias;
    private Integer idProvincia=0;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }  

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }
    
    
      
    public String registrar() {
        return "registrado";
    }
    
    public String preCargar() {
        provincias = ProvinciaDao.getProvincias2();
        return "alumno";
    }
    
    
}
