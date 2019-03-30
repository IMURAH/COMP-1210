/**
 * creates a array called inventory stores items.
 *
 * Activity 10
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/09/18
 */
public class ItemsList  {

   // Instance Variables
   private InventoryItem[] inventory;
   private int count;

   //Constructor
   /**
    * Constructor creates a new inventoryItem array.
    */
   public ItemsList()  {
      inventory = new InventoryItem[20];
      count = 0;
   }

   // Methods
   /**
    * @param itemIn takes in an inventoryItem and add it into array.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }

   /**
    * @param surchargeIn takes in a double store as surcharge add into total.
    * @return return total value after calculation.
    */
   public double calculateTotal(double surchargeIn) {
      double total = 0;
      for (int i = 0; i < count; i++) {

         if (inventory[i] instanceof ElectronicsItem)  {
            total += inventory[i].calculateCost() + surchargeIn;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }

   /**
    * @return return output as string.
    */
   public String toString()  {
      String output = "All inventory:\n\n";

      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }

      return output;
   }


}
