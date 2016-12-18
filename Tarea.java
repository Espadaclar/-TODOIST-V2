
/**
 *
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean hecha;
    private int prioridad;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String name)
    {
        this.name = name;
        hecha = false;
        prioridad = 0;
        
    }

    /**
     * mt que devuelve el nombre de la tarea. 
     */
    public String getName()
    {
        return name;
    }
    
    public String getHecha2()
    {
        String val = "";
        if(hecha == true){
            val = " HECHA!!!. ";
        }
        return val;
    }

    /**
     * mt que asigna el estado de la tarea. 
     */
    public void setHecha(boolean estaHecha)
    {
         hecha = estaHecha;
    }
    
    /**
     * mt que asigna la prioridad de la tarea. 
     */
    public void ponerPrioridad(int prioridad2)
    {
         prioridad = prioridad2;
    }
    
    /**
     * retorna la prioridad
     */
    public int getPrioridad()
    {
         return prioridad;
    }
    
    public String toString(){
        String textoADevolver= "";
        if(hecha){
            textoADevolver += "HECHA.";
        }
        textoADevolver += getName();
        return textoADevolver;
    }
}





