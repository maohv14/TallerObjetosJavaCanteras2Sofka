
package classes;

/**
 * Clase  Auto que permite definir atributos y metodos Setter y Getter para obtner o
 * modificar los atributos.
 * @author Mauro Villada
 */
public class Car {
    /**
     * Definición de atributos
     */
    public String brand, color, category, model;
    public float weight;
    private boolean start = false;

    /**
     * Metodo constructor que permite asignar, modificar y obtener los atributos
     * @param brand Marca del auto
     * @param color Color del auto
     * @param category Categoria, Ej: deportivo, carga, transporte, etc.
     * @param model Modelo del auto
     * @param weight Peso del auto.
     */
    public Car(String brand, String color, String category, String model, float weight) {
        this.brand = brand;
        this.color = color;
        this.category = category;
        this.model = model;
        this.weight = weight;
    }
    /**
     * Méto para obtener el estado buleano del estado de encendido del auto
     * @return 
     */  
    public boolean getStart() {
        return start;
    }
    /**
     * Méto para alterar el estado buleano del encendido del carro.
     * @param start 
     */
    public void setStart(boolean start) {
        this.start = start;
    }
    
    
}
