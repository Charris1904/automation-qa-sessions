package session6.ejercicios.N2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        System.out.println("Introduce el nombre");
        String nombre = sc.next();

        System.out.println("Introduce el cedula");
        String cedula = sc.next();

        System.out.println("Introduce la edad");
        int edad = sc.nextInt();

        System.out.println("Introduce el sexo");
        char sexo = sc.next().charAt(0);

        System.out.println("Introduce el peso");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura");
        double altura = sc.nextDouble();

        //Creamos objetos
        Persona persona1 = new Persona();
        persona1.setNombre(nombre);
        persona1.setCedula(cedula);
        persona1.setEdad(edad);
        persona1.setSexo(sexo);
        persona1.setPeso(peso);
        persona1.setAltura(altura);

        Persona persona2 = new Persona();
        persona1.setNombre(nombre);
        persona1.setCedula(cedula);
        persona1.setEdad(edad);
        persona1.setSexo(sexo);

        Persona persona3 = new Persona();
        persona3.setNombre("Laura");
        persona3.setCedula("12345678");
        persona3.setEdad(30);
        persona3.setSexo('M');
        persona3.setPeso(60);
        persona3.setAltura(1.60);

        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        MuestraTipoCedula(persona1);
        System.out.println(persona1.toString());

        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        MuestraTipoCedula(persona2);
        System.out.println(persona2.toString());

        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        MuestraTipoCedula(persona3);
        System.out.println(persona3.toString());
    }

    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case 0:
                System.out.println("La persona esta en su peso ideal");
                break;
            case -1:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case 1:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }

    public static void MuestraTipoCedula(Persona p) {
        if (p.identificarCedula(p.getCedula())) {
            System.out.println("Es cedula nacional");
        } else {
            System.out.println("Es cedula extranjera");
        }
    }
}
