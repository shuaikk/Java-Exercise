
/**
 * Write a description of class Processor here.
 * 
 * @Shuai Wang
 * @1.0
 */
public class Processor extends Component
{

    private int clockspeed;

    
    /**
     * Constructor for objects of class Processor
     */
    public Processor(String manufacturer,int clockspeed,int cost)
    {
        super(manufacturer,cost);
        this.clockspeed = clockspeed;
        
    }
    
    /**
     * Return the clockspeed of this Processor.
     */
    public int getClockspeed()
    {
        return clockspeed;
     }
    
    /**
     * Set the clockspeed of this Processor.
     */
    public void setClockspeed(int clockspeed)
    {
        this.clockspeed = clockspeed;
    }
    

}
