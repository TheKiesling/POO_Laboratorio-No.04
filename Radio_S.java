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
    
    public String modo_telefono(){
        return "Se ha activado el modo telefono.";
    }

    public String modo_productividad(String cosa){
        return "Se ha activado el modo productividad." + cosa;
    }

    public String Cambiar_bocinas_auriculares(){
        return "Se ha cambiado de bocinas a auriculares.";
    }

    public String planificar_viaje(String destino){
        String msg = "Se ha planificado el viaje hacia "+destino+".";
        return msg;
    }
}
