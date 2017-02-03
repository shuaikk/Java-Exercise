
/**
 * Write a description of class Computer here.
 * 
 * @Shuai Wang 
 * @1.0 
 */
public class Computer
{
    
    private Processor theProcessor;
    private HardDisk theHardDisk;
    private Display theDisplay;

    /**
     * Constructor for objects of class Computer
     */
   public Computer(Processor theProcessor, HardDisk theHardDisk, Display theDisplay) 
    {
       this.theProcessor = theProcessor;  
       this.theHardDisk = theHardDisk; 
       this.theDisplay = theDisplay; 
    }
   
    /**
     * Print one Computer's  total cost
     */
    public void printComputerSummary() {
      System.out.println("The total cost of this computer: "+ getComputerSummary());
     }
     
     
    /**
     * Get one Computer's  total cost
     */
    public int getComputerSummary() {
      int computerCost = 0 ;
      computerCost = theProcessor.getCost() + theHardDisk.getCost() + theDisplay.getCost();
      return computerCost;
      }
}
