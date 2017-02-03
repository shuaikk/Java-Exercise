
/**
 * Write a description of class Display here.
 * 
 * @Shuai Wang
 * @1.0
 */
public class Display extends Component
{

    private int size;
  
    /**
     * Constructor for objects of class Display
     */
    public Display(String manufacturer,int size,int cost)
    {
        super(manufacturer,cost);
        this.size= size;
       
    }

    /**
     * Return the size of this Display.
     */
    public int getSize()
    {
        return size;
     }
    
    /**
     * Set the size of this Display.
     */
    public void setSize(int size)
    {
        this.size= size;
    }
    
}
