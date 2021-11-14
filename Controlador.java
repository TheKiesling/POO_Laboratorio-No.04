public class Controlador {
/** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Controlador.java
    @version: 
        - Creación: 13/11/2021
        - Última modificación: 13/11/2021

    Clase que comunica el modelo con la vista y controla sus acciones
    */

    //---------------------------MÉTODOS-----------------------------
    public static void main(String[] args) {
        Vista vista = new Vista();
        Carro carro;
        Radio radio = null;

        try{
            //Saludar al usuario
            vista.bienvenida();

            int tipo = vista.pedirTipoRadio();

            if (tipo == 1){
                radio = new Radio_A(); 
            }

            if (tipo == 2){
                radio = new Radio_C();
            }

            if (tipo == 3){
                radio = new Radio_S();
            }

            carro = new Carro(radio);

            int opcion = -1;

            boolean encendido = carro.getEncendido();
            if (encendido){
                while (opcion != 7){
                    //Despliegue de las opciones del menú y su previa lectura de dicha opción
                    opcion = vista.menuOpcionesEndendido();

                    if (opcion == 1){ //Apagar el radio
                        carro.encender(false);
                    }

                    if (opcion == 2){
                        boolean volumen = vista.pedirVolumen();
                        carro.volumen(volumen);
                    }

                    if (opcion == 3){ //Modo Radio
                        int opcionRadio = vista.menuOpcionesRadio();
                        String modoRadio = "";
                        if (opcionRadio == 1){ //Cambiar de FM a AM
                            modoRadio = carro.cambiar_fm_am();
                        }
                        if (opcionRadio == 2){ //Cambiar emisora
                            int emisora = vista.CambiarEmisora();
                            modoRadio = carro.radio(opcionRadio, emisora);
                        }
                        if (opcionRadio == 3){ //Guardar Emisora
                            int emisora = vista.GuardarEmisora();
                            modoRadio = carro.radio(opcionRadio, emisora);
                        }
                        if (opcionRadio == 4){ //Cargar Emisora
                            int emisora = vista.CargarEmisora();
                            modoRadio = carro.radio(opcionRadio, emisora);
                        }
                        vista.mostrar(modoRadio);
                    }

                    if (opcion == 4){ //Modo Reproduccion
                        int opcionReproduccion = vista.menuOpcionesReproduccion();
                        if (opcionReproduccion == 1){ //Seleccionar Playlist
                            int lista = vista.pedirListaReproduccion();
                            carro.lista(lista);
                        }
                        if(opcionReproduccion == 2){ //Cambiar Cancion
                            boolean cancion = vista.pedirCambiarCancion();
                            carro.cambiar(cancion);
                        }
                        if (opcionReproduccion == 3){ //Reproducir canción
                            String cancion = carro.reproducir();
                            vista.mostrar(cancion);
                        }
                    }

                    if (opcion == 5){ //Modo Teléfono
                        int opcionTelefono = vista.menuOpcionesTelefono(tipo);
                        String telefono = "";
                        if (opcionTelefono == 4){
                            int contacto = vista.pedirContacto();
                            telefono = carro.llamar(contacto);
                        }
                        else
                            telefono = carro.telefono(opcionTelefono);
                        vista.mostrar(telefono);
                    }

                    if (opcion == 6){ //Modo Productividad
                        String cosa = vista.pedirCosa(tipo);
                        String productividad = carro.productividad(cosa);
                        vista.mostrar(productividad);
                    }
                }
            }
            else{
                while (opcion != 2){
                    opcion = vista.menuOpcionesApagado();

                    if (opcion == 1){ //Encender el radio
                        carro.encender(true);
                    }

                    if (opcion == 2){ //Salir
                        vista.despedida();
                    }
                }
            }
        } catch (Exception e){
            String s = "ERROR: " + e.getMessage();
            vista.error(s);
        }
    }
}
