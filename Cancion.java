/**
 * Clase Cancion
 * Encargada de simular a una cancion y contiene sus caracteristicas.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public class Cancion {
    String artista;
    String duracion;
    String nombre;
    public Cancion(String nombre, String artista, String duracion){
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }
    public String toString(){
        return "Nombre: "+nombre+"  Artista: "+artista+"  Duracion: "+duracion;
    }
}
