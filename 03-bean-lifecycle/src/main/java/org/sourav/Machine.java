package org.sourav;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Machine {

    public Machine() {
        System.out.println(" singleton Object created");
    }
    @PostConstruct
    public void Init(){
        System.out.println("singleton Init called");
    }
    @PreDestroy
    public void Destroy(){
        System.out.println("singleton Destroy called");
    }

}
