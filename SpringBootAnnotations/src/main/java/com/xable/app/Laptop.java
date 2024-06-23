package com.xable.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Autowired
    CPU cpu;
    public void compile(){
        System.out.println("compiling in laptop...");
        cpu.execute();
    }
}
