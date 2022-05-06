package session2.examplesIf;

//Clase Java para demostrar estructura de condicion IF
public class ConditionalIf {
    public static void main(String args[]) {

        // Si la temperatura es mayor que 25, vamos a la playa
        int temperatura = 15;
        boolean haceSol = true;

        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        }

        // Si la temperatura es mayor que 25 pero menor a 30, vamos a la playa
        if (temperatura > 25 && temperatura < 30) {
            System.out.println("A la playa!!!");
        }

        // Si hace sol o la temperatura es mayor que 25, vamos a la playa
        if (haceSol || temperatura > 25) {
            System.out.println("A la playa!!!");
        }
    }
}
