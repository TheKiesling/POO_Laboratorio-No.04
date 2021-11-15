public class Radio_A extends Radio{
   
    public String modo_telefono(){
        return "Se ha activado el modo telefono.";
    }

    public String modo_productividad(String cosa){
        return "Se ha activado el modo productividad." + cosa;
    }

    public String Llamar_ultimo_contacto(){
        return "Se esta llamando al ultimo contacto";
    }

    public String Ver_tarjeta_presentacion(String nombre){
        return nombre;
    }
}
