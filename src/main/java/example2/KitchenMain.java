package example2;

import polyphorphism.example1.TautvisBirdSeller;

import javax.swing.plaf.DesktopIconUI;
import java.util.ArrayList;
import java.util.List;

public class KitchenMain {
    public static void main(String[] args) {

        Device hairDryer = new HairDryer(); // viena is Device formu (daugiaformiskumas) yra plauku dziovintuvas.
        Device phone = new Phone();
        Device tablet = new Tablet();

        List<Device> devices = new ArrayList<>();
        devices.add(hairDryer);
        devices.add(phone);
        devices.add(tablet);

        for (Device device : devices) {
            device.work();
            device.turnOn();
            device.charge();
            System.out.println();
        }


    }
}
