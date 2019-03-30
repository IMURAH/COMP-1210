/**
 * creates a driver for inventoryitems including arrays.
 *
 * Activity 10
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/09/18
 */
public class InventoryListApp {
/**
 * creates 4 items and add them into ItemsList.
 *
 * @param args - not used.
 */
   public static void main(String[]  args) {

      ItemsList myItems = new ItemsList();

      InventoryItem.setTaxRate(0.05);

      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));

      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}
