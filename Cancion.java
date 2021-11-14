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
