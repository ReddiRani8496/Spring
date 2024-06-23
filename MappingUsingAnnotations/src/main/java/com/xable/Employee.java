package com.xable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {


    public Employee() {
        System.out.println("Employee object created");
    }

    public Employee(int salary,Laptop lap) {
        this.salary = salary;
        this.lap = lap;
    }

    @Value("2000")
    private int salary;
    @Autowired
    Laptop lap;

    @Autowired
    Desktop desktop;

    public Desktop getDesktop() {
        return desktop;
    }

    public void setDesktop(Desktop desktop) {
        this.desktop = desktop;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void code(){
        System.out.println("Coding");
        lap.compile();
    }
}
