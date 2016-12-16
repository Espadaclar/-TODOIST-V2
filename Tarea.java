
/**
 *
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean hecha;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String name)
    {
        this.name = name;
        hecha = false;
        
    }

    /**
     * mt que devuelve el nombre de la tarea. 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * mt que devuelve el estado de la tarea. 
     */
    public boolean getHecha()
    {
        return hecha;
    }
    
    /**
     * mt que asigna el estado de la tarea. 
     */
    public void setHecha(boolean estaHecha)
    {
         hecha = estaHecha;
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





