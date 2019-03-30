import java.util.ArrayList;
/**
 * A program that takes temps and calculate high and low.
 *
 * Activity 06
 * @author Le Cai LZC0033 COMP1210-005
 * @version 02/26/18
 */
public class Temperatures {
  /**
   * takes temp and store in a ArrayList.
   *
   * @param args Comand lien arugments - not used.
   */
   //INSTANCE VARIABLES
   private ArrayList<Integer> temperatures;

   //CONSTRUCTOR//
   /**
    * creates a temp object.
    *
    * @param temperaturesIn for temperatures.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn)  {
      temperatures = temperaturesIn;
   }

   //METHODS//
   /**
    * @return return low temp.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty())  {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low)  {
            low = temperatures.get(i);
         }
      }
      return low;
   }

   /**
    * @return return high temps.
    */
   public int getHighTemp()  {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high)  {
            high = temp;
         }
      }
      return high;
   }
   /**
    * @param lowIn takes low value.
    * @return return the lowest value.
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
    * @param highIn takes high value.
    * @return return hightest value.
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
    * @return return summary.
    */
   public String toString()  {
      return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();
   }

}
