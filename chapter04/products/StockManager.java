import java.util.ArrayList;
import java.util.Iterator;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    /*Exercise 4.60  P147*/
    public void addProduct(Product item)
    {
        if(findProduct(item.getID()) != null)
        {   System.out.println("The product is exist");}
        else 
        {   stock.add(item);} 
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    /*Exercise 4.59  P147*/
    public void delivery(int id, int amount)
    {
        Iterator<Product> it = stock.iterator();
        while(it.hasNext()){
            Product product = it.next();
            if (product.getID() == id)
            {   product.increaseQuantity(amount);}
            }
        
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    /*Exercise 4.57  P146*/
    public Product findProduct(int id)
    {
        Iterator<Product> it = stock.iterator();
        while(it.hasNext()){
            Product product = it.next();
            if (product.getID() == id)
            {   System.out.println(product.toString());
                return product;}
            }
        return null;
    }
    
    /*Exercise 4.60  P147*/
    public Product findProduct(String name)
    {
        Iterator<Product> it = stock.iterator();
        while(it.hasNext()){
            Product product = it.next();
            if (product.getName().equals(name))
            {   System.out.println(product.toString());
                return product;}
            }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    /*Exercise 4.58  P147*/
    public int numberInStock(int id)
    {
        Iterator<Product> it = stock.iterator();
        while(it.hasNext()){
            Product product = it.next();
            if (product.getID() == id)
            {   System.out.println(product.getQuantity());
                return product.getQuantity();}
            }
        
        return 0;
    }

    /**
     * Print details of all the products.
     */
    /*Exercise 4.56  P146*/
    public void printProductDetails()
    {
        Iterator<Product> it = stock.iterator();
        while(it.hasNext()){
            Product product = it.next();
            System.out.println(product.toString());
        }
        
    }
    
    /*Exercise 4.60  P147*/
     public void printLessProduct(int level)
    {
        Iterator<Product> it = stock.iterator();
        int id = 0;
        while(it.hasNext()){
            Product product = it.next();
            id = product.getID();
            if(numberInStock(id) < level)
             {  System.out.println(product.toString());
            }
        
        }
}
}