package classes;
import java.util.Scanner;

/**
 * Clase  de operaciones matemáticas basicas que permite definir atributos y 
 * metodos para realizar las diferentes operaciones.
 * @author Mauro Villada
 */
public class MathOperations {

    /**
     * Definición de atributos
     */
    protected int value1, value2;
    private int result = 0;
    Scanner input = new Scanner(System.in);

    /**
     * Metodo que permite solicitar datos por teclado y capturarlos en las 
     * variables con las cuales se va a ejutar las operaciones.
     */
    private void RequestData() {
        System.out.print("Ingrese el primer valor: ");
        value1 = input.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        value2 = input.nextInt();
    }
    /**
     * Método que imprime el resultado en pantalla
     */
    private void PrintResult() {
        System.out.println(getResult());
    }
    /**
     * Método para poder acceder a la variable de tipo privada desde una 
     * instancia de la clase.
     * @return  resultado.
     */
    public int getResult() {
        return result;
    }
    /**
     * Método que permite modificar la variable de tipo privada result desde una
     * instancia de la clase.
     * @param result 
     */
    public void setResult(int result) {
        this.result = result;
    }
    /**
     * Método que sumar es imprimir en pantalla el resultado
     */
    public void Sum() {
        RequestData();
        setResult(value1 + value2);
        System.out.print("El resultado de la suma es: ");
        PrintResult();
    }
    /**
     * Método que restar es imprimir en pantalla el resultado
     */
    public void Subtract() {
        RequestData();
        setResult(value1 - value2);
        System.out.print("El resultado de la Resta es: ");
        PrintResult();
    }
    /**
     * Método que multiplicar es imprimir en pantalla el resultado
     */
    public void Multiplication() {
        RequestData();
        setResult(value1 * value2);
        System.out.print("El resultado de la multiplicación es: ");
        PrintResult();
    }
    /**
     * Método que dividir es imprimir en pantalla el resultado
     */
    public void Division() {
        RequestData();
        setResult(value1 / value2);
        System.out.print("El resultado de la división es: ");
        PrintResult();
    }
}
