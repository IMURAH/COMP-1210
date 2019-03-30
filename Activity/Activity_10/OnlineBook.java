/**
 * set inventoryItems and calculates price based on taxRate.
 *
 * Activity 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class OnlineBook extends OnlineTextItem  {

   //Variables
   protected String author;

   //Constructor
  /**
   * creates a OnlineBook project.
   *
   * @param nameIn take String as name.
   * @param priceIn take double as price.
   */
   public OnlineBook(String nameIn, double priceIn)  {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

   //Methods
  /**
   * @return return toString.
   */
   public String toString()  {
      return name + " - " + author + ": $" + calculateCost();
   }

  /**
   * @param nameIn take String as name for author.
   */
   public void setAuthor(String nameIn)  {
      author = nameIn;
   }
}
