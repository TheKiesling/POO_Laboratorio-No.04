import java.util.ArrayList;

public abstract class Radio implements Radio_basica, Modo_radio, Modo_reproduccion,Modo_telefono{
    protected int volumen;
    protected int estacion;
    protected int[] estaciones;
    protected ArrayList<Contacto> contactos;
    protected ArrayList<Playlist> playlists;
    public String volumen(boolean sb){
        
    }

}
