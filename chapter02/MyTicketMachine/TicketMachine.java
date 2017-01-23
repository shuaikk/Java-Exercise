/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    private int saving;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
  
        balance = 0;
        total = 0;
        
        //System.out.println(price);
     }
    
     /**
     * @Return The price of a ticket.
     */
    public void setPrice(String zone)
    {
       if (zone == "A"){
        price = 20;}
       else if (zone == "B"){
        price = 30;}
       else if (zone == "C"){
        price = 40;}
       else {
           System.out.println("you choose a wrong zone,please input A/B/C");}
    }
    
    public int getPrice()
    {
        return price;
        
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    /*public void printTicket()
    {
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }*/
    
    public void printTicket()
    {
       int amountLeftToPay;
       amountLeftToPay = price - balance;
       if (amountLeftToPay <= 0){
           System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
           
            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price; 
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
        }
        
        
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
        
    }
    
    public int getTotal()
    {
    return total;
    }
    public void discount(int amount)
    {
    price = price - amount;
       }
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money");
    }
    public void showPrice()
    {
        System.out.println("The price of a ticket is "+ price +" cents");
    }
    
    public int emptyMachine()
    {
        int totalmoney ;
        totalmoney = total;
        total = 0;
        return totalmoney;
    }
    
}
