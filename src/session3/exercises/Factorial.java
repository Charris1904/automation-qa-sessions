package session3.exercises;

//Dado un numero calcular el factorial
public class Factorial {
    public static void main(String[] args) {

        int fact = 1;
        int num = 10;
        int indicador = 1;

        /*for (int ind = 1; ind <= num; ind++) {
            fact *= ind;
        }
        System.out.println("El factorial de : " + num + " es : " + fact);*/

        while (indicador <= num) {
            fact *= indicador;
            indicador++;
        }
        System.out.println("El factorial de : " + num + " es : " + fact);
    }
}
