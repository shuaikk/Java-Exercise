import java.util.ArrayList;
import java.util.Iterator;
import java.lang.*;
/**
 * Model a ComputerStore that sells different configurations of computers 
 * 
 * @Shuai Wang (your name) 
 * @1.0 (a version number or a date)
 */
public class ComputerStore
{
   
    private ArrayList<Computer> computers;
    private ArrayList<Component> components;
    /**
     * Constructor for objects of class ComputerStore
     */
    public ComputerStore()
    {
        computers = new ArrayList<>();
        components = new ArrayList<>();
    }

    /**
     * Add a computer
     */
    public boolean addComputer(Computer newComputer) 
    { int count = computers.size();
       computers.add(newComputer);
      if(computers.size() - count == 1)
        return true;
      else return false;
    }
    
    /**
     * Add a component
     */
    public boolean addComponent(Component newComponent) 
    { int count = components.size();
       components.add(newComponent);
      if(components.size() - count == 1)
        return true;
      else return false;
    }
    
    /**
     * Remove the computer
     */
    public boolean removeComputer(int index) { 
      int count = computers.size();
        computers.remove(index) ;
      if( count - computers.size() == 1)
        return true;
      else return false;
    }

    /**
     * prints out all the details of each computer in store
     */ 
     public void printAllComputers() {
       Iterator<Computer> it =  computers.iterator();
       while(it.hasNext()){
          Computer computer = it.next();
          System.out.println(computer.toString());
      }
    }

    /**
     * prints the total cost for all computers
     */ 
     public void printTotalValue() {
     int value = 0;
     Iterator<Computer> it =  computers.iterator();
       while(it.hasNext()){
          Computer computer = it.next();
          value = value + computer.getComputerSummary();  
    
     }
    }
    
     /**
      * This method will search through the collection of computers and determine which computer is the most expensive.
      * This version will use a traditional for loop
      */ 
    public Computer findMostExpensiveComputerV1() {
      int currentMostExpensive = 0;
      Computer MostExpensive = null;
      for(int i = 0; i < computers.size(); i++)
          {Computer computer = computers.get(i);
          if (computer.getComputerSummary() > currentMostExpensive)
          {
               currentMostExpensive = computer.getComputerSummary();
               
            } 
    
      }
      
      for(int index = 0; index < computers.size();index++)
       { if(computers.get(index).getComputerSummary() == currentMostExpensive)
           {MostExpensive = computers.get(index);
            MostExpensive.printComputerSummary();}
      }
     return MostExpensive;
    }
    
    
     /**
      * This version will use a traditional while loop
      */
    public Computer findMostExpensiveComputerV2() {
      int currentMostExpensive = 0;
      Computer MostExpensive = null;
      int i = 0;
      while(i < computers.size()) 
          {Computer computer = computers.get(i);
          if (computer.getComputerSummary() > currentMostExpensive)
          {
               currentMostExpensive = computer.getComputerSummary();
               
            } 
          i++;
      }
      
      int index = 0;
      while( index < computers.size())
       { if(computers.get(index).getComputerSummary() == currentMostExpensive)
           {MostExpensive = computers.get(index);
            MostExpensive.printComputerSummary();}
       index++; }
      return MostExpensive;
    }
    
    
     /**
      * This version will use a for-each loop
      */ 
    public Computer findMostExpensiveComputerV3() {
      int currentMostExpensive = 0;
      Computer MostExpensive = null;
      for(Computer computer : computers)
          if (computer.getComputerSummary() > currentMostExpensive)
          {
               currentMostExpensive = computer.getComputerSummary();
               
            }    
      
      for(Computer computer : computers)
       { if(computer.getComputerSummary() == currentMostExpensive)
           { MostExpensive = computer;
             MostExpensive.printComputerSummary();
            }
      }
     return MostExpensive;
    }
    
    /**
     * This version will use an Iterator object with a while loop
     */ 
    public Computer findMostExpensiveComputerV4() {
     int currentMostExpensive = 0;
     Computer MostExpensive = null;
     Iterator<Computer> it =  computers.iterator();
       while(it.hasNext()){
          Computer computer = it.next();
          if (computer.getComputerSummary() > currentMostExpensive)
          {
               currentMostExpensive = computer.getComputerSummary();
               
            } 
    
      }
      
      for(int index = 0; index < computers.size();index++)
       { if(computers.get(index).getComputerSummary()==currentMostExpensive)
           {MostExpensive = computers.get(index);
            MostExpensive.printComputerSummary();}
      }
     return MostExpensive;
    }
    
     /**
      * print out the total value of all components
      */
    public int totalCostOfComponents()
    {
      int value = 0;
     Iterator<Component> it =  components.iterator();
       while(it.hasNext()){
          Component component = it.next();
          value = value + component.getCost();  
       }   
      return value;
    }
    
     /**
      * print out the total value of the input component
      * forName(String className) : Returns the Class object associated with the class or interface with the given string name.
      * isInstance(Object obj) :Determines if the specified Object is assignment-compatible with the object represented by this Class.
      */
    public int totalCostOfComponents(String component_type)
    {
      int value = 0;
      try
      {Class cls = Class.forName(component_type);  
      Iterator<Component> it =  components.iterator();
       while(it.hasNext()){
           Component component = it.next();
           if(cls.isInstance(component) ) 
            {   value = value + component.getCost(); 
            }
       }  
       }
      catch(ClassNotFoundException e)
      {e.printStackTrace();
        return -1;}
      return value;
    }
    }
