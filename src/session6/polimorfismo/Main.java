package session6.polimorfismo;

public class Main {
    public static void main(String[] args) {

        //Ejemplo de Polimorfismo - Runtime
        Animal rufus = new Perro();
        rufus.sonido();
        rufus.mostrar(6);

        rufus = new Gato();
        rufus.sonido();

        rufus = new Pato();
        rufus.sonido();

        //Ejemplo de Polimorfismo - Compile time
        Animal animal = new Animal();
        animal.mostrar();
        animal.mostrar("Hola :)");
        animal.mostrar(3);
    }
}
