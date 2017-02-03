
/**
 * Write a description of class HardDisk here.
 * 
 * @Shuai Wang
 * @1.0
 */
public class HardDisk extends Component
{

    private String capacity;

    /**
     * Constructor for objects of class HardDisk
     */
    public HardDisk(String manufacturer,String capacity,int cost)
    {
        super(manufacturer,cost);
        this.capacity = capacity;
        
    }

     /**
     * Return the capacity of this HardDisk.
     */
    public String getCapacity()
    {
        return capacity;
     }
     
     /**
     * Set the capacity of this HardDisk.
     */    
    public void setCapacity(String capacity)
    {
        this.capacity= capacity;
    }
    
}
