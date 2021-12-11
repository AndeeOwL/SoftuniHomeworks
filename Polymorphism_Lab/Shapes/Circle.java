package Shapes;

public class Circle extends Shape {
    private final double RADIUS;

    public Circle(double radius) {
        RADIUS = radius;
    }

    public double getRadius() {
       return RADIUS;
    }



    @Override
    public double calculateArea() {
        return  2*Math.PI*(RADIUS*RADIUS);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*RADIUS;
    }
}
