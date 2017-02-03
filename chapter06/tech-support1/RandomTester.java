import java.util.Random;
import java.util.ArrayList;
/**
 * Exercise 6.14 P185
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random number;
    private ArrayList<String> responses;
   
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        number = new Random();
        responses = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void printOneRandom()
    
    {
       System.out.println(number.nextInt());
    }
    
    public void printOneRandom(int size)
    
    {
       System.out.println(number.nextInt(size));
    }
    
    /*/Exercise 6.16 	P185 nextInt(int bound)
    Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.*/
    public void throwDie()
    
    {
       System.out.println(number.nextInt(6)+1);
    }
    
    //Exercise 6.17.  6.18  P185
     public void getResponse()
    {   
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        int index = number.nextInt(responses.size());
        System.out.println( responses.get(index));
    }
    
    //Exercise 6.20 P186
    public void throwDie(int max,int min)
    
    {
        int i = max - min;
        int j = number.nextInt(i);
        int m = min + j;
       System.out.println(m);
    }
}
