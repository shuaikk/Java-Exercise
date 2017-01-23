
/**
 * Write a description of class Multiples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiples
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Multiples
     */
    public Multiples()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void multiplesOfFive()
    {
      for(int i=10; i<=95; i++)
      {if(i%5==0)
        {System.out.println(i);}
        }
    }
}
