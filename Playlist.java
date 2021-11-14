import java.util.ArrayList;

public class Playlist {
    String nombre;
    ArrayList<Cancion> canciones;
    public Playlist(String nombre){
        this.nombre=nombre;
        if(nombre.equals("Rancheras")){
            canciones.add(new Cancion());
        }
        if(nombre.equals("Rock")){
            canciones.add(new Cancion("Hey You", "Pink Floyd","4:38"));
            canciones.add(new Cancion("One", "Metalica","7:27"));
            canciones.add(new Cancion("Losing my religion", "R.E.M.","4:28"));
        }
        if(nombre.equals("Clasicas")){
            canciones.add(new Cancion());
        }
    }
    public String toString(){
        return nombre;
    }
}
