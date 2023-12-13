package boilerplacecode;

import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {

    private String brand;
    private String country;
    private int year;
    private double price;
    private boolean isUsed;
    private char fuelType;


}
