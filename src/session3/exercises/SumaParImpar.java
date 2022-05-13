package session3.exercises;

//Escribe un programa que dado un numero maximo muestre los numeros pares, obtenga la suma de los números impares y el promedio de los números pares.
public class SumaParImpar {
    public static void main(String[] args) {

        int num = 20;
        int impar = 0;
        int cantidadPar = 0;
        int sumaPar = 0;
        String coleccionPar = "";

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                coleccionPar += i + ", ";
                cantidadPar++;
                sumaPar += i;
            } else {
                impar += i;
            }
        }

        System.out.println("los numeros pares fueron: " + coleccionPar);
        System.out.println("el promedio de los numeros pares es: " + sumaPar / cantidadPar);
        System.out.println("la suma de los numeros impares son: " + impar);
    }
}
