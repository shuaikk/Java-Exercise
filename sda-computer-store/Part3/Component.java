
/**
 * Write a description of class Component here.
 * 
 * @Shuai Wang
 * @1.0
 */
public class Component
{
    private String manufacturer;
    private int cost;

    /**
     * Constructor for objects of class Component
     */
    public Component(String manufacturer,int cost)
    {
        this.manufacturer = manufacturer;
        this.cost = cost;
        
    }

    /**
     * Return the cost of this Component.
     */
    public int getCost()
    {
        return cost;
     } 
    
    /**
     * Return the manufacturer of this Component.
     */
    public String getDescription() 
    {
       return manufacturer;
    }
    
    /**
     * Set the manufacturer of this Component.
     */
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    
    /**
     * Set the cost of this Component.
     */    
    public void setCost(int cost)
    {
        this.cost = cost;
    }
}
