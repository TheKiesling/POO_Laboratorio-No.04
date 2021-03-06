import java.util.ArrayList;

/**
 * Clase Playlist
 * Encargada de simular a una playlist musical, contiene Canciones.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public class Playlist {
    //---------------------------PROPIEDADES-------------------------
    String nombre;
    ArrayList<Cancion> canciones;

    //---------------------------MÉTODOS-----------------------------
    /****************************************************************
     * Playlist: asigna el nombre a la playlist y le instancia 3 canciones
     * @param nombre
     */
    public Playlist(String nombre){
        canciones = new ArrayList<Cancion>();
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
    //***************************************************************

    /****************************************************************
     * toString(): muestra las propiedades de la playlist como un String
     */
    public String toString(){
        return nombre;
    }
    //***************************************************************

    /****************************************************************
     * getCancion: devuelve la cancion que indica el usuario vía índice
     * @param index
     * @return
     */
    public Cancion getCancion(int index){
        return canciones.get(index);
    }
    //***************************************************************
}
