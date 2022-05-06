package session2.examplesIf;

//Clase Java para demostrar estructura de condicion If anidados
public class ConditionalNestedIf {
    public static void main(String args[]) {

        int i = 10;

        if (i > 0) {
            // Primera declaración if
            if (i < 15) {
                System.out.println("Soy menor que 15");
                if (i >= 10) {
                    System.out.println("Soy mayor igual que 10");
                }
            }

            // Declaración if anidada - Solo se ejecutará si la instrucción anterior es verdad
            if (i < 12) {
                System.out.println("Soy menor que 12");
            } else {
                System.out.println("Soy mayor que 15");
            }
        }
    }
}
