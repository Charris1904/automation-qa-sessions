package session5.exercise.E2;

/**
 * Crear una clase Numeros que realice la suma, resta, multiplicacion y division de numeros
 */
public class Numeros {

    double numero1;
    double numero2;

    public double suma(Numeros numeros) {
        double resultadoSuma = numeros.numero1 + numeros.numero2;
        return resultadoSuma;
    }

    public double resta(Numeros numeros) {
        double resultadoSuma = numeros.numero1 - numeros.numero2;
        return resultadoSuma;
    }

    public double multiplicacion(Numeros numeros) {
        double resultadoSuma = numeros.numero1 * numeros.numero2;
        return resultadoSuma;
    }

    public double division(Numeros numeros) {
        double resultadoSuma = numeros.numero1 / numeros.numero2;
        return resultadoSuma;
    }
}
