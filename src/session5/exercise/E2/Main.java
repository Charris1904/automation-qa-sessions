package session5.exercise.E2;

public class Main {
    public static void main(String args[]) {

        Numeros numeros = new Numeros();
        numeros.numero1 = 5;
        numeros.numero2 = 9;

        System.out.println("El resultado de la suma es : "+numeros.suma(numeros));
        System.out.println("El resultado de la resta es : "+numeros.resta(numeros));
        System.out.println("El resultado de la multiplicacion es : "+numeros.multiplicacion(numeros));
        System.out.println("El resultado de la division es : "+numeros.division(numeros));
    }
}
