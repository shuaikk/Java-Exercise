import java.util.*;
/**
 * Write a description of class Computer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer
{
    
   private HashMap<String, Component> configuration;
    
    /**
     * Constructor for objects of class Computer
     */
   public Computer() 
    {
      configuration = new HashMap<>();
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
      for (String key : configuration.keySet())
      { 
         computerCost = computerCost + configuration.get(key).getCost(); 
        }
       return computerCost;
      }  
      
   /**
     * Add one Component to this computer
     */   
    public void addComponent(String name, Component c){
       configuration.put(name,c);
        }
        
   /**
     * Remove one Component to this computer
     */       
    public void removeComponent(String name){
       configuration.remove(name);
    }
    
   /**
     * Print  this computer's configuration
     */   
    public void printComputer()
    {
     Iterator<Map.Entry<String, Component>>  its = configuration.entrySet().iterator();
     while(its.hasNext()){
         Map.Entry<String, Component> it = its.next();
        System.out.println("Key = "+ it.getKey()+", Value =" + it.getValue());}
    }
}
