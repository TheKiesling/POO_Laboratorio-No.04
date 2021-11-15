public class Contacto {
    private String nombre;
    private String numero;

    public Contacto(String nombre, String numero){
        this.nombre = nombre;
        this.numero = numero;
    }

    public String toString(){
        return nombre + ": "  + numero;
    }
}
