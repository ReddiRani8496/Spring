package com.xable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("spring.xml");

        // Because scope is singleton only one object is created and shared
        Employee e1 = (Employee) ctx.getBean("employee");
        System.out.println(e1.getSalary());
        e1.code();
    }
}
