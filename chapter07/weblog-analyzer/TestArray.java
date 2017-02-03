
/**
 * Write a description of class TestArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*Exercise 7.2  P227*/
public class TestArray
{
    // instance variables - replace the example below with your own
    private Person[] people;
    private boolean[] vacant;
    private boolean[] occupied;
    private int[] counts;
    /**
     * Constructor for objects of class TestArray
     */
    public TestArray()
    {
        // initialise instance variables
        people = new Person[20];
        vacant = new boolean[20];
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return  y;
    }
    
    /*Exercise 7.11 P234 */
    public void printGreater(double[] marks,double mean)
    {
        for(int index = 0; index <marks.length; index++){
            if(marks[index] > mean){
               System.out.println(marks[index]);
            }
        }
    }
}
