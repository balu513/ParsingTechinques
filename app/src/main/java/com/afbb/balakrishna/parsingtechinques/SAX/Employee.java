package com.afbb.balakrishna.parsingtechinques.SAX;

/**
 * Created by balakrishna on 2/7/15.
 */
public class Employee {
    String name;
    String salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

}
