/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.error;

public class DetalleError {
    
    private String codigoError;
    private String descError;

    public DetalleError(String codigoError, String descError) {
        this.codigoError = codigoError;
        this.descError = descError;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescError() {
        return descError;
    }

    public void setDescError(String descError) {
        this.descError = descError;
    }
    
    
    
}
