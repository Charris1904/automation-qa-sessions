package session4.modificadores.demoPrivate;

//Ejemplo con modificador Private - solo accesible dentro de la misma clase
public class DemoPrivate {

    private void mostrar() {
        System.out.println("Mostrar en metodo privado");
    }

    private void llamarMostrar(){
        mostrar();
    }
}
