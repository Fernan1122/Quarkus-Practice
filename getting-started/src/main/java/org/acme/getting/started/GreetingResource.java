package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import org.jboss.logging.Logger;

@Path("/hello")
public class GreetingResource {

    Logger logger = Logger.getLogger(GreetingResource.class);

    @ConfigProperty(name = "grettings.messages")
    String msg;

    @Inject
    GreetingsService service;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return service.toUpperCase(msg);
    }
}