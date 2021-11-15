/**
 * Interfaz Modo_radio
 * Posee todo lo basico relacionado al modo radio.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 15/10/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * José P. Kiesling L. - 21581
 * Andrés E. Montoya W. - 21552
 */

public interface Modo_radio {
    public String cambiar_fm_am();
    public String cambiar_emisora(int emisora);
    public String guardar_emisora(int emisora);
    public String cargar_emisora(int index);
}
