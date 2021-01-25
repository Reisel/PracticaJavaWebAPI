/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invertir;

import com.error.DetalleError;
import com.error.NombreInexistenteException;
import com.model.Cotizacion;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(serviceName="ConsultaSoap")
public class ConsultaSoap {
    
    @WebMethod(operationName="Hola")
    public String Hola (@WebParam(name="nombre") String nombre) {
        return "Hola " + nombre + "!!!";
    }
    
    @WebMethod(operationName="obtenerCotizaciones")
    public List<Cotizacion> obtenerCotizaciones(){
        ArrayList<Cotizacion> lst = new ArrayList<>();
        
        lst.add(new Cotizacion("AMAZON", 320d));
        lst.add(new Cotizacion("Google", 500d));
        lst.add(new Cotizacion("Dolar blue", 130d));
        return lst;
    }
    
    @WebMethod(operationName="provocarError")
    public String provocarError (@WebParam(name="name") String txt) throws NombreInexistenteException {
        if("federico".equals(txt)) {
            throw new NombreInexistenteException("federico", new DetalleError("500", "Inexistente"));
        }
        return "Hola " + txt + " !!!";
    }
}
