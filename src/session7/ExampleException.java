package session7;

public class ExampleException {
    public static void main(String[] args) {

        /*int numeroUno = 5;
        Integer numeroDos = null;

        System.out.println(numeroUno / numeroDos);*/

        //Division 0
        /*try {
            int numeroUno = 5;
            int numeroDos = 0;

            System.out.println(numeroUno / numeroDos);

        } catch (ArithmeticException exception) {
            System.out.println("Error : " + exception.getMessage());
        } finally {
            System.out.println("Bloque Finally");
        }*/

        //Null
        /*try {
            int numeroUno = 5;
            Integer numeroDos = null;

            System.out.println(numeroUno / numeroDos);

        } catch (NullPointerException e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            System.out.println("Bloque Finally");
        }*/

        try {
            int numeroUno = 5;
            int num = 0;
            Integer numeroDos = null;

            System.out.println(numeroUno / numeroDos);

            System.out.println(numeroDos);
            System.out.println(numeroUno);

        } catch (NullPointerException e) {
            System.out.println("Null Error : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error : " + e.getMessage());
        } finally {
            System.out.println("Bloque Finally");
        }
    }
}
