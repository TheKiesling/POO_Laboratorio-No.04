/**
 * Interfaz Modo_telefono
 * Posee todo lo basico relacionado al modo telefono.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public interface Modo_telefono {
    public String conectar();
    public String mostrar_contactos();
    public String llamar_contacto(int index);
    public String finalizar_llamada();
}
