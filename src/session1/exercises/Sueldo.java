package session1.exercises;

/**
 * Calcular el sueldo de un trabajador, si su hora de trabajo vale $10.
 * Debe solicitar el numero de horas que ha trabajado en un mes.
 */
public class Sueldo {

    public static void main(String[] args) {

        int horas = 10;
        int sueldo = 0;

        sueldo = horas * 10;
        System.out.println("El sueldo de este mes es de: " + sueldo + "$");
    }
}
