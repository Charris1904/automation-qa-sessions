package session6.polimorfismo;

public class Perro extends Animal {

    @Override
    public void sonido() {
        System.out.println("guau");
    }

    public void lamer() {
        System.out.println("lamer me encanta!");
    }

    @Override
    public void mostrar(int numero) {
        super.mostrar(numero);
    }
}
