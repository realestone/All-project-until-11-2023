package Homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class Employee {

    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double calculateOvertime(int hours, int rate) {
        return (hours * rate) * 0.6;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }









}
