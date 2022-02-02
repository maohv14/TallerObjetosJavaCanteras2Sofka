
package classes;

/**
 * Clase principal que permite crear un objeto de la clase MathOpeations y hacer
 * instancia del metodo para mutiplicar.
 * @author Mauro Villada
 */
public class MainClass {
    public static void main(String[] args) {
        MathOperations operation = new MathOperations();
        operation.Multiplication();
        System.out.println("El doble del resultado es: " + 2*(operation.getResult()));
    }
}

