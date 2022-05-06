package session2.exercises;

/**
 * Pide el nombre, edad y salario y muestra el salario.
 * Si es menor de 16 no tiene edad para trabajar
 * Entre 19 y 50 años el salario es un 5 por ciento más
 * Entre 51 y 60 años el salario es un 10 por ciento más
 * Si es mayor de 60 el salario es un 15 por ciento más
 */
public class CalculoSalario {
    public static void main(String[] args) {

        String nombre = "Paco";
        int edad = 87;
        float salario = 109354;
        float salarioImpuesto = 0;

        if (edad >= 16 && edad <= 18) {
            salarioImpuesto = salario;
            System.out.println(nombre + " con " + edad + " annos cobra " + salario + " + 0% = " + salarioImpuesto);
        } else if (edad >= 19 && edad <= 50) {
            salarioImpuesto = salario + ((salario * 5) / 100);
            System.out.println(nombre + " con " + edad + " annos cobra " + salario + " + 5% = " + salarioImpuesto);
        } else if (edad >= 51 && edad <= 60) {
            salarioImpuesto = salario + ((salario * 10) / 100);
            System.out.println(nombre + " con " + edad + " annos cobra " + salario + " + 10% = " + salarioImpuesto);
        } else if (edad > 60) {
            salarioImpuesto = salario + ((salario * 15) / 100);
            System.out.println(nombre + " con " + edad + " annos cobra " + salario + " + 15% = " + salarioImpuesto);
        } else if (edad < 16) {
            System.out.println("No tiene edad para trabajar");
        }
    }
}
