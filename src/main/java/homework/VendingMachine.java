package homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uzduotislist.Lecturer;
import uzduotislist.ProgrammingCourse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data// annotation that bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together
@NoArgsConstructor //  a no-argument constructor is one that does not accept any arguments or parameters.
@AllArgsConstructor // generates a constructor with one parameter for every field in the class.

public class VendingMachine {

    private String name;
    private String location;
    private List<Food> foodList;
    private List<Food> foodList2;

    public VendingMachine(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public List<Food> findFoodByCountry(VendingMachine vendingMachine, String country) throws IOException { //ar teisingai pasirinkta klase?
        List<Food> productsInLocation = new ArrayList<>();
        for (Food food : vendingMachine.getFoodList()) {
            if (country.equalsIgnoreCase(food.getCountry())) //equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
                productsInLocation.add(food);
        }
        return productsInLocation;
    }

    public List<Food> findCheaperProducts(double maxPrice) {
        List<Food> cheaperProducts = new ArrayList<>();
        for (Food food : foodList) {
            if (food.getPrice() < maxPrice) {
                cheaperProducts.add(food);
            }
        }
        return cheaperProducts;
    }

    public void changeItemsPlaces(int first, int second) { //
        if (first < foodList.size() && second < foodList.size()) {
            Food secondList = foodList.get(first);  //sukuriam nauja objekta kuris laikytu item
            foodList.set(first, foodList.get(second)); //index of the element to replace element – element to be stored at the specified position
            foodList.set(second, secondList);
            System.out.println("Items changed succesfully");
        } else System.out.println("Items cannot be changed");

    }

    public void changeListPlaces(VendingMachine machine1, VendingMachine machine2) {
        List<Food> secondList = machine1.getFoodList();
        machine1.setFoodList(machine2.getFoodList());
        machine2.setFoodList(secondList);
    }

    public void displayItemsBarsukoOla() {
        System.out.println("Items in " + name + ":");
        for (Food food : foodList) {
            System.out.println(food.toString());
        }
    }
    public void displayItemsCyborg() {
        List<Food> foodList2 = new ArrayList<>();
        System.out.println("Items in " + name + ":");
        for (Food food : foodList) {
            System.out.println(food.toString());
        }
    }

    public void addFood(Food food) {

        this.foodList.add(food);
    }

    public void addSecondFoodList(Food food) {

        this.foodList2.add(food);
    }

    //public void removeFoodFromTheVendingMachine(String reference) {
    //List<Food> afterRemoval = (foodList.remove(1)

    List<Food> removeItemFromList(List<Food> foodList, Food reference) {
        List<Food> itemsAfterRemoval = new ArrayList<>();
        for (Food food : foodList) {
            if (food.getName().equalsIgnoreCase(String.valueOf(reference))) {
                foodList.remove(reference);
                return itemsAfterRemoval;
            }

        }
        return itemsAfterRemoval;
    }

    public void removeItem(String reference) {
        List<Food> deleteProduct = new ArrayList<>();
        for (Food food : foodList) {
            if (food.getName().contains(reference)) {
                deleteProduct.add(food);
            }
        }
        foodList.removeAll(deleteProduct);
    }

}


