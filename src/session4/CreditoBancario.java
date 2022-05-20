package session4;

//Aprobacion de credito - salario mayor a 25000 y score = 700
public class CreditoBancario {

    static int salarioRequerido = 25000;
    static int score = 700;

    public String ejemplo;

    public static void main(String args[]) {

        double salario = obtenerSalario();
        int creditScore = obtenerScore();

        boolean qualified = verificarUsuarioCalificado(creditScore, salario);

        notificarUsuario(qualified);
    }

    public static double obtenerSalario() {
        double salario = 123426;
        return salario;
    }

    public static int obtenerScore() {
        int creditScore = 700;
        return creditScore;
    }

    public static boolean verificarUsuarioCalificado(int creditScore, double salario) {
        if (creditScore >= score && salario >= salarioRequerido) {
            return true;
        } else {
            return false;
        }
    }

    public static void notificarUsuario(boolean isQualified) {
        if (isQualified) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Rechazado");
        }
    }
}
