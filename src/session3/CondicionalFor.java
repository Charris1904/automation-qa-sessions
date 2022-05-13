package session3;

//Clase Java para demostrar estructura de repeticion For y ForEach
public class CondicionalFor {
    public static void main(String args[]) {

        /******************* FOR *******************/
        //Bucle que comienza cuando x es igual a 2 y corre hasta que x es menor igual 4
        /*for (int x = 2; x <= 10; x++) {
            System.out.println("Valor de x: " + x);
        }*/

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }

        /******************* FOR EACH *******************/
        String array[] = {"Kennia", "Alejandro", "Ana", "Angela"};

        /*for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }*/

        //bucle for para la misma función
        for (String item : array) {
            System.out.println(item);
            if (item == "Ana") {
                System.out.println("Hola " + item);
                break;
            }
        }
    }
}
