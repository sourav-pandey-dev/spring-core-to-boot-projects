package org.sourav;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AnotherMachine {

    public AnotherMachine() {
        System.out.println(" prototype Object created");
    }
    @PostConstruct
    public void Init(){
        System.out.println("prototype Init called");
    }
    @PreDestroy
    public void Destroy(){
        System.out.println("prototype Destroy called");
    }

}
