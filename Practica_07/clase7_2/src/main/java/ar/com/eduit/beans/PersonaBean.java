/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.beans;

import ar.com.eduit.entities.Persona;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;



@ManagedBean
public class PersonaBean {
    
    //private ArrayList<Persona> listPersonas;  comentamos para seguir con 2da parte del lab
    
    private static ArrayList<Persona> listPersonas = new ArrayList<>();  // ponemos static para poder manipular la lista
    private Persona miPersona;

    public PersonaBean() {
//        listPersonas = new ArrayList<>();
//        listPersonas.add(new Persona("Luis","Pardo",35,"Medico",55000,"M"));
//        listPersonas.add(new Persona("Pedro","Zapata",36,"Abogado",58000,"M"));
//        listPersonas.add(new Persona("Jose","Flores",30,"Contador",50000,"M"));
//        listPersonas.add(new Persona("Lorena","Ponce",36,"Abogada",58000,"F"));
//        listPersonas.add(new Persona("Florencia","Meza",31,"Medica",55000,"F"));
            
            //2da parte del laboratorio gestion de la tabla
            
            miPersona = new Persona();
    }

    public ArrayList<Persona> getListPersonas() {
        return listPersonas;
    }

    public Persona getMiPersona() {
        return miPersona;
    }

    public void setMiPersona(Persona miPersona) {
        this.miPersona = miPersona;
    }
    
    public void agregarPersona(){
        listPersonas.add(miPersona);
        miPersona = new Persona(); // limpiamos el objeto
    }
    
    public void eliminarPersona(Persona p) {
        listPersonas.remove(p);
    }
    
    //Comento -> 2da parte del laboratorio gestion de la tabla
    
//    public void setListPersonas(ArrayList<Persona> listPersonas) {
//        this.listPersonas = listPersonas;
//    }
//    
    
    // tercera parte editar
    public void editarPersona(Persona p){
        p.setEditar(true);
    }
    public void guardarPersona(){
        
        for(Persona p : listPersonas){
            p.setEditar(false);
        }
    }
    
}
