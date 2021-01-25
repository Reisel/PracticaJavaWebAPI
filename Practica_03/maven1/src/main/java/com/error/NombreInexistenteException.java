/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.error;

import javax.xml.ws.WebFault;


@WebFault(name="NombreInexistenteException")
public class NombreInexistenteException extends Exception {
    
    private DetalleError faultInfo;

    public NombreInexistenteException() {
    }

    public NombreInexistenteException(String message, DetalleError faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public NombreInexistenteException(String message, DetalleError faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public DetalleError getFaultInfo() {
        return faultInfo;
    }  
    
}
