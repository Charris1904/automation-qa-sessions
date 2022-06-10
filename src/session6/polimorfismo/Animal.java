package session6.polimorfismo;

public class Animal {

    public void sonido() {
        System.out.println("sonido de un animal");
    }

    public void mostrar() {
        System.out.println("No muestra nada");
    }

    public void mostrar(String texto) {
        System.out.println("Muestra texto : " + texto);
    }

    public void mostrar(int numero) {
        System.out.println("Muestra numero : " + numero);
    }
}
