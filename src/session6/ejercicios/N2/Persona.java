package session6.ejercicios.N2;

public class Persona {
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private double peso;
    private double altura;

    private void comprobarSexo() {
        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        }
    }

    public boolean identificarCedula(String cedula) {
        boolean isNacional = false;
        if (cedula.length() == 8) {
            isNacional = true;
        } else if (cedula.length() == 12) {
            isNacional = false;
        }
        return isNacional;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Calcula el indice de masa corporal
     *
     * @return codigo numerico
     * -1: la persona esta por debajo de su peso ideal</li>
     * 0: la persona esta en su peso ideal</li>
     * 1: la persona esta por encima de su peso ideal</li></ul>
     */
    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return 0;
        } else if (pesoActual < 20) {
            return -1;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "Cedula: " + cedula + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
}
