/**
 * Clase Contacto
 * Encargada de simular a un contacto y contiene sus caracteristicas.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public class Contacto {
    //---------------------------PROPIEDADES-------------------------
    private String nombre;
    private String numero;

    //---------------------------MÉTODOS-----------------------------
    /****************************************************************
     * Contacto: instancia los valores de los contatos
     * @param nombre
     * @param numero
     */
    public Contacto(String nombre, String numero){
        this.nombre = nombre;
        this.numero = numero;
    }
    //****************************************************************

    /*****************************************************************
     * toString: muestra las propiedades del contacto como un String
     */
    public String toString(){
        return nombre + "- "  + numero;
    }
}
