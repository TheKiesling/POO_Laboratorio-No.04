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
                radio = new RadioA(); 
            }

            if (tipo == 2){
                radio = new RadioC();
            }

            if (tipo == 3){
                radio = new RadioS();
            }

            carro = new Carro(radio);

            int opcion = -1;

            boolean encendido = carro.getEncendido();
            if (encendido){
                while (opcion != 7){
                    //Despliegue de las opciones del menú y su previa lectura de dicha opción
                    opcion = vista.menuOpcionesEndendido();

                    if (opcion == 1){ //Apagar el radio
                        radio.encender(false);
                    }

                    if (opcion == 2){
                        int volumen = vista.pedirVolumen();
                        carro.Volumen(volumen);
                    }

                    if (opcion == 3){ //Modo Radio
                        int opcionRadio = vista.menuOpcionesRadio();
                        String modoRadio = "";
                        if (opcionRadio == 2){ //Cambiar emisora
                            int emisora = vista.CambiarEmisora();
                            modoRadio = carro.Radio(opcionRadio, emisora);
                        }
                        else if (opcionRadio == 4){ //Cargar Emisora
                            int emisora = vista.CargarEmisora();
                            modoRadio = carro.Radio(opcionRadio, emisora);
                        }
                        else{ //Cambiar de FM a AM o Guardar Emisora
                            modoRadio = carro.Radio(opcionRadio);
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
                            int cancion = vista.pedirCambiarCancion();
                            carro.cambiar(cancion);
                        }
                        if (opcionReproduccion == 3){ //Reproducir canción
                            String cancion = carro.reproducir();
                            vista.mostrar(cancion);
                        }
                    }

                    if (opcion == 5){ //Modo Teléfono
                        int opcionTelefono = vista.menuOpcionesTelefono(tipo);
                        String telefono = carro.telefono(opcionTelefono);
                        vista.mostrar(telefono);
                    }

                    if (opcion == 6){ //Modo Productividad
                        String cosa = vista.pedirCosa(tipo);
                        String productividad = carro.Productividad(tipo, cosa);
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
