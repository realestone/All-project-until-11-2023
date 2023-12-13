package io_fun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReadingMain {
    public static void main(String[] args) throws IOException {

        String filePath = "src/main/resources/products.csv";

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String singleLine;

        List<Product> products = new ArrayList<>();

        while ((singleLine = br.readLine()) != null) {
           String[] seperatedValue = singleLine.split(",");
           Product product = new Product();
           product.setName(seperatedValue[0]);
           product.setPrice(Double.parseDouble(seperatedValue[1]));
           product.setWeight(Double.parseDouble(seperatedValue[2]));
           product.setCountry(Country.valueOf(seperatedValue[3].toUpperCase()));
           products.add(product);
        }

        System.out.println(new ShipmentService().getProductsFromGivenCountry(products, Country.SPAIN));
    }


}
