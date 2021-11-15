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
