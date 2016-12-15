import java.util.ArrayList;
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
            System.out.println("Tarea nº "+ (cont +1) + " " +tareas.get(cont).getName()+ ",           " +
                tareas.get(cont).getHecha());
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
}


