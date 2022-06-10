package session6.encapsulacion;

public class Main {

    public static void main(String arg[]) {

        //Instancia de clase persona
        Persona persona = new Persona();

        //Ejemplo usando variable
        /*persona.nombre = "";
        persona.edad = -385;
        persona.peso = 987564.25;
        System.out.println(persona);*/

        //Ejemplo usando Encapsulacion
        persona.setNombre("");
        persona.setEdad(-385);
        persona.setPeso(987564.25);
        System.out.println(persona);
    }
}
