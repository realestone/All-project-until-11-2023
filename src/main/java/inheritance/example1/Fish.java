package inheritance.example1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fish extends Animal{

    private double swimmingSpeed;

    public Fish(int weight, String name, Movement movement, double swimmingSpeed) {
        super(weight, name, movement);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void move() {
        super.move(); //
        System.out.println("Swimming around like a fish");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "swimmingSpeed=" + swimmingSpeed +
                "} " + super.toString();
    }
}
