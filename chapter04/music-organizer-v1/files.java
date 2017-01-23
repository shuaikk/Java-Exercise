
import java.util.*;
/**
 * Write a description of class files here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class files
{
    // instance variables - replace the example below with your own
    private ArrayList<String> favoriteTrack;

    /**
     * Constructor for objects of class files
     */
    public files()
    {
        // initialise instance variables
        favoriteTrack = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public void addFile(String filename)
    {
      favoriteTrack.add(filename);
    }
    public int getNumberOfFavoriteTrack()
    {
        // put your code here
        return favoriteTrack.size();
    }
    
    public String listFavoriteTrack(int index)
    {
        // put your code here
        return favoriteTrack.get(index);
    }
}
