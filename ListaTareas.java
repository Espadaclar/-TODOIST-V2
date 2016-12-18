import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
/**
 * 
 */
public class ListaTareas
{
    // instance variables - replace the example below with your own
    private ArrayList<Tarea> tareas;
    private ArrayList<String> copia;
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
     * muestra la lista de tareas, numeradas.
     */
    public void mostrarTareas(){
        int cont = 0;
        while(cont < tareas.size()){
            System.out.println("Tarea nº "+ (cont +1) + "  " +tareas.get(cont).getHecha2()+  " " +tareas.get(cont).getName()+ " ,        Prioridad;  " +
                tareas.get(cont).getPrioridad());
            cont ++;           
        }
        System.out.println("================================");
        System.out.println("");
    }

    /**
     * mt para mostrar las tareas que contengan una determinada cadena pasada como parámetro, indicando si están completadas o no.
     */
    public void mostraTareaConCadena(String cadena){
        for(Tarea tarea: tareas){
            if(tarea.getName().contains(cadena)){
                System.out.println(tarea.getName()+ " " +tarea.getHecha2()+ ", Prioridad; " +tarea.getPrioridad());
            }   
        }
        System.out.println("================================");
        System.out.println("");
    }

    /**
     * mt para marcar una tarea como completada
     */
    public void marcarTareaComoHecha(int numTarea){
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
     * mt para asignar una prioridad [0 / 5] a las tareas.
     */
    public void asignarPrioridad( int tarea3, int prioridad){
        tarea3 = tarea3 -1;
        if(tarea3 < 0 || tarea3 > tareas.size()){
            System.out.println("Error, solo son válidos valores entre 1 y " +tareas.size());
        }
        else if(prioridad < 0 || prioridad > 5){
            System.out.println("Error, solo son válidos valores entre 1 y 5.");
        }
        else{
            tareas.get(tarea3).ponerPrioridad(prioridad);
        }    
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
