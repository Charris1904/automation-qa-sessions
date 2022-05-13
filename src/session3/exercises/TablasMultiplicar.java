package session3.exercises;

//Programa que muestre TODAS las tablas de multiplicar
public class TablasMultiplicar {
    public static void main(String[] args) {
        int resultado;
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("*************** Tabla del " + tabla + " ***************");
            for (int numero = 1; numero <= 10; numero++) {
                resultado = tabla * numero;
                System.out.println(tabla + " * " + numero + " = " + resultado);
            }
            System.out.println();
        }
    }
}
