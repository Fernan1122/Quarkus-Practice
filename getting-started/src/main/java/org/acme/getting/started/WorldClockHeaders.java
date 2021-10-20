package org.acme.getting.started;

import javax.ws.rs.HeaderParam;

public class WorldClockHeaders {
    @HeaderParam("X-Logger")
    String logger;
}
