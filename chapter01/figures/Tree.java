
/**
 * P88 Exercise 3.40
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle leaves;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
       leaves = new Triangle();
       trunk = new Square();

    }
    
    public void setup()
    {
        leaves.changeSize(80,90);
        leaves.draw();
        leaves.moveHorizontal(130);
        leaves.moveVertical(-100);
        trunk.draw();
        leaves.makeVisible();
        trunk.makeVisible();
    }


}
