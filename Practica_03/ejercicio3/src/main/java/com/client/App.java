package com.client;

import com.invertir.ConsultaSoap;
import com.invertir.ConsultaSoap_Service;
import com.invertir.Cotizacion;
import com.invertir.NombreInexistenteException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConsultaSoap_Service servicio = new ConsultaSoap_Service();
        ConsultaSoap consSoap = servicio.getConsultaSoapPort();
        
        String respuesta = consSoap.hola("Florencia");
        
        System.out.println(respuesta);
        
        for (Cotizacion ct : consSoap.obtenerCotizaciones()){
            System.out.println(ct.getNombre());
            System.out.println(ct.getCotizacion());
            System.out.println("");
        }
        
        try {
            System.out.println("----EXCEPCION------");
            respuesta = consSoap.provocarError("pepe");
            System.out.println(respuesta);
        } catch(NombreInexistenteException ex){
            System.out.println(ex.getFaultInfo().getCodigoError());
            System.out.println(ex.getFaultInfo().getDescError());
        }
        
    }
}
