package session1;

// Clase Java para demostrar tipos de datos
public class DataTypes {

    public static void main(String args[]) {
        // Permite almacenar valores true or false
        boolean interruptor = true;
        System.out.println("Ejemplo valor boolean " + interruptor);

        // Permite almacenar un caracter Unicode o una sola letra
        char caracter = '\u0061';
        System.out.println("Ejemplo de caracter en formato unicode: " + caracter);

        caracter = 'a';
        System.out.println("Ejemplo de caracter: " + caracter);

        // Permite almacenar valor entero
        byte byteNumber = 15;
        System.out.println("Ejemplo de un dato de dato tipo byte: " + byteNumber);

        short shortNumber = 66;
        System.out.println("Ejemplo de un dato tipo short: " + shortNumber);

        int intNumber = 1234;
        System.out.println("Ejemplo de un dato tipo integer: " + intNumber);

        long longNumber = 2365;
        System.out.println("Ejemplo de un dato tipo long: " + longNumber);

        // Permite almacenar un valor decimal
        float floatNumber = 12345f;
        System.out.println("Ejemplo de un dato tipo float: " + floatNumber);

        double doubleNumber = 1234.25;
        System.out.println("Ejemplo de un dato tipo double: " + doubleNumber);

        // Permite almacenar un texto
        String texto = "Hola a todos";
        System.out.println("Ejemplo de un dato tipo String: " + texto);
    }
}