package session6.polimorfismo;

public class Gato extends Animal {

    @Override
    public void sonido() {
        System.out.println("miau");
    }

    public void rasguñar() {
        System.out.println("Soy un gato y me encanta rasgar cosas!!");
    }
}
