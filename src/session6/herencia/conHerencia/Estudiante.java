package session6.herencia.conHerencia;

public class Estudiante extends Persona{

    private String carnet;
    private int grado;

    public Estudiante(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carnet='" + carnet + '\'' +
                ", grado=" + grado +
                "} " + super.toString();
    }
}
