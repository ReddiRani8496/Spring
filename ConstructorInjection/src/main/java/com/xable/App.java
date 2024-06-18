package com.xable;

import com.xable.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        // the name of the bean by default method name
//        Desktop desktop = appContext.getBean("desktop",Desktop.class);

        // in annotation specifying the bean name
        Desktop desktop = appContext.getBean("desk",Desktop.class);
        desktop.compile();

        // because in annotations we specified scope as prototype two objs created
        Desktop desktop1 = appContext.getBean("desk",Desktop.class);
        desktop1.compile();



        // Employee obj using annotations
        Employee emp = appContext.getBean(Employee.class);
        emp.code();











//        ApplicationContext ctx =new ClassPathXmlApplicationContext("spring.xml");

        // Because scope is singleton only one object is created and shared
//        Employee e1 = (Employee) ctx.getBean("emp");
//        System.out.println(e1.getSalary());
//        e1.code();
//
//        Employee e2 = ctx.getBean("emp",Employee.class);
//        e2.code();
    }
}
