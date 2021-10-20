package org.acme.getting.started;

import java.time.LocalDate;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Beer {
    @NotNull
    @NotBlank
    private String name;
   
    @NotExpired
    @JsonbDateFormat("yyyy-MM-dd")
    private LocalDate expire;
    
    @Min(100)
    private int capacity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Beer [capacity=" + capacity + ", name=" + name + "]";
    }
    public Beer(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public LocalDate getExpire() {
        return expire;
    }
    public void setExpire(LocalDate expire) {
        this.expire = expire;
    }
    public Beer() {}
    
}
