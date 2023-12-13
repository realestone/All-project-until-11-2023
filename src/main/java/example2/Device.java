package example2;

public abstract class Device {

   //Abstraktus metodas, kuris neturi "kuno" (body)

    public abstract void work();

    public void turnOn() {
        System.out.println("I am turned on");
    }

    public void charge() {
        System.out.println("I am charging plugged");
    }
}

