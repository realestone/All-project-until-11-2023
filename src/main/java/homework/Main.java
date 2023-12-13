package homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.util.List;

@Data

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "src/main/resources/food.csv";
        String fileWay = "src/main/resources/antrasislist";

        VendingMachine vendingMachine = new VendingMachine("Barsuko Ola", "Terasos g. 28");
        VendingMachine cyborgVending =  new VendingMachine("Kyborgo maisto rojus", "Jogailos g. 6");

        Owner owner = new Owner();
        Food food = new Food();

        owner.fillVendingMachine(fileWay, cyborgVending);

        owner.fillVendingMachine(filePath, vendingMachine);

        vendingMachine.changeListPlaces(vendingMachine,cyborgVending);

        System.out.println();

        cyborgVending.displayItemsCyborg();

        vendingMachine.displayItemsBarsukoOla();


        vendingMachine.addFood(new Food("Kiwi", 17.88, 2.00, FoodType.EATABLE, "Ghana"));

        vendingMachine.changeItemsPlaces(3, 4);

        List<Food> cheaperItems = vendingMachine.findCheaperProducts(19.00);

        System.out.println(cheaperItems);

        cyborgVending.removeItem("Bread");

        cyborgVending.displayItemsCyborg();













    }
}
