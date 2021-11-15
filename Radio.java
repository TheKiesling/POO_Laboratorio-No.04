import java.util.ArrayList;

public abstract class Radio implements Radio_basica, Modo_radio, Modo_reproduccion,Modo_telefono, Telefono_productividad{
    protected int volumen;
    protected double estacion;
    protected double[] estaciones;
    protected ArrayList<Contacto> contactos;
    protected ArrayList<Playlist> playlists;
    protected Playlist playlist;
    protected Cancion cancion;
    protected int ncancion;
    protected String frecuencia;
    protected boolean telefono;
    protected boolean llamada;
    public Radio(){
        volumen =0;
        estacion=0.5;
        estaciones= new double[50];
        contactos=new ArrayList<Contacto>();
        playlists=new ArrayList<Playlist>();
        playlist=null;
        frecuencia="FM";
        playlists.add(new Playlist("Rancheras"));
        playlists.add(new Playlist("Rock"));
        playlists.add(new Playlist("Clasicas"));
        ncancion=0;
        telefono = false;
        llamada = false;
    }
    
    public String encender(){
        return "La radio ha sido encendida.";
    }

    public String apagar(){
        return "La radio ha sido apagada.";
    }
    
    public String volumen(boolean sb){
        if(sb){
            if(volumen<100)
                volumen++;
        }else{
            if(volumen>0)
                volumen --;
        }
        return "Volumen: "+volumen;
    }
    public String cambiar_fm_am(){
        if(frecuencia.equals("FM")){
            frecuencia="AM";
        }else{
            frecuencia="FM";
        }
        return "Se ha cambiado a "+frecuencia;
    }
    public String cambiar_emisora(int emisora){
        estacion += emisora;
        return "Se ha cambiado a la estacion "+estacion;
    }
    public String guardar_emisora(int index){
        estaciones[index]=estacion;
        return "Estacion "+estacion+" guardada en ("+index+")";
    }
    public String cargar_emisora(int index){
        estacion=estaciones[index];
        return "La estacion "+estacion+" ha sido cargada";
    }
    public String cambiar(boolean sb){
        if(playlist!=null){
            if(sb){
                if(ncancion<3)
                    ncancion++;
                    cancion = playlist.getCancion(ncancion);
            }else{
                if(ncancion>0)
                    ncancion --;
                    cancion = playlist.getCancion(ncancion);
            }
            return "Se ha seleccionado la cancion: "+cancion.toString();
        }else{
            return "No se ha seleccionado una playlist";
        }
    }
    public String escuchar(){
        if(cancion !=null){
            return "Se ha iniciado la cancion "+cancion.toString();
        }else{
            return "No se ha seleccionado una cancion";
        }
    }
    public String seleccionar(int index){
        playlist=playlists.get(index);
        ncancion=0;
        cancion = playlist.getCancion(ncancion);
        return "Se ha seleccionado la playlist: "+playlist.toString();
    }
    public String conectar(){
        telefono = true;
        return "Telefono conectado";
    }
    public String mostrar_contactos(){
        if(telefono){
            String contact="";
            for(int i=0;i<contactos.size();i++){
                contact+="("+i+") "+contactos.get(i).toString()+"\n";
            }
            return contact;
        }else{
            return "No se ha conectado un telefono";
        }
    }
    public String llamar_contacto(int index){
        if(telefono){
            llamada = true;
            return "Llamando a: "+contactos.get(index).toString();
        }else{
            return "No se ha conectado un telefono";
        }
    }
    public String finalizar_llamada(){
        if(llamada){
            llamada=false;
            return "Llamada finalizada";
        }else{
            return "No hay una llamada activa";
        }
    }
    public abstract String modo_telefono();

    public abstract String modo_productividad(String cosa);

    
}
