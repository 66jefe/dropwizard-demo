package com.developersfun.resources;

import com.developersfun.entity.HelloEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

//Primeiro end point da classe
@Path("/olamundo")
public class HelloResources {

    private static final String CHARSET_UTF8 = ";charset=utf-8;";

    //Segundo end point do metodo
    @GET
    @Path("/saudacao")
    @Produces(MediaType.APPLICATION_JSON + CHARSET_UTF8)
    public String helloDropwizard(){
        return new HelloEntity().getOla();
    }
}
