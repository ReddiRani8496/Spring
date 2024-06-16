package com.xable.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootDemoApplication.class, args);
//		System.out.println("Hello World");
////     we are manually creating the object
//		Employee e1 = new Employee();
//		e1.code();

		// object creation using ioc
		ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);
		Employee e = context.getBean(Employee.class);
		e.code();

//		Laptop laptop = context.getBean(Laptop.class);
//		laptop.compile();
	}

}
