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
    //---------------------------PROPIEDADES-------------------------
    String artista;
    String duracion;
    String nombre;

    //---------------------------MÉTODOS-----------------------------
    /****************************************************************
     * Cancion: instancia los datos de la cancion
     * @param nombre
     * @param artista
     * @param duracion
     */
    public Cancion(String nombre, String artista, String duracion){
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }
    //***************************************************************

    /****************************************************************
     * toString(): muestra las propiedades de la cancion como un String
     */
    public String toString(){
        return "Nombre: "+nombre+"  Artista: "+artista+"  Duracion: "+duracion;
    }
    //***************************************************************
}
