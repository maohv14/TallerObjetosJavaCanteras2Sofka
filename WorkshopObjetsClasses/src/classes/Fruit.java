package classes;
/**
 * Se importa libreria que permita trabajar con atributos del tipo arreglo
 */
import java.util.ArrayList; 

/**
 * Clase que permite definir atributos y metodo Setter y Getter de la Fruta 
 * para obtner o modificar los atributos.
 * @author Mauro Villada Villada
 */
public class Fruit {
    /**
     * Definición de atributos
     */
    private String name;
    private float averageWeight;
    private ArrayList<String> color = new ArrayList<>();

    /**
     * Método ara obtener el color de asociado al atributo color
     * @return 
     */
    public ArrayList<String> getColor() {
        return color;
    }
    /**
     * Método para asignar color al atributo color
     * @param color 
     */
    public void setColor(ArrayList<String> color) {
        this.color = color;
    }
    /**
     * Método para obtener el el atributo name
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * Método para modificar el atributo name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Método para obtener el el atributo del peso medio
     * @return 
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    /**
     * Método para modificar el el el atributo peso medio
     * @param averageWeight 
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    
    

}
