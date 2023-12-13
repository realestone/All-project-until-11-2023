package boilerplacecode;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setCountry("Germany");
        audi.setBrand("TT");
        audi.setPrice(1500.00);
        audi.setFuelType('D');
        audi.setYear(2012);
        audi.setUsed(true);
        System.out.println(audi);

        Car opel = new Car("Vectra", "Germany", 1999, 560.00, true, 'G');
        System.out.println(opel.getBrand() + " " + opel.getCountry());

        Car[] masinos = { audi, opel } ;

        List<Car> garage = new ArrayList<>();
        garage.add(opel);
        garage.add(audi);
        System.out.println(garage);
        garage.add(0, new Car("Volvo", "China", 2020, 600.00, false, 'E'));
        System.out.println(garage);
        System.out.println();

        for (Car car : garage) {
            System.out.println(car.getBrand() + " " + car.getPrice());
        }

        Pilot lukas = new Pilot("Lukas Girenas");
        Pilot andrius = new Pilot("Steponas Andrius");
        List<Pilot> pilotai = new ArrayList<>();
        pilotai.add(lukas);
        pilotai.add(andrius);

        Helicopter helicopter = new Helicopter();
        helicopter.setName("Fast Blue Helicopter");
        helicopter.setSpeed(450);
        helicopter.setCar(audi);
        helicopter.setPilots(pilotai);

        System.out.println(helicopter);

        int year = helicopter.getCar().getYear();
        helicopter.getPilots().get(1).getName();
        System.out.println(year);

    }
}
