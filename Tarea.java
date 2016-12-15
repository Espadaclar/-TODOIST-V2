
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
        // put your code here
        return name;
    }
    
    /**
     * mt que devuelve el estado de la tarea. 
     */
    public boolean getHecha()
    {
        // put your code here
        return hecha;
    }
}
