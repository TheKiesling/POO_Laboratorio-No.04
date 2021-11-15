/**
 * Clase Radio_C
 * Encargada de simular a la radio tipo C, hereda de Radio.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public class Radio_C extends Radio{
    
    public String modo_telefono(){
        return "\nSe ha puesto la llamada en espera";
    }

    public String modo_productividad(String cosa){
        String msg = "\nEl pronostico del dia de hoy "+"["+cosa+"]"+" es: \nSoleado";
        return msg;
    }
}
