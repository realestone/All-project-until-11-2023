package example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal parrot = new Parrot();

        AirPlane airPlane = new AirPlane();

        List<Flyable> skraiduoliai = new ArrayList<>();
        skraiduoliai.add((Flyable) parrot);
        skraiduoliai.add(airPlane);


    }
}
