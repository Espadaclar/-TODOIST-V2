
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;
/**
 * franciscoJavier.
 */
public class ListaTareas
{
    private ArrayList<Tarea> tareas;
    private ArrayList<Tarea> copia;//-------- para almacenar las tareas por el grado de priorida, grado 0 aparecerán en última posición.
    private int id; //----------------------- para poner un identificativo a cada tarea.

    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        tareas = new ArrayList<>();
        copia = new ArrayList<>();
        id = 10; // ------------------- lo inicializamos a 10 porque ha de tener dos dígitos.
    }

    /**
     * mt que añade una tarea a la colección poniendo el nombre de la tarea ------------------------------------------------- 1
     */
    public void addTarea(String otraTarea)
    {
        Tarea tarea2 = new Tarea(otraTarea, id);
        id ++; //--------------------------------------------------------------- cada vez que invocamos este mt, id aumenta en 1.
        tareas.add(tarea2);
    }

    //     /**
    //      * Poner fecha límite a las tareas para presentarlas ------------------------------------------------ 0322---------------- 2
    //      */
    //     public void ponerFechaDePresentacion( int numTarea, int anno,  int mes, int dia){
    //         numTarea = numTarea -1;
    //         if(numTarea >= 1 && numTarea < tareas.size()){
    //             tareas.get(numTarea).ponerFecha( anno,  mes,  dia);
    //         }
    //         else{
    //             System.out.println("Error, solo valores del intervalo [ 1 / " +tareas.size()+ " ]");
    //             System.out.println("================================");
    //             System.out.println("");
    //         }
    //     }

    /**
     * Poner fecha límite a las tareas para presentarlas, indicando su ID.------------------------------- 0322---------------- 2
     */
    public void ponerFechaDePresentacion(int idTarea, int anno,  int mes, int dia){
        if(controlDeId(idTarea)){//------------------------------------------------------------- controlDeId(id) es el mt nº 13.
            tareas.get(posicionDelId(idTarea)).ponerFecha( anno,  mes,  dia);// ---------------- posicionDelId(id) es el mt nº 14.
        }
    }
    //     /**
    //      * mt para asignar una prioridad [0 / 5] a las tareas.
    //      */
    //     public void ponerPrioridad( int tarea3, int prioridad){
    //         tarea3 = tarea3 -1;
    //         if(tarea3 < 0 || tarea3 > tareas.size()){
    //             System.out.println("Error, solo son válidos valores entre 1 y " +tareas.size());
    //         }
    //         else if(prioridad < 0 || prioridad > 5){
    //             System.out.println("Error, en prioridad solo son válidos valores entre 1 y 5.");
    //         }
    //         else{
    //             tareas.get(tarea3).ponerPrioridad(prioridad);
    //         }    
    //     }

    /**
     * mt para asignar una prioridad [0 / 5] a las tareas, indicando el ID de la tarea. -------------------------------------- 3
     */
    public void ponerPrioridad(int id, int prioridad){
        if(prioridad < 0 || prioridad > 5){
            System.out.println("Error, en prioridad solo son válidos valores entre 1 y 5.");
            System.out.println("");
        }
        else{
            if(controlDeId(id)){ //------------------------------------------------------------- controlDeId(id) es el mt nº 13.
                tareas.get(posicionDelId(id)).ponerPrioridad(prioridad);// --------------------- posicionDelId(id) es el mt nº 14.
            }            
        }    
    }
    //     /**
    //      * mt para marcar una tarea como finalizada.
    //      * 
    //      */
    //     public void ponerTareaComoHecha(int numTarea){
    //         numTarea = numTarea -1;
    //         if(numTarea >= 0 && numTarea < tareas.size()){
    //             tareas.get(numTarea).setHecha(true);
    //         }
    //         else{
    //             System.out.println("Error, solo son válidos valores entre 10 y " +(tareas.size() + 10));
    //             System.out.println("================================");
    //             System.out.println("");
    //         }
    //     }
    /**
     * mt para marcar una tarea como finalizada marcando el ID de la tarea.--------------------------------------------------- 4
     * 
     */
    public void ponerTareaComoHecha(int id){
        if(controlDeId(id)){//------------------------------------------------------------- controlDeId(id) es el mt nº 13.
            tareas.get(posicionDelId(id)).setHecha(true);// ------------------------------- posicionDelId(id) es el mt nº 14.
        }
    }

    /**
     * muestra la lista de tareas, numeradas.-------------------------------------------------------------------------------- 5
     */
    public void mostrarTareas(){
        int cont = 0;
        for(Tarea tarea: tareas){
            System.out.println(tarea);            
            cont ++;            
        }
        System.out.println("================================");
        System.out.println("");
    }

    /**
     * mt para mostrar las tareas que contengan una determinada cadena pasada como parámetro,-------------------------------- 6
     * indicando si están completadas o no.
     */
    public void mostraTareaConLaCadena(String cadena){
        for(Tarea tarea: tareas){
            if(tarea.getName().contains(cadena)){
                System.out.println(tarea);
            }   
        }
        System.out.println("================================");
        System.out.println("");
    }

    /**
     * muestra la lista de tareas, numeradas y por orden de preferencias.------------------------------------------------------- 7
     */
    public void mostrarTareasPorOrdenDePrioridad(){
        int cont = 1; //permite mostrar las tareas numeradas en el bucle for.
        int cont5 = 5;//facilita el buen funcionamiento en le bucle while.
        System.out.println("  ***** LISTA ORDENADA POR PRIORIDADES. ******");
        System.out.println("");
        copia.clear();//el ArrayList copia es siempre vaciado antes de cargarle de nuevo.
        while( tareas.size() != copia.size()){
            for(Tarea tarea: tareas){
                if(tarea.getPrioridad() == cont5 ){
                    copia.add(tarea);
                }
            } 
            cont5 --;
        }

        for(Tarea tarea: copia){
            System.out.println(tarea.toString());
            cont++;
        }
        System.out.println("================================");
        System.out.println("");
    }   

    /**
     * muestre por pantalla el listado de tareas con fecha de vencimiento hoy. Si no hay ninguna, el -------------------------- 8
     * listado debe aparecer vacío.
     */
    public void mostrarHoy(){
        LocalDate vencenHoy = LocalDate.now();
        int cont = 1;
        for(Tarea tarea: tareas){
            if(tarea.devuelveFecha() != null && tarea.devuelveFecha().isEqual(vencenHoy)){
                System.out.println(tarea.toString()); 
            }
            cont ++;            
        }
    }

    /**
     *muestre poir pantalla el listado de tareas vencidas. Si no hay ninguna, no sale nada por pantalla.------------------------- 9
     */
    public void  mostrarVencidas(){
        LocalDate vencenHoy = LocalDate.now();
        int cont = 1;
        for(Tarea tarea: tareas){
            if(tarea.devuelveFecha() != null && tarea.devuelveFecha().isBefore(vencenHoy)){
                System.out.println(tarea.toString()); 
            }
            cont ++;            
        }
    }

    /**
     * muestre la tarea con la más alta prioridad. Si hay varias empatadas, debe mostrarl todas.--------------------------------- 10
     */
    public void verTareaMasPrioritaria(){
        int cont = 0;//almacenará el valor de la tarea más prioritaria.
        int cont5 = 5;//su valor irá decreciendo a la vez que se compara con el valor prioritario de cada tarea.
        boolean encontrado = false;
        while(!encontrado && !tareas.isEmpty()){
            for(Tarea tarea: tareas){
                if(tarea.getPrioridad() >= cont5 ){
                    cont = cont5;
                    encontrado = true;
                    if(tarea.getPrioridad() == cont ){
                        System.out.println( tarea.toString()); 
                    }
                }
            }
            cont5 --;
        }
        System.out.println("================================");
        System.out.println("");
    }

    /**
     * muestre la tarea con mayor prioridad. En caso de empate, nos muestra solo la última tarea ------------------------------- 11
     */
    public void verTareaMasPrioritaria2(){
        if(tareas.size() > 0){
            Tarea mayorPrioridad = tareas.get(0);//pongo a la primer tarea como la que mayor prioridad tiene.
            for(Tarea tarea: tareas){            //recorro la colección, y si hay alguna mayor, la guardo en la VL mayorPrioridad.
                if(tarea.getPrioridad() >= mayorPrioridad.getPrioridad()){
                    mayorPrioridad = tarea;
                }
            }
            System.out.println(mayorPrioridad);
        }
        System.out.println("================================");
        System.out.println("");
    }

    //     /**
    //      * metodo para eliminar una tarea indicando la posición que ocupa.----------------------------------------------------------- 12
    //      */
    //     public void eliminaTarea(int posicion){
    //         posicion = posicion -1;
    //         if(posicion >= 0 && posicion < tareas.size()){
    //             tareas.remove(posicion );
    //         }
    //         else{
    //             System.out.println("Error, solo son válidos valores entre 1 y " +tareas.size());
    //         }
    //     }
    /**
     * metodo para eliminar una tarea indicando el id de la tarea.----------------------------------------------------------- 12
     */
    public void eliminaTarea(int id){
        if(controlDeId(id)){//------------------------------------------------ controlDeId(id) es el mt nº 13.
            tareas.remove(posicionDelId(id));// ------------------------------ posicionDelId(id) es el mt nº 14.
        }
        else{
            System.out.println("Error, solo son válidos valores entre 1 y " +tareas.size());
        }
    }

    /**
     * mt para controlar si el id pasado como parametro es válido --------------------------------------------------------------- 13
     */
    public boolean controlDeId(int id){
        boolean idValido = true;
        if(id < 10 || id > (tareas.size()  + 9) ){
            idValido = false;
            System.out.println("Error, solo son válidos valores entre 10 y " +(tareas.size() + 9));
        }
        return idValido;
    }

    /**
     * mt para controlar si tenemos alguna tarea con el id pasado como parámetro, si la hay, devuelve su posición. -------------- 14
     */
    public int posicionDelId(int id){
        int cont = 0;//facilita el funcionamiento del bucle while.
        int tareaConId = 0;
        boolean encontrado = false;
        while(cont < tareas.size() && !encontrado){
            if(tareas.get(cont).getId() == id){
                tareaConId = cont;
                encontrado = true;
            }
            cont ++;
        }
        return tareaConId;
    }
}

