package com.xable;

public class Employee {


    public Employee() {
        System.out.println("Employee object created");
    }


    private int salary;

    Laptop lap;

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
