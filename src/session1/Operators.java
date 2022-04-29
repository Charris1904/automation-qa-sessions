package session1;

// Clase Java para demostrar operadores
public class Operators {

    public static void main(String args[]) {
        int a = 20;
        int b = 10;
        int c = 0;
        int d = 20;
        int e = 40;
        int f = 30;
        String x = "Thank";
        String y = "You";
        boolean condition = true;

        //Operador +, -, *, /
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        //Operador + con Strings
        System.out.println("x + y = " + x + y);

        //Operador de módulo o residuo
        System.out.println("a % b = " + (a % b));

        //Operador de pre incremento y decremento
        c = --a;
        System.out.println("Valor de c (++a) = " + c);

        c = --d;
        System.out.println("Valor de c (--d) = " + c);

        //Operador de post incremento y decremento
        c = b++;
        System.out.println("Valor de c (b++) = " + c);
        c = b;
        System.out.println("Valor de c (b++) = " + c);

        c = e--;
        System.out.println("Valor de c (e--) = " + c);
        c = e;
        System.out.println("Valor de c (e--) = " + c);

        //Operador lógico not
        System.out.println("Valor de !condition = " + !condition);

        //Operador de asignación simple
        c = b;
        System.out.println("Valor de c = " + c);

        //Operadores de asignación simples
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("a, b, e, f = " + a + "," + b + "," + e + "," + f);

        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;
        System.out.println("a, b, e, f = " + a + "," + b + "," + e + "," + f);

        //Operadores de asignación compuestos/cortos
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("a,b,e,f (usando operadores cortos)= " + a + "," + b + "," + e + "," + f);

        //Operadores condicionales
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));
    }
}