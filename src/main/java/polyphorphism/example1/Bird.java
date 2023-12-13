package polyphorphism.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bird {

    private String color;


    public void fly() {
        System.out.println("Bird is flying");
    }



}
