/**
 * set inventoryItems and calculates price based on taxRate.
 *
 * Activity 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class InventoryItem  {

  //Variables
   protected String name;
   protected double price;
   private static double taxRate = 0;

  //Constructor
  /**
   * creates item object.
   *
   * @param nameIn takes item name.
   * @param priceIn takes price name.
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }

  //Methods
  /**
   * @return return string as name.
   */
   public String getName() {
      return name;
   }

  /**
   * @return return double as cost for item.
   */
   public double calculateCost() {
      double cost = price * (1 + taxRate);
      return cost;
   }

  /**
   * @param taxRateIn set taxRate.
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }

  /**
   * @return return toString, print name and cost.
   */
   public String toString()  {
      return name + ": $" + calculateCost();
   }
}
