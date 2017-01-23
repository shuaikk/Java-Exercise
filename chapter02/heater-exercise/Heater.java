
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min; 
    private double max; 
    private double increment; 

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double imin,double imax)
    {
        // initialise instance variables
        temperature = 15.0;
        min = imin;
        max = imax;
        increment = 5.0;
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setIncrement(double iincrement){
     if (iincrement <= 0)
        {
            System.out.println("you must input positive number");
        }
     else 
        {
            increment = iincrement;
        }
    
    }
    
    
    public void warmer()
    {
    if(temperature <= max)
         { 
             temperature = temperature + increment;
             if (temperature > max)
                {temperature = max;}
            }
    else 
        { 
            temperature = max;
        }   
    }
    
    public void cooler()
    {
     if(temperature >= min)
        {
            temperature = temperature - increment;
            if (temperature < min)
                {temperature = min;}
        }
    else
        {
            temperature = min;
        }   
    } 
    
    

     public double getTemperature()
    {
       return temperature;
    }
    
}
