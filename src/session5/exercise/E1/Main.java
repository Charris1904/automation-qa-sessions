package session5.exercise.E1;

public class Main {
    public static void main(String args[]) {
        //Creamos lo objetos
        Libro libro1 = new Libro();
        libro1.ISBN = 11111;
        libro1.titulo = "Titulo 1";
        libro1.autor = "Autor 1";
        libro1.numPaginas = 30;

        Libro libro2 = new Libro();
        libro2.ISBN = 22222;
        libro2.titulo = "Titulo 2";
        libro2.autor = "Autor 2";
        libro2.numPaginas = 60;

        //Mostramos su estado
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        //Comparamos quien tiene mas paginas
        if (libro1.numPaginas > libro2.numPaginas) {
            System.out.println(libro1.titulo + " tiene más páginas");
        } else {
            System.out.println(libro2.titulo + " tiene más páginas");
        }
    }
}
