package com.xable.app;

import com.xable.app.model.Employee;
import com.xable.app.model.Laptop;
import com.xable.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {


		// object creation using ioc
		ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
