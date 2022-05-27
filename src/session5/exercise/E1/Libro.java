package session5.exercise.E1;

/**
 * Crear una clase Libro que contenga los siguientes atributos:
 * – ISBN
 * – Titulo
 * – Autor
 * – Número de páginas
 * Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:
 * “El libro con ISBN creado por el autor tiene páginas”
 * Crear una clase Main y crear 2 objetos Libro (los valores que se quieran) y mostrarlos por consola.
 * Por último, indicar cuál de los 2 tiene más páginas.
 */
public class Libro {
    int ISBN;
    String titulo;
    String autor;
    int numPaginas;

    @Override
    public String toString() {
        return "El libro " + titulo + " con ISBN " + ISBN + ""
                + " creado por el autor " + autor
                + " tiene " + numPaginas + " páginas";
    }

}
