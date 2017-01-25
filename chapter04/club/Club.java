import java.util.*;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Club
{
    // Define any necessary fields here ...
    /*Exercise 4.40  P135*/
    public ArrayList<Membership> clubMember;
    
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        clubMember = new ArrayList<>();
        
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
     /*Exercise 4.42  P135*/
    public void join(Membership member)
    {
        clubMember.add(member); 
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    /*Exercise 4.41  P135*/
    public int numberOfMembers()
    {
       int number = 0;
       Iterator<Membership> it = clubMember.iterator();
       while(it.hasNext()){
          Membership membership = it.next();
          System.out.println(membership.toString());
          number++;}
       return number;
    }
    
    /*Exercise 4.54  P145*/
    /**
     * Determine the number of members who joined in the given 
     * month.
     * @param month The month we are intrested in.
     * @return The number of members who joined in that month.
     */
    public int joinedInMonth(int month){
    if (month < 1 || month > 12){
        System.out.println("you type a wrong month");
        return 0;
    }
    else
    {  int number = 0;
       Iterator<Membership> it = clubMember.iterator();
       while(it.hasNext()){
          Membership membership = it.next();
          if(membership.getMonth() == month)
          {    System.out.println(membership.toString());
               number++;}
          
          }
       return number;   }
    }
    
    /*Exercise 4.55  P146*/
    /**
     * Remove from the club's collection all members who
     * joined in the given month,
     * and return them stored in a separate collection object.
     * @param month The month of the membership.
     * @param year The year of the membership.
     * @return The members who joined in the given month and year.
     */
    public ArrayList<Membership> purge(int month, int year)
    {
     if (month < 1 || month > 12){
        System.out.println("you type a wrong month");
        return null;
     }
     else
     {  ArrayList<Membership> memberPurge = new ArrayList<>(); 
       Iterator<Membership> it = clubMember.iterator();
       while(it.hasNext()){
          Membership membership = it.next();
          if(membership.getMonth() == month && membership.getYear() == year)
          {    System.out.println(membership.toString());
               memberPurge.add(membership);
               it.remove();
               }
          
        }
       
     return memberPurge;  }    
    
    }
}


    
    
    
