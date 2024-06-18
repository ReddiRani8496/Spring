package com.xable.config;

import com.xable.Desktop;
import com.xable.Employee;
import com.xable.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "desk") //this will be bean name
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Employee employee(){
        Employee e = new Employee();
        e.setSalary(5000);
        e.setDesktop(desktop());
        e.setLap(laptop());
        return e;
    }

    public Laptop laptop(){
        return new Laptop();
    }
}
