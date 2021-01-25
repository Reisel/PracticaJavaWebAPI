/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.client;

import com.eduit.entities.Categoria;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import java.util.ArrayList;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.glassfish.jersey.client.ClientConfig;


public class ApiMercadoLibre {
    
    private static final String URL_BASE_API =
            "https://api.mercadolibre.com/sites/MLA/categories";
    
    public static ArrayList<Categoria> getCategorias() throws JSONException {
        
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        
        Client client = ClientBuilder.newClient(
                new ClientConfig().register(JacksonJsonProvider.class));
        
        WebTarget webTarget = client.target(URL_BASE_API);
        
        String respuesta = webTarget
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
        
        JSONArray jsonArray = new JSONArray(respuesta);
        
        //System.out.println("jsonArray: " + jsonArray);
        
        for(int i=0; i < jsonArray.length(); i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Categoria cat = new Categoria(jsonObject.getString("id"), jsonObject.getString("name"));
            categorias.add(cat);
        }
        
        return categorias;
    
    }
    
    public static void main(String[] args) throws JSONException {
        System.out.println(getCategorias());
    }
    
}
