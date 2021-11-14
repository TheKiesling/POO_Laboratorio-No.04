import java.util.ArrayList;

public abstract class Radio implements Radio_basica, Modo_radio, Modo_reproduccion,Modo_telefono{
    protected int volumen;
    protected double estacion;
    protected double[] estaciones;
    protected ArrayList<Contacto> contactos;
    protected ArrayList<Playlist> playlists;
    protected Playlist playlist;
    protected Cancion cancion;
    protected String frecuencia;
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

    }
    public String escuchar(){

    }
    public String seleccionar(int index){
        playlist=playlists.get(index);
        return "Se ha seleccionado la playlist: "+playlist.toString();
    }

}
