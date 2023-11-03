package shop;

public class Product {

    public String name;
    public int price;

    boolean isEdible;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, int price, boolean isEdible) {
        this.name = name;
        this.price = price;
        this.isEdible = isEdible;
    }
}
