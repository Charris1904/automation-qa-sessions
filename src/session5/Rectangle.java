package session5;

public class Rectangle {

    double length;
    double width;

    public double calculatePerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public double calculateArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
