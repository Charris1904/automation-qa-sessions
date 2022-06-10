package session6.ejercicios.N1;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta();
        cuenta_1.setTitular("Marcela");
        cuenta_1.setCantidad(0);

        Cuenta cuenta_2 = new Cuenta();
        cuenta_2.setTitular("Fernanda");
        cuenta_2.setCantidad(300);

        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);

        //Retira dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        //Muestra la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros

    }
}
