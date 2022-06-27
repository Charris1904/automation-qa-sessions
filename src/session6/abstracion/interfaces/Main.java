package session6.abstracion.interfaces;

public class Main {
    public static void main(String[] args) {

        IShape rect = new Rectangle(2, 3);
        System.out.println("Area of rectangle: " + rect.area());

        IShape circle = new Circle(2);
        System.out.println("Area of circle: " + circle.area());
    }
}
