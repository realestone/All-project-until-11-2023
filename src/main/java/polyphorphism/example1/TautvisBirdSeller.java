package polyphorphism.example1;

import example2.Device;

public class TautvisBirdSeller {

    public void sellBird(Bird bird) {
        System.out.println("Hey, I am selling this bird. Look how it can fly: ");
        bird.fly();

    }

    public void useDevice(Device device) {
        System.out.println("I am using a device.");
        device.work();
    }
}
