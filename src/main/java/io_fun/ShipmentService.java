package io_fun;

import java.util.ArrayList;
import java.util.List;

public class ShipmentService {

    public List<Product> getProductsFromGivenCountry(List<Product> products, Country countryToShip) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCountry() == countryToShip) {
                filteredProducts.add(product);
            }

        } return filteredProducts;
    }

}
