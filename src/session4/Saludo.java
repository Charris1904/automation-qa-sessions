package session4;

//Escriba un método que le pida a un usuario su nombre y luego lo salude por su nombre.
public class Saludo {

    static String nombre_global="Angela";

    public static void main(String args[]) {

        String nombre = "Jonathan";
        nombre_global = "Jonathan";
        int anno = 1980;

        saludar();
        saludarUsuario(nombre_global);
        saludarUsuario();

        /*int edad = calcularEdad(anno);
        System.out.println(nombre + " tiene " + edad);*/

        System.out.println(nombre + " tiene " +calcularEdad(anno));

    }

    public static void saludar() {
        System.out.println("Hola a todos, feliz viernes!");
    }

    public static void saludarUsuario(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void saludarUsuario() {
        String nombre_global="Sergio";
        System.out.println("Hola " + nombre_global);
    }

    public static int calcularEdad(int annoNacimiento) {
        int edad = 2022 - annoNacimiento;
        return edad;
    }
}
