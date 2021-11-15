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
    private String nombre;
    private String numero;

    public Contacto(String nombre, String numero){
        this.nombre = nombre;
        this.numero = numero;
    }

    public String toString(){
        return nombre + ": "  + numero;
    }
}
