package com.unicss;

import java.io.IOException;
import java.net.URISyntaxException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class ReaderServer {
	public static void main(String[] args) throws IllegalArgumentException, IOException, URISyntaxException {  
        HttpServer server = HttpServerFactory.create("http://localhost:8080/");  
        server.start();  
    }  
}
