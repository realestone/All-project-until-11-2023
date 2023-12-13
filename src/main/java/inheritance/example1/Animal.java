package inheritance.example1;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * *considered as BASE class which will hiold common fields and methods for derived animals.
 */
@Data
@NoArgsConstructor
public class Animal {

    private int weight;

    private String name;

    private Movement movement;

    public Animal(int weight, String name, Movement movement) {
        this.weight = weight;
        this.name = name;
        this.movement = movement;
    }

    public void breathe() {
        System.out.println("I am breathing");
    }

    public void move() {
        System.out.println("I am moving.");
    }




}
