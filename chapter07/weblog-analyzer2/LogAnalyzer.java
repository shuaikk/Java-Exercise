import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    private HashMap<Integer,Integer> yearCounts;
    private int[] monthCounts;
    private int[] dayCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    private ArrayList<Integer> cycleCount ;
    /**
     * Create an object to analyze hourly web accesses.
     */
    /*Exercise 7.12 P234*/
    public LogAnalyzer(String fileName)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        yearCounts = new HashMap<>();
        monthCounts = new int[12];
        dayCounts = new int[28];
        cycleCount = new ArrayList<>() ;
        
        // Create the reader to obtain the data.
        reader = new LogfileReader(fileName);
       
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
        reader.reset();
    }
    
    /**
     * Analyze the yearly access data from the log file.
     */
    //Exercise 7.19 P235
    public void analyzeYearlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int year = entry.getYear();
            if(yearCounts.containsKey(year))
            {   int a = yearCounts.get(year) +1;
                yearCounts.replace(year, a);
            }
            else
            {
                yearCounts.put(year,1);
            }

        }
        // Reset the Iterator
        reader.reset(); 
    }    

    /**
     * Analyze the monthly access data from the log file.
     */
    public void analyzeMonthlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int month = entry.getMonth();
            monthCounts[month-1]++;
        }
        reader.reset();
    }
    
    /**
     * Analyze the daily access data from the log file.
     */
    public void analyzeDailyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int day = entry.getDay();
            dayCounts[day-1]++;
        }
        reader.reset();
        
    }
    
    public void analyzeCyclicalData(int cycle) {
        analyzeDailyData();
        for(int i = 0;i < dayCounts.length;i = i+cycle)
          {int count = 0;
          for (int j = i; j < i+cycle; j++)
            count = count + dayCounts[j];
            cycleCount.add(count);
            }
          
        reader.reset();
    }
    
    
    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     * original version/
    /*public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
        
    }*/
    
    /*Exercise 7.10 P234*/
    public void printHourlyCounts()
    {
        System.out.println("Hour: Count");
        int hour = 0;
        while( hour < hourCounts.length) {
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
        
    }
    
    
    /*public void printYearlyCounts()
    {
        System.out.println("Year: Count");
        int year = 0;
        while( year < yearCounts.size()) {
            System.out.println(year + ": " + yearCounts.get(year));
            year++;
        }
        
    }*/
    //print HashMap yearCounts;
    public void printYearlyCounts()
    {
        Set<Integer> years = yearCounts.keySet();
        System.out.println("Year: Count");
        for(Integer year: years) {
             System.out.println(year+"--"+yearCounts.get(year));
        }
    }
        
    
    
    public void printMonthlyCounts()
    {
        System.out.println("Month: Count");
        int month = 1;
        while( month <= monthCounts.length) {
            System.out.println(month + ": " + monthCounts[month-1]);
            month++;
        }
        
    }
    

    
    public void printDailyCounts()
    {
        System.out.println("Day: Count");
        int day = 1;
        while( day < dayCounts.length) {
            System.out.println(day + ": " + dayCounts[day-1]);
            day++;
        }
        
    }
    
    
    public void printCyclicalCounts()
    {
        System.out.println("Cycle: Count");
        for (int cycle = 1; cycle <= cycleCount.size();cycle++) {
            System.out.println(cycle + ": " + cycleCount.get(cycle - 1));
            }
        
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    
    /**
     * Return the number of accesses recorded in the log file.
     * /
     /* Exercise 7.13 , 7.14 P234*/
     public int numberofAccesses()
     {
        int total = 0;
        for(int hour = 0; hour<hourCounts.length;hour++)
        {total = total +hourCounts[hour];
        }
        return total;
    }
    
         /* Exercise 7.15 ,7.17 P235*/
     public ArrayList<Integer> busiestHour()
     {int busiestCount = 0;
      ArrayList<Integer> busiestHour = new ArrayList<>();
        for(int hour = 0; hour<hourCounts.length; hour++)
        { if(hourCounts[hour] >= busiestCount )
            { busiestCount = hourCounts[hour];
             }
        }
        for(int hour = 0; hour<hourCounts.length; hour++)
        { if(hourCounts[hour] == busiestCount )
            { busiestHour.add(hour);}
        }
        
        return busiestHour;
    }
    
     public ArrayList<Integer> busiest2HourPeriod()
     {int busiestCount = 0;
      ArrayList<Integer> busiestHour = new ArrayList<>();
        for(int hour = 0; hour<hourCounts.length-1; hour++)
        { if(hourCounts[hour] + hourCounts[hour+1] >= busiestCount )
            { busiestCount = hourCounts[hour] + hourCounts[hour+1];
             }
        }
        for(int hour = 0; hour<hourCounts.length-1; hour++)
        { if(hourCounts[hour] + hourCounts[hour+1] == busiestCount )
            { busiestHour.add(hour);}
        }
        
        return busiestHour;
    }
    
          /* Exercise 7.16 ,7.18 P235*/   
      public int quietestHour()
     {int quietestCount = 0;
      ArrayList<Integer> quietestHour = new ArrayList<>();
        for(int hour = 0; hour<hourCounts.length; hour++)
        { if(hourCounts[hour] <= quietestCount )
            { quietestCount = hourCounts[hour];
              }
         }
         for(int hour = 0; hour<hourCounts.length; hour++)
        { if(hourCounts[hour] == quietestCount )
            { quietestHour.add(hour);}
        }
        return quietestHour.get(0);
    }
    
     
     
     
}
