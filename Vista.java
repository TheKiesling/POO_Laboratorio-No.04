import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase Vista
 * Encargada de recibir y mostrarle la información al usuario.
 * 
 * @version 1.0, 13/10/2021
 * finalizacion 14/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

public class Vista {
    //-----PROPIEDADES-----
    Scanner scan = new Scanner(System.in);

    //-----METODOS-----
    /** 
     * Metodo que muestra el menu principal, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-7)
     */
    public int mostrarMenu() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n\n--------------------Menu--------------------");
            System.out.println("Opcion 1: Apagar");
            System.out.println("Opcion 2: Cambiar volumen");
            System.out.println("Opcion 3: Modo Radio");
            System.out.println("Opcion 4: Modo Reproduccion");
            System.out.println("Opcion 5: Modo Telefono");
            System.out.println("Opcion 6: Modo Productividad");
            System.out.println("Opcion 7: Salir\n");
            System.out.println("->Elija una opcion ingresando el numero que la identifica (1-7)");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op < 8 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-7) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }
    
    /** 
     * Metodo que muestra el menu del Modo Radio, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-4)
     */
    public int mostrarMenuRadio() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n\n--------------------Menu Eleccion Radio--------------------");
            System.out.println("Opcion 1: Radio A");
            System.out.println("Opcion 2: Radio C");
            System.out.println("Opcion 3: Radio S");
            System.out.println("->Elija una opcion ingresando el numero que la identifica (1-3)");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op < 4 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-3) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }

    /** 
     * Metodo que muestra el menu del Modo Radio, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-4)
     */
    public int mostrarMenuModoRadio() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n\n--------------------Menu Radio--------------------");
            System.out.println("Opcion 1: Cambiar de FM a AM");
            System.out.println("Opcion 2: Cambiar emisora");
            System.out.println("Opcion 3: Guardar emisora");
            System.out.println("Opcion 4: Cargar emisora");
            System.out.println("->Elija una opcion ingresando el numero que la identifica (1-4)");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op < 5 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-4) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }


    /** 
     * Metodo que muestra el menu del Modo Reproduccion, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-4)
     */
    public int mostrarMenuReproduccion() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n\n--------------------Menu Modo Reproduccion--------------------");
            System.out.println("Opcion 1: Seleccionar lista de reproduccion");
            System.out.println("Opcion 2: Cambiar cancion");
            System.out.println("Opcion 3: Escuchar cancion");
            System.out.println("->Elija una opcion ingresando el numero que la identifica (1-3)");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op < 4 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-3) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }

    /** 
     * Metodo que muestra el menu del Modo Telefono, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-8)
     */
    public int mostrarMenuTelfono(int TipoRadio) throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n\n--------------------Menu Modo Telefono--------------------");
            System.out.println("Opcion 1: Conectar/Desconectar telefono");
            System.out.println("Opcion 2: Mostrar contactos");
            System.out.println("Opcion 3: Llamar a contacto");
            System.out.println("Opcion 4: Finalizar llamada");
            
            if(TipoRadio==1){
                System.out.println("Opcion 5: Cambiar bocinas o auriculares");
            }else if(TipoRadio==2){
                System.out.println("Opcion 5: Llamar al ultimo contacto");
            }else if(TipoRadio==3){
                System.out.println("Opcion 5: Cambiar a llamada en espera");
            }
            
            System.out.println("->Elija una opcion ingresando el numero que la identifica (1-5)");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op < 6 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-5) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }

    public int mostrarMenuApagado() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n\n--------------------Menu--------------------");
            System.out.println("Opcion 1: Encender la radio");
            System.out.println("Opcion 2: Salir\n");
            System.out.println("->Elija una opcion ingresando el numero que la identifica (1-2)");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op < 3 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-2) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }

    /** 
     * Metodo que imprime la bienvenida.
     */
    public void bienvenida(){
        System.out.println("\n - Bienvenido a su asistente de radio Mercedes-Benz -\n\n");
    }

    public String pedirCosa(int tipo) throws Exception{
        String cosa = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                if(tipo == 3)
                    System.out.println("Ingrese el lugar a donde quiere viajar :");
                if (tipo == 1)
                    System.out.println("Ingrese su nombre para la tarjeta de presentacion :");
                if (tipo == 2)
                    System.out.println("Ingrese el dia para ver el clima :");
                cosa = scan.nextLine();
                if(cosa.equals("")){
                    verificacion = false;
                    System.out.println("% Ingrese un texto valida %");
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de destino "+ e.toString();
            throw new Exception(s);
        }
        return cosa;
    }

    /** 
     * Metodo que indica que el ingreso de opcion no es válido.
     */
    public void ingresoIncorrecto(){
        System.out.println("\n%% Opcion invalida, intentelo otra vez. %%");
    }

    /** 
     * Metodo que indica un error.
     */
    public void error(String s){
        System.out.println(s);
    }

    /** 
     * Metodo que muestra un texto.
     */
    public void mostrar(String s){
        System.out.println(s);
    }

    public int CambiarEmisora() throws Exception, InputMismatchException{
        int op = -1;
        int emisora = 0;
        boolean verificacion = false;

        try{
            System.out.println("Ingrese la opcion de cambio de emisora:");
            System.out.println("Opcion 1: Avanzar 1");
            System.out.println("Opcion 2: Retroceder 1\n");
            
            while(verificacion == false){
                System.out.println("->Elija una opcion ingresando el numero que la identifica (1-2)");
            
                while(verificacion == false){
                    op = Integer.parseInt(scan.nextLine());
                    if(op < 3 && op >= 1){
                        verificacion = true;
                    }else{
                        System.out.println("% Ingrese una opcion valida (1-2) %");
                    }
                    if (op == 1){
                        emisora = 1;
                    }
                    if (op == 2){
                        emisora = -1;
                    }
            }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return emisora;
    }

    public int GuardarEmisora() throws Exception, InputMismatchException{
        int emisora = -1;
        boolean verificacion = false;

        try{
            System.out.println("Ingrese la posicion donde va a guardar la estacion:");
            
            while(verificacion == false){
                emisora = Integer.parseInt(scan.nextLine());
                if(emisora != -1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una emisora valida %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return emisora;
    }

    public int CargarEmisora() throws Exception, InputMismatchException{
        int emisora = -1;
        boolean verificacion = false;

        try{
            System.out.println("Ingrese la emisora que desea cargar:");
            
            while(verificacion == false){
                emisora = Integer.parseInt(scan.nextLine());
                if(emisora != -1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una emisora valida %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return emisora;
    }

    /** 
     * Metodo que pide el cambio de volumen.
     */
    public boolean pedirVolumen() throws Exception, InputMismatchException{
        boolean cambio = false;
        boolean verificacion = false;
        int op = 0;

        try{
            System.out.println("¿Desea aumentar o disminuir el volumen (1)?");
            System.out.println("Opcion 1: Aumentar volumen");
            System.out.println("Opcion 2: Disminuir volumen\n");
            System.out.println("->Elija una opcion ingresando el numero que la identifica (1-2):");
            
            while(verificacion==false){
                op = Integer.parseInt(scan.nextLine());
                if(op==1){
                    cambio = true;
                    System.out.println("\nEl volumen ha aumentado 1\n");
                    verificacion = true;
                }else if(op==2){
                    cambio = false;
                    System.out.println("\nEl volumen ha disminuido 1\n");
                    verificacion = true;
                }else{
                    System.out.println("\n% Ingrese una opcion valida (1-2) %\n");
                    verificacion = false;
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return cambio;
    }

    /** 
     * Metodo que imprime la despedida.
     */
    public void despedida(){
        System.out.println("\n\nSe ha desactivado el asistente de radio Mercedes-Benz, que tenga un buen dia.\n");
    }

    public boolean encenderYapagar(boolean estadoA){
        boolean estado = false;

        if(estadoA==false){
            System.out.println("¿Desea encender la radio? (si/no)");
            String resp = scan.nextLine();
        
            //Validacion de entrada si o no
            if(resp.equals("No") || resp.equals("no")){
                estado = false;
            }else if(resp.equals("Si") || resp.equals("si")){
                estado = true;
            }else{
                System.out.println("% Ingrese *si* o *no* %");
            }

        }else if(estadoA==true){
            System.out.println("¿Desea apagar la radio? (si/no)");
            String resp = scan.nextLine();
        
            //Validacion de entrada si o no
            if(resp.equals("No") || resp.equals("no")){
                estado = true;
            }else if(resp.equals("Si") || resp.equals("si")){
                estado = false;
            }else{
                System.out.println("% Ingrese *si* o *no* %");
            }
        }
        return estado;
    }

    public boolean pedirCambiarCancion(){
        boolean cambio = false;

        System.out.println("¿Desea cambiar de cancion? (si/no)");
        String resp = scan.nextLine();
    
        //Validacion de entrada si o no
        if(resp.equals("No") || resp.equals("no")){
            cambio = false;
        }else if(resp.equals("Si") || resp.equals("si")){
            cambio = true;
        }else{
            System.out.println("% Ingrese *si* o *no* %");
        }

        return cambio;
    }

    public int pedirContacto() throws Exception, InputMismatchException{
        int id = -1;
        boolean verificacion = false;

        try{
            System.out.println("Ingrese el id del contacto al que desea llamar:");
            
            while(verificacion == false){
                id = Integer.parseInt(scan.nextLine());
                if(id != -1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return id;
    }

    public void mostrarContactos(String[] contactos){

        for(int i=0; i<contactos.length; i++){
            String contacto = contactos[i];
            System.out.println(i+". "+contacto);
        }
    }

    public String pedirDestino() throws Exception{
        String destino = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese el destino al que quiere viajar:");
                destino = scan.nextLine();
                if(destino.equals("")){
                    verificacion = false;
                    System.out.println("% Ingrese un destino valido %");
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de destino "+ e.toString();
            throw new Exception(s);
        }
        return destino;
    }

    public String pedirCancion() throws Exception{
        String cancion = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese la cancion que desea escuchar:");
                cancion = scan.nextLine();
                if(cancion.equals("")){
                    verificacion = false;
                    System.out.println("% Ingrese una cancion valida %");
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de usuario "+ e.toString();
            throw new Exception(s);
        }
        return cancion;
    }

    public int pedirLista() throws Exception, InputMismatchException{
        int id = -1;
        boolean verificacion = false;

        try{
            System.out.println("Ingrese el id de la lista que desea reproducir:");
            
            while(verificacion == false){
                id = Integer.parseInt(scan.nextLine());
                if(id != -1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return id;
    }
}
