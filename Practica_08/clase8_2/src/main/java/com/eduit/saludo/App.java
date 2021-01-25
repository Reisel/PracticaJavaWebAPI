package com.eduit.saludo;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //get("/hello", (req, res) -> "Hola Spark. saludos desde casa");
        
        //get("/hello", (req, res) -> "Hola " + req.queryParams("name"));
        
        get("/hello", (req, res) -> 
        {
            res.status(200);
            res.type("application/json");
            return "{message: 'Hola " + req.queryParams("name") + "'}";
            
        });
    }
}
    

