package session6.herencia;


import session6.herencia.conHerencia.Empleado;
import session6.herencia.conHerencia.Estudiante;
import session6.herencia.conHerencia.Persona;

public class Main {

    public static void main(String arg[]) {

        //Ejemplo sin usar Herencia
       /* Empleado empleadoSinHerencia = new Empleado();
        empleadoSinHerencia.setNombre("Maria");
        empleadoSinHerencia.setEdad(30);
        empleadoSinHerencia.setCargo("Salonera");
        empleadoSinHerencia.setEmpleadoID("ABC123");
        System.out.println(empleadoSinHerencia.getNombre() + " " + empleadoSinHerencia.getEdad()
                + " " + empleadoSinHerencia.getEmpleadoID() + " " + empleadoSinHerencia.getCargo());

        Estudiante estudianteSinHerencia = new Estudiante();
        estudianteSinHerencia.setNombre("Maria");
        estudianteSinHerencia.setEdad(17);
        estudianteSinHerencia.setCarnet("A47854");
        estudianteSinHerencia.setGrado(11);
        System.out.println(estudianteSinHerencia.getNombre() + " " + estudianteSinHerencia.getEdad()
                + " " + estudianteSinHerencia.getGrado() + " " + estudianteSinHerencia.getCarnet());*/

        //Ejemplo usando Herencia
        /*Empleado empleado = new Empleado();
        empleado.setCargo("Pintor");
        empleado.setEmpleadoID("PA123");
        empleado.setNombre("Pablo");
        empleado.setEdad(43);
        empleado.setGenero("M");
        System.out.println(empleado);
       // empleado.mostrar();

        Estudiante estudiante = new Estudiante();
        estudiante.setCarnet("A71783");
        estudiante.setGrado(4);
        estudiante.setNombre("Marcos");
        estudiante.setEdad(23);
        estudiante.setGenero("M");
        System.out.println(estudiante);*/
       // estudiante.mostrar();

        //Ejemplo usando Herencia con Constructor
        Empleado empleado = new Empleado("Pablo", 43, "M");
        empleado.setCargo("Pintor");
        empleado.setEmpleadoID("PA123");
        System.out.println(empleado);

        Estudiante estudiante = new Estudiante("Marcos", 23, "M");
        estudiante.setCarnet("A71783");
        estudiante.setGrado(4);
        System.out.println(estudiante);
    }
}
