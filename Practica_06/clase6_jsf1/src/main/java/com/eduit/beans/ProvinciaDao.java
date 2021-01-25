/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.beans;

import com.eduit.base.AdministradorDeConexiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProvinciaDao {
    
    public static ArrayList<Provincia> getProvincias() {
        Provincia p = new Provincia();
        p.setIdProvincia(1);
        p.setDescripcion("Cordoba");
        
        Provincia p1 = new Provincia();
        p1.setIdProvincia(2);
        p1.setDescripcion("Santa Fe");
        
        Provincia p2 = new Provincia();
        p2.setIdProvincia(3);
        p2.setDescripcion("Mendoza");
        
        ArrayList<Provincia> lista = new ArrayList<Provincia>();
        lista.add(p);
        lista.add(p1);
        lista.add(p2);
        
        return lista;
    }
    
    
    public static ArrayList<Provincia> getProvincias2() {
        
        ArrayList<Provincia> provincias = new  ArrayList<Provincia>();
        
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try {
            con = AdministradorDeConexiones.obtenerConexion();
            String sql = "select * from Provincia";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Provincia p = new Provincia();
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                p.setIdProvincia(codigo);
                p.setDescripcion(nombre);
                provincias.add(p);                
            }
        } catch (Exception ex) {
            Logger.getLogger(ProvinciaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProvinciaDao.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        
        return provincias;    
    }
    
}
