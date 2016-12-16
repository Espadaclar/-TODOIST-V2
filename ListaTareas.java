import java.util.ArrayList;
import java.util.Iterator;
/**
 * 
 */
public class ListaTareas
{
    // instance variables - replace the example below with your own
    private ArrayList<Tarea> tareas;

    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        tareas = new ArrayList<>();
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
            if(tareas.get(cont).getHecha() == true ){
                System.out.println("Tarea nº "+ (cont +1) + " " +tareas.get(cont).getName()+ ",           " +
                "------------HECHO.");
            }
            else{
                System.out.println("Tarea nº "+ (cont +1) + " " +tareas.get(cont).getName()+ ",           " +
                "------------Sin acabar.");
            }
            
            cont ++;           
        }
        System.out.println("================================");
        System.out.println("");
    }

    /**
     * mt para marcar una tarea como completada
     */
    public void marcarTarea(int numTarea){
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
     * mt para mostrar las tareas que contengan una determinada cadena pasada como parámetro, indicando si están completadas o no.
     */
    public void muestraTareaConCadena(String cadena){
        for(Tarea tarea: tareas){
            if(tarea.getName().contains(cadena) && tarea.getHecha() == true){
                System.out.println(tarea.getName()+ ". ---tarea hecha.? ");
            }
            else if(tarea.getName().contains(cadena) && tarea.getHecha() == false){
                System.out.println(tarea.getName()+ ". ---tarea sin hacer.? ");
            }
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





