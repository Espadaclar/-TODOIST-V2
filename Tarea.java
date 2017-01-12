import java.time.LocalDate;
/**
 *franciscoJavier.
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean hecha;
    private int prioridad;
    private LocalDate ponerFecha; 
    private int id;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String name, int id)
    {
        this.name = name;
        hecha = false;
        prioridad = 0;
        ponerFecha = null;
        this.id = id;
    }

    public void ponerFecha(int anno, int mes, int dia){
        ponerFecha = LocalDate.of(anno, mes, dia); 
    }

    public LocalDate devuelveFecha(){
        return ponerFecha;
    }

    /**
     * retorna el valor del id de la tarea.
     */
    public int getId(){
        return id;
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
        if(ponerFecha != null){
            if(hecha){
                textoADevolver += " HECHA. ";
            }
            textoADevolver += getName()+ " Fecha de finalización; " +devuelveFecha() + "  Prioridad. " +getPrioridad();
        }
        else{
            if(hecha){
                textoADevolver += " HECHA. ";
            }
            textoADevolver += getName()+ "  Prioridad. " +getPrioridad();
        }
         return "ID. " +getId()+ " " +textoADevolver;
    }
}






