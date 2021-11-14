import java.util.ArrayList;

public class Playlist {
    String nombre;
    ArrayList<Cancion> canciones;
    public Playlist(String nombre){
        this.nombre=nombre;
        if(nombre.equals("Reggaeton")){
            canciones.add(new Cancion("Si tu supieras", "Feid", "3:16"));
            canciones.add(new Cancion("Fiel", "Los legendarios", "4:22"));
            canciones.add(new Cancion("512", "Mora", "3:14"));
        }
        if(nombre.equals("Rock")){
            canciones.add(new Cancion("Hey You", "Pink Floyd","4:38"));
            canciones.add(new Cancion("One", "Metalica","7:27"));
            canciones.add(new Cancion("Losing my religion", "R.E.M.","4:28"));
        }
        if(nombre.equals("DanceHall")){
            canciones.add(new Cancion("Ley Seca", "Jhay Cortez", "4:24"));
            canciones.add(new Cancion("2/Catorce", "Rauw Alejandro", "3:32"));
            canciones.add(new Cancion("Dakiti", "Bad Bunny", "3:25"));
        }
    }
    public String toString(){
        return nombre;
    }
    public Cancion getCancion(int index){
        return canciones.get(index);
    }
}
