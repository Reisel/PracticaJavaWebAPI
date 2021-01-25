/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.base;

import java.sql.Connection;
import java.sql.DriverManager;


public class AdministradorDeConexiones {
    
    public static Connection obtenerConexion() throws Exception {
        
        String dbDriver = "com.mysql.jdbc.Driver";
        
        String dbConnString = "jdbc:mysql://localhost/demo";
        String dbUser = "root";
        String dbPassword="";
        
        Class.forName(dbDriver).newInstance();
        
        Connection conn = DriverManager.getConnection(dbConnString, dbUser, dbPassword);
        return conn;
    
    }
    
}
