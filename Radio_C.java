public class Radio_C extends Radio{
    
    public String modo_telefono(){
        return "Se ha activado el modo telefono.";
    }

    public String modo_productividad(String cosa){
        return "Se ha activado el modo productividad." + cosa;
    }

    public String Cambiar_llamada_espera(){
        return "Se ha colocado la llamada en espera.";
    }

    public String pronostico_tiempo(String dia){
        String msg = "El pronostico del dia de hoy "+"["+dia+"]"+" es: \nSoleado";
        return msg;
    }
}
