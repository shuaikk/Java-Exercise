import java.util.ArrayList;
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
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    /*Exercise 7.12 P234*/
    public LogAnalyzer(String fileName)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
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
        System.out.println("Hr: Count");
        int hour = 0;
        while( hour < hourCounts.length) {
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
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
