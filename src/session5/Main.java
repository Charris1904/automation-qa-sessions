package session5;

public class Main {
    public static void main(String args[]) {

        //Ejemplo Perro
        /*Dog perro;
        perro = new Dog();
        perro.breed="Collie";
        perro.age=2;
        perro.name="Toby";

        //System.out.println(perro.toString());
        System.out.println(perro);
        perro.bark("Dusty");

        Dog perro2 = new Dog();
        perro2.color="Negro";
        //perro2.name="Terry";
        System.out.println(perro2);
        perro2.bark("Terry");*/

        //Ejemplo Rectangulo
        Rectangle rectangle = new Rectangle();
        rectangle.width = 25;
        rectangle.length = 50;
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);

        /*double width = 25;
        double length = 50;*/
        rectangle.width = 78;
        rectangle.length = 90;
        area = rectangle.calculateArea(rectangle);
        System.out.println("Area : " + area);


    }
}
