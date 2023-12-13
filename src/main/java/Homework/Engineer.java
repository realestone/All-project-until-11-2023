package Homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Engineer extends Employee{

    private String role;

    Engineer(String name, double salary, String role){
        super(name, salary);
        this.role = role;
    }

    public void bookHoliday(){

    }

    public void getPromoted(){

    }


    public void saveDetails(){

    }





}
