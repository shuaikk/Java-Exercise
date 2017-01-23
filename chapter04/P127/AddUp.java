
/**
 * Write a description of class AddUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddUp
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class AddUp
     */
    public AddUp()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sum()
    {
    int sum = 0;
    for (int i=1;i<=10;i++)
    {sum = sum + i;}
    System.out.println(sum);
    return sum;
    }
    
    public int sum(int x,int y)
    {
    int sum = 0;
    if(x<y){
        for (int i=x;i<=y;i++)
        {sum = sum + i;}
        System.out.println(sum);
        return sum;}
    else{
        for (int i=y;i<=x;i++)
        {sum = sum + i;}
        System.out.println(sum);
        return sum;}    
    }
    
    
    public boolean isPrime(int n)
    {
    int sum = 0;
    for (int i=2;i<=n-1;i++)
        {if(n%i==0)
            { sum++;}}
    if(sum==0)
    { return true;}   
    else
    {return false;}
           }
      }

