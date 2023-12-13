package example1;

public class Parrot extends Animal implements Flyable{
    @Override
    public void eat() {
        System.out.println("Parrot eats");
    }

    @Override
    public void fly() {
        System.out.println("Parrot flies");
    }
}
