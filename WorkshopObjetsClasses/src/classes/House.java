package classes;

/**
 * Representa la definición de atributos y metos setter y getter para una casa.
 *
 * @author Mauro Villada
 */
public class House {

    /**
     * Se definen atributos de la clase Casa
     */
    private String address;
    public String color, size, material;
    public int rooms, windows, doors;

    /**
     * Obtener la dirección.
     * @return Dirección
     */
    public String getAddress() {
        return address;
    }

    /**
     * Permite modificar la variable adress
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
