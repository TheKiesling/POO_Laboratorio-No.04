/**
 * Interfaz Modo_reproduccion
 * Posee todo lo basico relacionado al modo reproduccion.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public interface Modo_reproduccion {
    public String cambiar(boolean sb);
    public String escuchar();
    public String seleccionar(int index);
}
