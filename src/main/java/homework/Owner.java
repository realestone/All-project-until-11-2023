package homework;

import io_fun.Country;
import io_fun.Product;
import io_fun.ShipmentService;
import lombok.Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
public class Owner {

    String filePath = "src/main/resources/food.csv";
    String fileWay = "src/main/resources/antrasislist";

    public void fillVendingMachine(String filePath, VendingMachine vendingMachine) throws IOException {
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
            food.setCountry(seperatedValue[4]);
            foodList.add(food);
        }
        vendingMachine.setFoodList(foodList);
    }

    Food findTheMostExpensiveFood(List<Food> foodList) { //Grazinsim Food, paiimam list'a
        Food mostExpensiveFood = foodList.get(0); //sukuriam kintamaji brangiausiam produktui apibudinti
        for (Food food : foodList) { //ciklas programa pradeda skanuoti objektus food is eiles
            if (food.getPrice() > mostExpensiveFood.getPrice()) {
                mostExpensiveFood = food;
            }
        }
        return mostExpensiveFood;
    }

    public void fillNextVendingMachine(String fileWay, VendingMachine cyborVending) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileWay));
        String singleLine;
        List<Food> foodList2 = new ArrayList<>();

        while ((singleLine = br.readLine()) != null) {
            String[] seperatedValue = singleLine.split(",");
            Food food = new Food();
            food.setName(seperatedValue[0]);
            food.setPrice(Double.parseDouble(seperatedValue[1]));
            food.setWeight(Double.parseDouble(seperatedValue[2]));
            food.setType(FoodType.valueOf(seperatedValue[3]));
            food.setCountry(seperatedValue[4]);
            foodList2.add(food);
        }
        cyborVending.setFoodList(foodList2);
    }

}







