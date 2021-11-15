/**
 * Clase Radio_S
 * Encargada de simular a la radio tipo S, hereda de Radio.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public class Radio_S extends Radio{

    //---------------------------MÉTODOS-----------------------------
    
    /****************************************************************
     * modo_telefono: realiza la funcion especifica del modo telefono
     */
    public String modo_telefono(){
        return "\nSe ha cambiado de bocinas a auriculares.";
    }
    //***************************************************************

    /****************************************************************
     * modo_productividad: realiza la funcion especifica del modo productividad
     */
    public String modo_productividad(String cosa){
        String msg = "\nSe ha planificado el viaje hacia "+cosa+".";
        return msg;
    }
    //***************************************************************

}
