package shop;

public class ShopWorker {

    public Product getProductFromList(Product[] products, int index) {
        //return index > products.length ? null : products[index];
        if (index >= products.length) {
            return null;
        }

        return products[index];
    }

    public void addProduct(Product[] products, Product productToAdd) {
        boolean isNullWasFound = true;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = productToAdd;
                break;
            }
        }
        if (isNullWasFound) {
            products[0] = productToAdd;
        }


    }

    public void removeProductFromList(Product[] products, int index) {
        if (index >= products.length) {
            return;
        }
        products[index] = null;
    }

    public Product[] getProductsByLetter(Product[] products, String letter) {
        Product[] productsByLetter = new Product[products.length]; //cia galetu buti arrayList
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.toLowerCase().contains(letter.toLowerCase())) {
                productsByLetter[i] = products[i];
            }
        }
        return productsByLetter;
    }

    public Product[] getProductsByPrice(Product[] products, int price) {
        Product[] productsByPrice = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
            if (products[i].price > price) {
                productsByPrice[i] = products[i];
            }
        }
        return productsByPrice;
    }

    public Product getMostExpensiveProduct(Product[] list) {
        int price = 0;
        Product mostExpensiveProduct = null;
        for (int i = 0; i < list.length; i++) {
            if (list[i].price > price) {
                price = list[i].price;
                mostExpensiveProduct = list[i];
            }

        }
        return mostExpensiveProduct;
    }

    public Product[] addProductAndExpand(Product[] products, Product productToAdd) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = productToAdd;
                return products;
            }
        }
        Product[] expandedArray = new Product[products.length*2];
        expandedArray[products.length + 1] = productToAdd;
        return expandedArray;
    }

    public int countEdibleProducts(Product[] products) {
        int counter = 0;
        for (int i = 0; i < products.length; i++) {
            if(products[i].isEdible == true) {
                counter++;
            }
        }
        return counter;
    }

    public int getTotalProductPrice(Product[] products) {
        int totalPricePlusVat = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].price > 5 || !products[i].name.startsWith("A")) {
            } else {

            }
        }
        return totalPricePlusVat;
    }
}











