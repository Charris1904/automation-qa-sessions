package session2.examplesIf;

//Clase Java para demostrar estructura de condicion If Else If
public class ConditionalIfElseIf {
    public static void main(String args[]) {

        int temperatura = 3;
        boolean nevando = true;

        // Si la temperatura es mayor que 25, playa
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
            // Si es mayor que 15 y no es mayor que 25, montana
        } else if (temperatura > 15) {
            System.out.println("A la montaña!!!");
            // Si es menor que 5 y esta nevando y no es mayor que 15 ni mayor que 25, Esquiar
        } else if (temperatura < 5 && nevando) {
            System.out.println("A esquiar!!!");
        } else {
            // si la temperatura  no es mayor que 25 ni que 15 ni menor que 5 si esta nevando
            System.out.println("A descansar... zZz");
        }
    }
}
