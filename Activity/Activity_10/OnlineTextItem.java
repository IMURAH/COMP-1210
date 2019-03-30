/**
 * set inventoryItems and calculates price based on taxRate.
 *
 * Activity 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public abstract class OnlineTextItem extends InventoryItem  {

   //Constructor
  /**
   * creates online text object.
   *
   * @param nameIn take String as name.
   * @param priceIn take double as price.
   */
   public OnlineTextItem(String nameIn, double priceIn)  {
      super(nameIn, priceIn);
   }

  /**
   * @return return double as price.
   */
   public double calculateCost() {
      return price;
   }
}
