package session2;

//Clase Java para demostrar estructura condicional Switch
public class CondicionSwitch {
    public static void main(String args[]) {

        int day = 5;
        String dayString = "";

        switch (day) {
            case 1:
                dayString = "Lunes";
                break;
            case 2:
                dayString = "Martes";
                break;
            case 3:
                dayString = "Miércoles";
                break;
            case 4:
                dayString = "Jueves";
                break;
            case 5:
                dayString = "Viernes";
                break;
            case 6:
                dayString = "Bisiesto";
                break;
            default:
                dayString = "Dia inválido";
                break;
        }
        System.out.println(dayString);
    }
}
