package ShapeCalculator;

public class Square extends Shape {

    private double sideLength;


    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
