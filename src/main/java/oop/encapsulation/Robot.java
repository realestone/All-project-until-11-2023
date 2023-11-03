package oop.encapsulation;

public class Robot {

    private String name = "Igoris";
    private String country = "Bangladesh";
    private int price = 50;
    private int serialnumber = 12345;

    //setters and getters
    //mutators and accessors
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public Robot() {
    }

    public Robot(String name, String country, int price, int serialnumber) {
        this.name = name;
        this.country = country;
        this.price = price;
        this.serialnumber = serialnumber;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", serialnumber=" + serialnumber +
                '}';
    }
}
