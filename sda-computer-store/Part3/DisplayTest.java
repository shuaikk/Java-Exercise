

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DisplayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DisplayTest
{
    /**
     * Default constructor for test class DisplayTest
     */
    public DisplayTest()
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

    @Test
    public void test()
    {
        Display d1 = new Display("Dell", 18, 800);
        Display d2 = new Display("acer", 15, 450);
        Display d3 = new Display("Apple", 18, 788);
        HardDisk h1 = new HardDisk("Segate", "500GB", 380);
        HardDisk h2 = new HardDisk("WD", "1TB", 680);
        HardDisk h3 = new HardDisk("HGST", "500GB", 380);
        Processor p1 = new Processor("Intel", 2000, 1500);
        Processor p2 = new Processor("AMD", 1500, 1299);
        Processor p3 = new Processor("AMD", 2000, 1208);
        Computer computer1 = new Computer();
        computer1.addComponent("hardisk1", h1);
        computer1.addComponent("processor", p1);
        computer1.addComponent("display", d1);
        computer1.addComponent("hardisk2", h2);
        computer1.printComputer();
        assertEquals(3360, computer1.getComputerSummary());
        computer1.printComputerSummary();
    }
}

