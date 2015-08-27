package com.javacodegeeks.enterprise.rest.jersey;


import java.io.File;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;


@Path("/helloWorldREST")
public class HelloWorldREST
{
    private static String TXT_FILE = "C:\\testFile.txt";


    @GET
    @Path("/{parameter}")
    public Response responseMsg(@PathParam("parameter") String parameter,
                                @DefaultValue("Nothing to say") @QueryParam("value") String value)
    {

        String output = "Hello from: " + parameter + " : " + value;

        return Response.status(200).entity(output).build();

    }


    @GET
    @Path("/txt")
    @Produces("text/plain")
    public Response getTextFile()
    {

        File file = new File(TXT_FILE);

        ResponseBuilder response = Response.ok((Object)file);
        response.header("Content-Disposition", "attachment; filename=\"test_text_file.txt\"");
        return response.build();

    }

}
