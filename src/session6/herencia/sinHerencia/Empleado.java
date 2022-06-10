package session6.herencia.sinHerencia;

public class Empleado {

    private String nombre;
    private int edad;
    private String genero;
    private String empleadoID;
    private String cargo;

    public String getNombre() {
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(String empleadoID) {
        this.empleadoID = empleadoID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
