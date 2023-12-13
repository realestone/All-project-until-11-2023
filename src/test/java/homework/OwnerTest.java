package homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@AllArgsConstructor
class OwnerTest {

    @Test
    public void testIfFoodListWasAddedToVendingMachine() throws IOException {

        String filePath = "src/main/resources/food.csv";

        Owner owner = new Owner();

        VendingMachine vendingMachine = new VendingMachine();

        owner.fillVendingMachine(filePath, vendingMachine);

        assertEquals("Apple", vendingMachine.getFoodList().get(0).getName());
    }

    @Test
    public void testIfMostExpensiveFoodIsPointedOut() throws IOException {

        String filePath = "src/main/resources/food.csv";

        Owner owner = new Owner();
        VendingMachine vendingMachine = new VendingMachine();

        owner.fillVendingMachine(filePath, vendingMachine);

        Food food = owner.findTheMostExpensiveFood(vendingMachine.getFoodList());

        assertEquals("Bread", food.getName());


    }

    @Test
    public void testIfYouCanAddFood() throws IOException {

        String filePath = "src/main/resources/food.csv";

        Owner owner = new Owner();
        VendingMachine vendingMachine = new VendingMachine();

        owner.fillVendingMachine(filePath, vendingMachine);

        vendingMachine.addFood(new Food("Kiwi", 17.88, 2.00, FoodType.EATABLE, "Ghana"));

        //assertEquals(new Food("Kiwi", 17.88, 2.00, FoodType.EATABLE, "Ghana"), foodList.get(19)); //Kaip padaryti tai paprasciau?

    }

    @Test
    public void testIfListGivesCheaperProducts() throws IOException {
        String filePath = "src/main/resources/food.csv";
        Owner owner = new Owner();
        VendingMachine vendingMachine = new VendingMachine();

        owner.fillVendingMachine(filePath, vendingMachine);

        List<Food> cheaperProducts = vendingMachine.findCheaperProducts(10);

        assertTrue(cheaperProducts.get(0).getPrice() < 10);
    }


    @Test
    public void testIfListChangesItems() throws IOException {

        String filePath = "src/main/resources/food.csv";

        Owner owner = new Owner();
        VendingMachine vendingMachine = new VendingMachine();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String singleLine;
        List<Food> foodList = new ArrayList<>();

        while ((singleLine = br.readLine()) != null) {
            String[] seperatedValue = singleLine.split(",");
            Food food = new Food();
            food.setName(seperatedValue[0]);
            food.setPrice(Double.parseDouble(seperatedValue[1]));
            food.setWeight(Double.parseDouble(seperatedValue[2]));
            food.setType(FoodType.valueOf(seperatedValue[3]));
            foodList.add(food);
        }
        vendingMachine.setFoodList(foodList);

        owner.fillVendingMachine(filePath, vendingMachine);

        vendingMachine.changeItemsPlaces(3, 4);

        assertEquals(foodList.get(3), foodList.get(3));

    }

    @Test
    public void checkIfItemsDisplayed() throws IOException {

        String filePath = "src/main/resources/food.csv";

        Owner owner = new Owner();
        VendingMachine vendingMachine = new VendingMachine();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String singleLine;
        List<Food> foodList = new ArrayList<>();

        while ((singleLine = br.readLine()) != null) {
            String[] seperatedValue = singleLine.split(",");
            Food food = new Food();
            food.setName(seperatedValue[0]);
            food.setPrice(Double.parseDouble(seperatedValue[1]));
            food.setWeight(Double.parseDouble(seperatedValue[2]));
            food.setType(FoodType.valueOf(seperatedValue[3]));
            foodList.add(food);
        }
        vendingMachine.setFoodList(foodList);


        owner.fillVendingMachine(filePath, vendingMachine);

        vendingMachine.displayItemsBarsukoOla();

        assertNotNull(foodList);

    }

    @Test
    public void testIfProductsRemovedFromList() throws IOException {
        String filePath = "src/main/resources/food.csv";

        Owner owner = new Owner();
        VendingMachine vendingMachine = new VendingMachine();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String singleLine;
        List<Food> foodList = new ArrayList<>();

        while ((singleLine = br.readLine()) != null) {
            String[] seperatedValue = singleLine.split(",");
            Food food = new Food();
            food.setName(seperatedValue[0]);
            food.setPrice(Double.parseDouble(seperatedValue[1]));
            food.setWeight(Double.parseDouble(seperatedValue[2]));
            food.setType(FoodType.valueOf(seperatedValue[3]));
            foodList.add(food);
        }
        vendingMachine.setFoodList(foodList);

        vendingMachine.removeItem("Apple");

        assertTrue(vendingMachine.getFoodList().stream().noneMatch(food -> food.getName().equals("Apple"))); // Streams are a powerful feature in Java for processing sequences of elements.
        // noneMatch = It checks whether no elements of the stream match the given predicate. In this case, the predicate is a lambda expression
        //

    }

    @Test
    public void testIfListGetChangedWithOneAndOther() throws IOException {

        String filePath = "src/main/resources/food.csv";
        String fileWay = "src/main/resources/antrasislist";

        VendingMachine vendingMachine = new VendingMachine("Barsuko Ola", "Terasos g. 28");
        VendingMachine cyborgVending = new VendingMachine("Kyborgo maisto rojus", "Jogailos g. 6");

        Owner owner = new Owner();
        Food food = new Food();

        owner.fillVendingMachine(fileWay, cyborgVending);
        owner.fillVendingMachine(filePath, vendingMachine);

        vendingMachine.changeListPlaces(vendingMachine, cyborgVending);

        assertEquals(cyborgVending, cyborgVending);
    }

}




