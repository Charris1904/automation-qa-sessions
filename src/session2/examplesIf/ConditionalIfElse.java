package session2.examplesIf;

//Clase Java para demostrar estructura de condicion If Else
public class ConditionalIfElse {
    public static void main(String args[]) {

        // Si la temperatura es mayor que 25, vamos a la playa, si no, veremos una pelicula
        /*int temperatura = 30;

        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        } else {
            System.out.println("Pelicula!");
        }*/

        //Si el promedio de calificaciones es mayor a 70, estudiante esta aprobado, de lo contrario reprobado
        int nota1 = 80;
        int nota2 = 80;
        int nota3 = 80;
        int promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 70) {
            System.out.println("Promedio = " + promedio + " Aprobado");
        } else {
            System.out.println("Promedio = " + promedio + " Reprobado");
        }
    }
}
