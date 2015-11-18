package com.unicss;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/readerService/{name}/{password}")
public class ReaderService {
	@GET  
    @Produces(MediaType.APPLICATION_JSON)  
    public Reader getReader(@PathParam("name") String name,@PathParam("password") String password) {  
        return new Reader(name,password);  
    }
}
