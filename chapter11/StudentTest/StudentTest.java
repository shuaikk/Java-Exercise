import java.util.ArrayList;
/**
 * Write a description of class StudentTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentTest
{
    // instance variables - replace the example below with your own
    private ArrayList<Student> myList;

    /**
     * Constructor for objects of class StudentTest
     */
    public StudentTest()
    {
        // initialise instance variables
        myList = new ArrayList<>();
    }
    
    public void addStudent(Student studentName)
    {
        // put your code here
        myList.add(studentName);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void print()
    {
        // put your code here
        for(Object st : myList)
        {  System.out.println(st);}
    }
}
