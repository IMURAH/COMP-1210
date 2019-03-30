/**
 * set inventoryItems and calculates price based on taxRate.
 *
 * Activity 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class OnlineArticle extends OnlineTextItem {

   //Variables
   private int wordCount;

   //Constructor
  /**
   * creates OnlineArticle object.
   *
   * @param nameIn take String as name.
   * @param priceIn take double as price.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

   //Methods
  /**
   * @param wordCountIn take int set as wordCount.
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}
