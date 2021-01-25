/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.edu.service;

import ar.com.edu.model.Person;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/AuthorService")
public class AuthorService {
    
    static List listPerson = new ArrayList();
    
    @POST
    @Path("/authors")
    @Consumes({"application/xml", "application/json"})
    public Response guardar(Person p) {
        p.setId(listPerson.size() + 1);
        listPerson.add(p);
        return Response.ok(p).build();
    }
    
    @GET
    @Path("/authors")
    @Produces(MediaType.APPLICATION_JSON)
    public List getListPerson() {
        return listPerson;
    }
    
    @PUT
    @Path("/authors")
    @Consumes({"application/xml", "application/json"})
    public Person actualizar(Person p){
        Person per = null;
        for(Object i : listPerson) {
            per = (Person) i;
            if (per.getId() == p.getId()) {
                per.setName(p.getName());
                return per;
            }
        }
        return per;
    }
    
    @DELETE
    @Path("/authors/{id}")
    public Response remove(@PathParam("id") int id){
        Person per = null;
        for(Object i : listPerson) {
            per = (Person) i;
            if (per.getId() == id) {
                listPerson.remove(per);
                return Response.status(200).build();
            }
        }
        return Response.status(200).build();
    }
    
}
