package uzduotis;

import lombok.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Data

public abstract class Employee {

    private String name;
    private final String filePath = "src/main/resources/products.csv";
    private List<Product> products = new ArrayList<>();

    public abstract void generateProductList() throws IOException;

    public List<Product> getProductsList(int levelDiscount) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String singleLine;

        while((singleLine = br.readLine()) != null) {
            String[] seperatedValue = singleLine.split(",");
            Product product = new Product();
            product.setName(seperatedValue[0]);
            product.setDescription(seperatedValue[1]);
            product.setPrice(Double.parseDouble(seperatedValue[2]));
            if (levelDiscount == 1) {
                product.setPrice(product.getPrice() - product.getPrice() / 0.1);
            }
            product.setQuantity(Integer.parseInt((seperatedValue[3])));
            this.products.add(product);
        }
        return products;
    }












}
