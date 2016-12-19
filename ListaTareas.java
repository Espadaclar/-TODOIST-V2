

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */
public class ListaTareas
{
    private ArrayList<Tarea> tareas;
    private ArrayList<Tarea> copia;//-------- para almacenar las tareas por el grado de priorida, grado 0 aparecerán en última posición.

    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        tareas = new ArrayList<>();
        copia = new ArrayList<>();
    }

    /**
     * mt que añade una tarea a la colección poniendo el nombre de la tarea 
     */
    public void addTarea(String otraTarea)
    {
        Tarea tarea2 = new Tarea(otraTarea);
        tareas.add(tarea2);
    }

    /**
     * Poner fecha límite a las tareas para presentarlas --------------------------------------------------------- 0322
     */
    public void ponerFechaDePresentacion( int numTarea, int anno,  int mes, int dia){
        numTarea = numTarea -1;
        if(numTarea >= 1 && numTarea < tareas.size()){
            tareas.get(numTarea).ponerFecha( anno,  mes,  dia);
        }
        else{
            System.out.println("Error, solo valores del intervalo [ 1 / " +tareas.size()+ " ]");
            System.out.println("================================");
            System.out.println("");
        }
    }

    /**
     * mt para asignar una prioridad [0 / 5] a las tareas.
     */
    public void ponerPrioridad( int tarea3, int prioridad){
        tarea3 = tarea3 -1;
        if(tarea3 < 0 || tarea3 > tareas.size()){
            System.out.println("Error, solo son válidos valores entre 1 y " +tareas.size());
        }
        else if(prioridad < 0 || prioridad > 5){
            System.out.println("Error, en prioridad solo son válidos valores entre 1 y 5.");
        }
        else{
            tareas.get(tarea3).ponerPrioridad(prioridad);
        }    
    }

    /**
     * mt para marcar una tarea como completada
     */
    public void ponerTareaComoHecha(int numTarea){
        numTarea = numTarea -1;
        if(numTarea >= 0 && numTarea < tareas.size()){
            tareas.get(numTarea).setHecha(true);
        }
        else{
            System.out.println("Error, solo son válidos valores entre 1 y " +tareas.size());
            System.out.println("================================");
            System.out.println("");
        }
    }

    /**
     * muestra la lista de tareas, numeradas.
     */
    public void mostrarTareas(){
        int cont = 0;
        for(Tarea tarea: tareas){
            System.out.println("Tarea nº "+ (cont +1) + "  " + tarea.toString());            
            cont ++;            
        }
        System.out.println("================================");
        System.out.println("");
    }

    /**
     * mt para mostrar las tareas que contengan una determinada cadena pasada como parámetro, indicando si están completadas o no.
     */
    public void mostraTareaConLaCadena(String cadena){
        for(Tarea tarea: tareas){
            if(tarea.getName().contains(cadena)){
                System.out.println(tarea.getName()+ " " +tarea.getHecha2()+ ", Prioridad; " +tarea.getPrioridad());
            }   
        }
        System.out.println("================================");
        System.out.println("");
    }

    /**
     * muestra la lista de tareas, numeradas y por orden de preferencias.-------------------------------------  **************************************
     */
    public void mostrarTareasPorOrdenDePrioridad(){
        int cont = 1;
        int cont5 = 5;
        copia.clear();
        System.out.println("  ***** LISTA ORDENADA POR PRIORIDADES. ******");
        System.out.println("");
        copia.clear();
        while( tareas.size() != copia.size()){
            for(Tarea tarea: tareas){
                if(tarea.getPrioridad() == cont5 ){
                    copia.add(tarea);
                }
            } 
            cont5 --;
        }

        for(Tarea tarea: copia){
            System.out.println("Tarea nº; " +cont+ " -" +tarea.toString());
            cont++;
        }
        System.out.println("================================");
        System.out.println("");
    }    

    /**
     * metodo para eliminar una tarea indicando la posición que ocupa.
     */
    public void eliminaTarea(int posicion){
        posicion = posicion -1;
        if(posicion >= 0 && posicion < tareas.size()){
            tareas.remove(posicion );
        }
        else{
            System.out.println("Error, solo son válidos valores entre 1 y " +tareas.size());
        }
    }

}
