import java.util.ArrayList;

/**
 * Clase Radio
 * Encargada de simular a la radio, sus acciones, propiedades y metodos.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

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
    protected Contacto ultimoContacto;
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
        contactos.add(new Contacto("Mama", "12345678"));
        contactos.add(new Contacto("Papa", "87654321"));
        contactos.add(new Contacto("Novia1", "14725836"));
        contactos.add(new Contacto("Novia2", "14725839"));
        ncancion=0;
        telefono = false;
        llamada = false;
    }
    
    /****************************************************************
     * Encender: mensaje de radio encendida
     * @return mensaje
     */
    public String encender(){
        return "La radio ha sido encendida.";
    }
    //***************************************************************

    /****************************************************************
     * Apagar: mensaje de radio apagada
     * @return mensaje
     */
    public String apagar(){
        return "La radio ha sido apagada.";
    }
    //***************************************************************

    /****************************************************************
     * volumen: subir y bajar volumen
     * @return volumen
     * @param sb
     */
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
    //***************************************************************

    /****************************************************************
     * Cambiar_fm_am: cambia la frecuencia de la radio
     * @return frecuencia
     */
    public String cambiar_fm_am(){
        if(frecuencia.equals("FM")){
            frecuencia="AM";
        }else{
            frecuencia="FM";
        }
        return "Se ha cambiado a "+frecuencia;
    }
    //***************************************************************

    /****************************************************************
     * cambiar_emisora: cambia la frecuencia de la radio
     * @return emisora
     * @param emisora
     */
    public String cambiar_emisora(int emisora){
        estacion += emisora;
        return "Se ha cambiado a la estacion "+estacion;
    }
    //***************************************************************

    /****************************************************************
     * guardar_emisora: guardar la emisora
     * @return estacion
     * @param index
     */
    public String guardar_emisora(int index){
        estaciones[index]=estacion;
        return "Estacion "+estacion+" guardada en ("+index+")";
    }
    //***************************************************************

    /****************************************************************
     * cargar emisora: carga la emisora seleccionada
     * @return mensaje
     * @param index
     */
    public String cargar_emisora(int index){
        estacion=estaciones[index];
        return "La estacion "+estacion+" ha sido cargada";
    }
    //***************************************************************

    /****************************************************************
     * cambiar: cambiar cancion
     * @return mensaje
     * @param sb
     */
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
    //***************************************************************

    /****************************************************************
     * escuchar: escuchar cancion
     * @return mensaje
     */
    public String escuchar(){
        if(cancion !=null){
            return "Se ha iniciado la cancion "+cancion.toString();
        }else{
            return "No se ha seleccionado una cancion";
        }
    }
    //***************************************************************

    /****************************************************************
     * seleccionar: seleccionar playlist
     * @return mensaje
     * @param index
     */
    public String seleccionar(int index){
        playlist=playlists.get(index);
        ncancion=0;
        cancion = playlist.getCancion(ncancion);
        return "Se ha seleccionado la playlist: "+playlist.toString();
    }
    //***************************************************************

    /****************************************************************
     * conectar: contectar telefono
     * @return mensaje
     */
    public String conectar(){
        telefono = true;
        return "Telefono conectado";
    }
    //***************************************************************

    /****************************************************************
     * mostrar_contactos: mostrar contactos
     * @return contacto
     */
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
    //***************************************************************

    /****************************************************************
     * llamar_contacto: llamar al contacto seleccionado
     * @return contacto
     * @param index
     */
    public String llamar_contacto(int index){
        if(telefono){
            llamada = true;
            ultimoContacto = contactos.get(index);
            return "Llamando a: "+contactos.get(index).toString();
        }else{
            return "No se ha conectado un telefono";
        }
    }
    //***************************************************************

    /****************************************************************
     * finalizar_llamada: finaliza llamada
     * @return mensaje
     */
    public String finalizar_llamada(){
        if(llamada){
            llamada=false;
            return "Llamada finalizada";
        }else{
            return "No hay una llamada activa";
        }
    }
    //***************************************************************

    /****************************************************************
     * getPlaylist: regresa las playlist
     * @return playlists
     */
    public String getPlaylists(){
        String str_playlist="";
        for(int i=0;i<playlists.size();i++){
            str_playlist+="("+i+")  "+playlists.get(i).toString()+"\n";
        }   
        return str_playlist;
    }
    //***************************************************************
    
    public abstract String modo_telefono();

    public abstract String modo_productividad(String cosa);

    
}
