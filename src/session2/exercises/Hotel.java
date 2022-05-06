package session2.exercises;

/**
 * Identificar el numero de habitacion segun la cantidad de monedas
 *      5 Monedas - Habitacion 1
 *      10 Monedas - Habitacion 2
 *      15 Monedas - Habitacion 3
 *      20 Monedas - Habitacion 4
 *      Cualquier otro valor significa que no hay habitaciones disponibles
 * */

public class Hotel {
    public static void main(String[] args) {
        int monedas = 5;

        switch (monedas) {
            case 5:
                System.out.println("Habitación 1");
                break;
            case 10:
                System.out.println("Habitación 2");
                break;
            case 15:
                System.out.println("Habitación 3");
                break;
            case 20:
                System.out.println("Habitación 4");
                break;
            default:
                System.out.println("No hay habitaciones disponibles");
                break;
        }
    }
}
