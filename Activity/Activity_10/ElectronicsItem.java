/**
 * set inventoryItems and calculates price based on taxRate.
 *
 * Activity 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class ElectronicsItem extends InventoryItem  {

   //Variables
   /**
    * constant shipping cost = 1.5.
    */
   public static final double SHIPPING_COST = 1.5;
   protected double weight;

   //Constructor
  /**
   * take name, price and weight and create ElectronicsItem.
   *
   * @param nameIn takes String as name.
   * @param priceIn takes double as price.
   * @param weightIn takes double as weight.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

   //Methods
  /**
   * @return return cost with shipping.
   */
   public double calculateCost()  {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}
