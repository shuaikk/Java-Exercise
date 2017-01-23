/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    int page;
    String refNumber;
    int borrowed;
    boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPage, boolean text)
    {
        author = bookAuthor;
        title = bookTitle;
        page = bookPage;
        refNumber = "";
        borrowed = 0;
        courseText = text;
    }
    
    public void setRefNumber(String ref)
    {
     if (ref.length() >= 3){
        refNumber = ref;}
     else {
        System.out.println("You must input more than 3 characters");}
    }
    
    public void borrow()
    {
      borrowed=borrowed+1;
    }

    public int getBorrowed()
    {
     return borrowed;
    }
    
    public String getAuthor()
    {
     return author;
    }
    
    public String getTitle()
    {
     return title;
    }
    
    public boolean isCourseText()
    {
     return courseText;
    }
    
    public String getRefNumber()
    {
     return refNumber;
    }
    
    public void printAuthor()
    {
       System.out.println("The Author is : " +author);
    }
    
    
    public void printTitle()
    {
       System.out.println("The Title is : " +title);
    }
    
    public void printPage()
    {
       System.out.println("The Page is : " +page);
    }
    public void printDetails()
    {
     if (refNumber.length() > 0){
       System.out.println("The Author is: " +author +", The Title is: " +title+", The Page is: " +page+", The refnumber is:"+refNumber + ", Borrowed:"+ borrowed);}
     else {
       System.out.println("The Author is: " +author +", The Title is: " +title+", The Page is: " +page+", The refnumber is:"+"ZZZ");}
    }
}
