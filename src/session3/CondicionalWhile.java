package session3;

//Clase Java para demostrar estructura de repeticion While y Do While
public class CondicionalWhile {
    public static void main(String args[]) {

        int i = 1;

        /******************* WHILE *******************/
        //Imprimir el valor siempre que i sea menor a 1
        /*while (i <= 10) {
            System.out.println(i);
            i++;
        }*/

        /******************* DO WHILE *******************/
        do {
            System.out.println("Valor de i : " + i);
            i++;
            if(i==5){
                System.out.println("Adios");
                break;
            }
        }
        while (i <= 10);

    }
}
