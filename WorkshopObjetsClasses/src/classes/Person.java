package classes;
/**
 * Se importan librerias que permita trabajar con atributos tipo Date
 */
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 * Clase que permite definir atributos y metodo Setter y Getter de Persona
 *
 * @author Mauro Villada
 */
public class Person {
    /**
     * Definición de atributos
     */
    public String name;
    private int userID;
    public String lastName1, lastName2;
    public Date dateBirth;
    public float height;
    /**
     * Permite obtner el nombre
     * @return noimbre
     */
    public String getName() {
        return name;
    }
    /**
     * Permite modificar la varible name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Metodo para que se pueda obtener el UserID
     * @return Identificación del usuario 
     */
    public int getUserID() {
        return userID;
    }
    /**
     * Método para modificar la identificación de usuario
     * @param userID 
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

}
