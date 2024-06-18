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
//        Employee e = new Employee();
//        e.code();
        ApplicationContext ctx =new ClassPathXmlApplicationContext("spring.xml");

        // Because scope is singleton only one object is created and shared
        Employee e1 = (Employee) ctx.getBean("emp");
        e1.code();
        e1.salary = 50000;
        System.out.println(e1.salary);


        // only one obj is created, age which we changed for e1, is effected to e2 also
        Employee e2 = (Employee) ctx.getBean("emp");
        System.out.println(e2.salary);


        // Because scope is prototype multiple objects are created
        Employee e3 = (Employee) ctx.getBean("employee");
        e3.code();
        e3.salary = 50000;
        System.out.println(e3.salary);

        Employee e4 = (Employee) ctx.getBean("employee");
        e4.code();
        System.out.println(e4.salary);
    }
}
