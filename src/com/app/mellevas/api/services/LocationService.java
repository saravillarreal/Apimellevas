package com.app.mellevas.api.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by Sara Villarreal on 4/13/2016.
 */

@Path("/hello")
public class LocationService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }

    @POST
    public Response saveName(){
        String output = "Jersey say : " + "NAMESARA";

        return Response.status(200).entity(output).build();
    }
}