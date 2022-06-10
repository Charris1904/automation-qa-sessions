package session6;

public class Fecha {

    public int dia;
    public int mes;
    public int anho;

    /**
     * Constructor 1
     */
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anho = 2000;
    }

    public Fecha(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anho;
    }
}
