package org.acme.getting.started;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

@Path("/beer")
public class GreetingResource2 {
    
    Logger logger = Logger.getLogger(GreetingResource2.class);

    @Inject
    @RestClient
    WorldClockService worldclockservice;

    @ConfigProperty(name = "grettings.messages")
    String msg;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBeer(@Valid Beer beer){
        System.out.println(beer);
        return Response.ok().build();
        
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public WorldClock getNow() {
        WorldClockHeaders worldclockHeaders = new WorldClockHeaders();
        worldclockHeaders.logger="DEBUG";
        logger.debug("Hello desde loger");
        return worldclockservice.getNow(worldclockHeaders);
    }
}
