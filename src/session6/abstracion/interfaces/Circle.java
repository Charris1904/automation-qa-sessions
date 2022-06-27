package session6.abstracion.interfaces;

public class Circle implements IShape {

    double pi = 3.14;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn ");
    }

    @Override
    public double area() {
        return (double) ((pi * radius * radius));
    }
}
