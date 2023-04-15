package com.keywords;
import java.io.Serializable;

/**
 * Transient []
 *
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private transient int age; //ensure that this data will not be serialized
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

