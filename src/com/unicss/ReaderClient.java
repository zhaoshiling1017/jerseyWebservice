package com.unicss;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class ReaderClient {
	public static void main(String[] args) {  
        Client client = Client.create();  
        WebResource resource = client.resource("http://127.0.0.1:8080/jerseyWebservice");
        WebResource readerResource = resource.path("rest").path("/readerService/shun/123213");
        //Reader reader = resource.accept(MediaType.APPLICATION_JSON).get(Reader.class);  
        String reader = readerResource.accept(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println(reader);  
    }  
}
