
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    // instance variables - replace the example below with your own
    private int m;

    /**
     * Constructor for objects of class Fibonacci
     */
    public Fibonacci()
    {
        // initialise instance variables
        m = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void listFibonacci()
    {
        // put your code here
        int[] x = new int [100];
        x[0] = 0;
        x[1] = 1;
        for(int i=2;i<20;i++){
            x[i] = x[i-1]+x[i-2] ;
        }
        for(int i=0;i<20;i++){
           System.out.println(x[i]) ;
        }
    }
}
