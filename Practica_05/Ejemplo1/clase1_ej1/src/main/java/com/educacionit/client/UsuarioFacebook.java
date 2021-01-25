/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.client;

import com.educacionit.entities.Usuario;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.glassfish.jersey.client.ClientConfig;


public class UsuarioFacebook {
    
    public static Usuario getUsuario(String token) throws JSONException{
    
        String URL_BASE_API = "https://graph.facebook.com/v7.0/me?fields=id%2Cname%2Clast_name&access_token=" + token;
        
        Usuario u = new Usuario();
        
        Client client = ClientBuilder.newClient(
                new ClientConfig().register(JacksonJsonProvider.class));
        
        WebTarget webTarget = client.target(URL_BASE_API);
        
        String respuesta = webTarget
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
        
        //System.out.println(respuesta);
        
        JSONObject jsonObject = new JSONObject(respuesta);
        u.setNombre(jsonObject.getString("name"));
        u.setApellido(jsonObject.getString("last_name"));
        u.setPassword(token);
        
        System.out.println(u);
        
        return u;
        
    }
    
    public static void main(String[] args) throws JSONException {
        getUsuario("EAAEqElgZC0XMBAJRtMYiITTTDSiUXQ2c5CIYQGCURfbJkWzkU1pR9T1i2RIdSxGl7LzGnmr7lBTDISv9RHR9v4oSHCOmZAZBIxYQvOfNMiLStCvk6hLo4XaMWz4mnJiVBQaKFZCZACTHDFKDgC0JBKa2jextQoT9ZB8hC8gfALo1ofEgADgtAfwtsLJEW7nLgZD");
    }
    
}


// "https://graph.facebook.com/v7.0/me?fields=id%2Cname%2Clast_name&access_token=EAAEqElgZC0XMBAJRtMYiITTTDSiUXQ2c5CIYQGCURfbJkWzkU1pR9T1i2RIdSxGl7LzGnmr7lBTDISv9RHR9v4oSHCOmZAZBIxYQvOfNMiLStCvk6hLo4XaMWz4mnJiVBQaKFZCZACTHDFKDgC0JBKa2jextQoT9ZB8hC8gfALo1ofEgADgtAfwtsLJEW7nLgZD"

