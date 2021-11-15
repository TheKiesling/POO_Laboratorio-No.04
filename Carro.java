public class Carro {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Carro.java
    @version: 
        - Creación: 13/11/2021
        - Última modificación: 13/11/2021

    Clase que gestiona al radio vía polimorfismo
    */

    //---------------------------PROPIEDADES-------------------------
    private Radio radio;
    private boolean encendido;

    //---------------------------MÉTODOS-----------------------------

    /****************************************************************
     * Radio: instancia el radio al carro
     * @param radio
     */
    public Carro(Radio radio){
        this.radio = radio;
    }
    //***************************************************************

    /****************************************************************
     * getEncendido: retorna el estado del radio
     * @return
     */
    public boolean getEncendido(){
        return encendido;
    }
    //***************************************************************

    /****************************************************************
     * encender: Enciende o apaga el radio
     * @param encender
     * @return estado del radio
     */
    public String encender(boolean encender){
        String encenderApagar ="";
        if (encender){
            encenderApagar = radio.encender();
            encendido = true;
            encenderApagar = "Se ha encendido el radio";
        }
        else{
            encenderApagar = radio.apagar();
            encendido = false;
            encenderApagar = "Se ha apagado el radio";
        }
        return encenderApagar;
    }
    //***************************************************************

    /****************************************************************
     * volumen: sube o baja el volumen
     * @param volumen
     * @return estdo del volumen
     */
    public String volumen(boolean volumen){
        return radio.volumen(volumen);
    }
    //***************************************************************
    
    /****************************************************************
     * cambiar_fm_am: cambia la banda de la radio
     * @return banda
     */
    public String cambiar_fm_am(){
        return radio.cambiar_fm_am();
    }
    //***************************************************************

    /****************************************************************
     * radio: efectúa una operación básica de radio
     * @param accion
     * @param emisora
     * @return operación efectuada
     */
    public String radio(int accion, int emisora){
        String operacion = "";
        if (accion == 2)
            operacion = radio.cambiar_emisora(emisora);
        if (accion == 3)
            operacion = radio.guardar_emisora(emisora);
        if (accion == 4)
            operacion = radio.cargar_emisora(emisora);
        return operacion;
    }
    //***************************************************************

    /****************************************************************
     * setLista: indica la lista de reproducción
     * @param lista
     */
    public void lista(int lista){
        radio.seleccionar(lista);
    }
    //***************************************************************

    /****************************************************************
     * cambiar: cambia de canción
     * @param cancion
     */
    public void cambiar(boolean cancion){
        radio.cambiar(cancion);
    }
    //***************************************************************

    /****************************************************************
     * reproducir: reproduce la canción
     * @return cancion
     */
    public String reproducir(){
        return radio.escuchar();
    }
    //***************************************************************

    /****************************************************************
     * telefono: realiza una acción de telefono
     * @param accion
     * @return
     */
    public String telefono(int accion){
        String telefono = "";
        if (accion == 1){
            telefono = radio.conectar();
        }
        if (accion == 2){
            telefono = radio.mostrar_contactos();
        }
        if (accion == 4){
            telefono = radio.finalizar_llamada();
        }
        if(accion == 5){
            telefono = radio.modo_telefono();
        }
        return telefono;
    }
    //***************************************************************

    /****************************************************************
     * llamar: llama al contacto que se le provee
     * @param contacto
     * @return
     */
    public String llamar(int contacto){
        return radio.llamar_contacto(contacto);
    }
    //***************************************************************

    /****************************************************************
     * productividad: efectua una operacion de modo productividad 
     * @param cosa
     * @return
     */
    public String productividad(String cosa){
        return radio.modo_productividad(cosa);
    }
    //***************************************************************
}
