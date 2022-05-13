package session3;

public class ContinueBreak {
    public static void main(String args[]) {

        /******************* BREAK *******************/

        /*for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Bucle completo.");*/


        /******************* CONTINUE *******************/

        for (int i = 0; i < 10; i++) {
            // Si el número es par omitir y continuar
            if (i % 2 == 0) {
                continue;
            }
            // Si el número es impar, imprímalo
            System.out.print(i + " ");
        }
    }
}
