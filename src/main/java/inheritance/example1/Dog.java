package inheritance.example1;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** When Animal is extended by this class
 * dog is considered as child class, animal is parent base class
 * Dog not IS-AN Animal
 */

@NoArgsConstructor
@ToString
public class Dog extends Animal {

    private boolean isHuntingDog;
    public Dog(int weight, String name, Movement movement) {
        super(weight, name, movement);
    }

    public Dog(int weight, String name, Movement movement, boolean isHuntingDog) {
        super(weight, name, movement);
        this.isHuntingDog = isHuntingDog;
    }


    @Override //Override reiskia perrasyti tevines klases klases metodo logika
    public void move() {
        System.out.println("Running around like a dog.");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "isHuntingDog=" + isHuntingDog +
                "} " + super.toString();
    }
}


