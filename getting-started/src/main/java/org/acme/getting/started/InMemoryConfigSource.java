package org.acme.getting.started;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.microprofile.config.spi.ConfigSource;

/** 
 * InMemoryConfigSource 
 */


public class InMemoryConfigSource implements ConfigSource {
    private Set<String> sete = new HashSet<>();
    private Map<String, String> prop = new HashMap<>();
    public InMemoryConfigSource(){
        this.prop.put("grettings.messages", "Memory Hello!!");
    }

    @Override
    public int getOrdinal(){
        return 0;
    }
    
    @Override
    public Map<String, String> getProperties() {
        return prop;
    }

    @Override
    public String getValue(String propertyName) {
        return prop.get(propertyName);
    }

    @Override
    public String getName() {
        return "InMemoryConfigSource";
    }

    @Override
    public Set<String> getPropertyNames() {
        return sete;
    }

}
