package session6.herencia.conHerencia;

//Clase hija. Al agregar extends todos los atributos de Persona pueden ser usados en Empleado
public class Empleado extends Persona{

    private String empleadoID;
    private String cargo;

    public Empleado(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
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

    @Override
    public String toString() {
        return "Empleado{" +
                "empleadoID='" + empleadoID + '\'' +
                ", cargo='" + cargo + '\'' +
                "} " + super.toString();
    }
}
