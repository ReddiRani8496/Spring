package com.xable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
public class Desktop {
    public Desktop(){
        System.out.println("Desktop Object");
    }


    public void compile() {
        System.out.println("desktop");
    }
}

// @component is used to specify the spring to create the object of this class
