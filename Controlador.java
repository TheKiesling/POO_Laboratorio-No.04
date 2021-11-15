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

            //Mostrar el Radio que se va a crear
            int tipo = vista.mostrarMenuRadio();

            if (tipo == 1){ //Radio A
                radio = new Radio_A(); 
            }

            if (tipo == 2){ //Radio C
                radio = new Radio_C();
            }

            if (tipo == 3){ //Radio S
                radio = new Radio_S();
            }

            carro = new Carro(radio); //Instancia de carro

            int opcion = -1;

            boolean bandera = true;
            while(bandera){ //Mientras no salga
                boolean encendido = carro.getEncendido();
                    while (opcion != 7 && encendido == true){ //Mientras esté encendido
                        //Despliegue de las opciones del menú y su previa lectura de dicha opción
                        opcion = vista.mostrarMenu();

                        if (opcion == 1){ //Apagar el radio
                            carro.encender(false);
                            encendido = false;
                        }

                        if (opcion == 2){ //Cambiar Volumen
                            boolean volumen = vista.pedirVolumen();
                            String volumenRadio = carro.volumen(volumen);
                            vista.mostrar(volumenRadio);
                        }

                        if (opcion == 3){ //Modo Radio
                            int opcionRadio = vista.mostrarMenuModoRadio();
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
                            int opcionReproduccion = vista.mostrarMenuReproduccion();
                            if (opcionReproduccion == 1){ //Seleccionar Playlist
                                vista.mostrar(radio.getPlaylists());
                                int lista = vista.pedirLista();
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
                            int opcionTelefono = vista.mostrarMenuTelfono(tipo);
                            String telefono = "";
                            if (opcionTelefono == 3){
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

                        if (opcion == 7){ //Salir
                            vista.despedida();
                            bandera = false;
                        }
                    }
                    while (opcion != 2 && encendido == false){
                        opcion = vista.mostrarMenuApagado();

                        if (opcion == 1){ //Encender el radio
                            carro.encender(true);
                            encendido = true;
                        }

                        if (opcion == 2){ //Salir
                            vista.despedida();
                            bandera = false;
                        }
                    }
            }
        } catch (Exception e){
            String s = "ERROR: " + e.getMessage();
            vista.error(s);
        }
    }
}
