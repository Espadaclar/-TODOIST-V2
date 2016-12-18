

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListaTareasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaTareasTest
{
    private ListaTareas listaTar1;

    /**
     * Default constructor for test class ListaTareasTest
     */
    public ListaTareasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        listaTar1 = new ListaTareas();
        listaTar1.addTarea("ir de vacaciones.");
        listaTar1.addTarea("estudiar programación.");
        listaTar1.addTarea("hacer deporte.");
        listaTar1.addTarea("ir al cine.");
        listaTar1.addTarea("comer con moderación.");
        listaTar1.addTarea("concentrarte en el cómo.");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
