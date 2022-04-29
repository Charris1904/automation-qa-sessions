package session1.exercises;

/**
 * Calcule el promedio total de notas de un alumno.
 * Debe solicitar: nombre y las notas de 3 evaluaciones.
 * Promedio total = sumatoria de las notas / cantidad de notas.
 * El resultado debe mostrarse así:
 * La nota total de : [NOMBRE ALUMNO] es [NOTA]
 */
public class Notas {

    public static void main(String[] args) {

        String nombre_alumno = "Angela";
        double evaluacion1 = 50;
        double evaluacion2 = 80;
        double evaluacion3 = 70;
        double evaluacion_final;

        System.out.println("Nombre alumno: " + nombre_alumno);
        System.out.println("Nota primera evaluación: " + evaluacion1);
        System.out.println("Nota segunda evaluación: " + evaluacion2);
        System.out.println("Nota tercera evaluación: " + evaluacion3);

        evaluacion_final = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
        System.out.println("La nota media de " + nombre_alumno + " es " + evaluacion_final);
    }
}
