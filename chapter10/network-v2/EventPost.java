
/**
 * Write a description of class EventPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EventPost extends Post
{
    // instance variables - replace the example below with your own
    private String EventType;

    /**
     * Constructor for objects of class EventPost
     */
    public EventPost(String author,String eventType)
    {
        super(author);
        this.EventType = eventType;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void printEventPost()
    {
     System.out.println("EventType: "+ EventType);
    }
}
