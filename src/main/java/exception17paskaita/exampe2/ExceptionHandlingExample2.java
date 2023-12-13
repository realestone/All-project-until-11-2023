package exception17paskaita.exampe2;

public class ExceptionHandlingExample2 {

    public static void main(String[] args) {
        System.out.println("Program started..");
        Car car = new Car();
        car.name = "Audi";

        printCarName(car);

        car = null;
        try {
            printCarName(car);
        } catch (NullPointerException ex) {
            System.out.println("Car object was null. Next time please pass the object");
        }
    }

    private static void printCarName(Car car) {
        System.out.println("Car name is: " + car.name);

    }
}


//Exception klases pabaiga

class Car {

    String name;

}
