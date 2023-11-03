package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot);
        System.out.println(robot.getName());
        robot.setName("Petras");
        System.out.println(robot.getName());
        robot.setCountry("Lenkija");
        System.out.println(robot.getCountry());
    }
}
