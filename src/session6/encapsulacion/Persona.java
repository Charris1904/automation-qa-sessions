package session6.encapsulacion;

public class Persona {

    private String nombre;
    private int edad;
    private double peso;

    //Metodos Gets & Sets
   /* public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            this.nombre = "Indefinido";
            System.out.println("Error! El nombre no puede ser vacio");
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 100) {
            this.edad = 0;
            System.out.println("Error! El rango de edad debe ser 0 - 100");
        } else {
            this.edad = edad;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0 || peso > 200) {
            this.peso = 0;
            System.out.println("Error! El rango de peso debe ser 0 - 200 kg");
        } else {
            this.peso = peso;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}
