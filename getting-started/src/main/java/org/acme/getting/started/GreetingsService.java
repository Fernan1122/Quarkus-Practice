package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingsService {
    public String toUpperCase (String msj){
        return msj.toUpperCase();
    }
}
