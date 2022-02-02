package classes;

/**
 * Clase que permite definir atributos y metodos Setter y Getter para obtner o
 * modificar los atributos.
 * @author Mauro Villada
 */
public class BankAccount {
    /**
     * Definición de atributos
     */
    private int accountNumber;
    protected boolean activated = true;
    /**
     * Metodo que permite obtener el estado de la cuenta bancaria
     * @return  valor buleano de si la cuenta esta activa o no
     */
    public boolean getActivated() {
        return activated;
    }
    /**
     * Métod que permite alterar el estado de la cuenta bancaria
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Método para modificar el número de cuenta
     * @return Núemoro de cuenta
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * Métod para modificar el número de cuenta
     * @param accountNumber 
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

}
