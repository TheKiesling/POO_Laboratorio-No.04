/**
 * Clase Radio_A
 * Encargada de simular a la radio tipo A, hereda de Radio.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public class Radio_A extends Radio{
   
    //---------------------------MÉTODOS-----------------------------

    /****************************************************************
     * modo_telefono: realiza la funcion especifica del modo telefono
     */
    public String modo_telefono(){
        return "\nSe esta llamando al ultimo contacto: " + ultimoContacto;
    }
    //***************************************************************

    /****************************************************************
     * modo_productividad: realiza la funcion especifica del modo productividad
     */
    public String modo_productividad(String cosa){
        return "\nTarjeta de presentacion de: " + cosa;
    }
    //***************************************************************
}
