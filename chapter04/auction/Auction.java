import java.util.ArrayList;
import java.util.Iterator;
/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    /*public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
            // The number seems to be reasonable.
            Lot selectedLot = lots.get(lotNumber - 1);
            // Include a confidence check to be sure we have the
            // right lot.
            if(selectedLot.getNumber() != lotNumber) {
                System.out.println("Internal error: Lot number " +
                                   selectedLot.getNumber() +
                                   " was returned instead of " +
                                   lotNumber);
                // Don't return an invalid lot.
                selectedLot = null;
            }
            return selectedLot;
        }
        else {
            System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
            return null;
        }
    }*/
    
    /*Exercise 4.50  4.51  P145 */
    public Lot getLot(int lotNumber)
    {  Iterator<Lot> it = lots.iterator();
        while(it.hasNext())
        {   Lot t = it.next();
           if(t.getNumber()==lotNumber)
            {   System.out.println("Lot number: " + t.getNumber() + ", Lot description:"+t.getDescription());
                return t;   }
                  
                    
        }
        System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
        return null;
        
    }

        /*Exercise 4.52  P145 */
       /**
        * Remove the lot with the given lot number
        * @param number The number of the lot to be removed.
        * @return the Lot with the given number, or null if 
        * there is no such lot
        */
    public Lot removeLot(int number)
    {  Iterator<Lot> it = lots.iterator();
       Lot removeOne = null;
        while(it.hasNext())
        {   Lot t = it.next();
           if(t.getNumber()== number)
            {   System.out.println("Lot number: " + t.getNumber() + ", Lot description:"+t.getDescription());
                removeOne = t;
                it.remove();
                return removeOne;   }
                  
          
        }
      
        return removeOne;
        
    }
    /*Exercise 4.48  P144*/
    public void close(){
      for (Lot lot : lots)
       {  if(lot.getHighestBid()!= null)
             {System.out.println("Name: "+ lot.getHighestBid().getBidder().getName()+", value: "+lot.getHighestBid().getValue());}
            }
}
   /*Exercise 4.49  P144*/
   public ArrayList<Lot> getUnsold(){
      ArrayList<Lot> unsold = new ArrayList<>();
      for (Lot lot : lots)
       {  if(lot.getHighestBid()== null)
             {unsold.add(lot);}
            }
      return unsold;
}
}
