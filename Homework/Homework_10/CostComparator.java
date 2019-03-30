import java.util.Comparator;
/**
 * cost comparator for bunny class.
 *
 * Project 10
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/16/18
 */
public class CostComparator implements Comparator<Bunny>  {
  /**
   * @param b1 bunny obj 1 for compare.
   * @param b2 bunny obj 2 for compare.
   * @return return int value for result.
   */
   public int compare(Bunny b1, Bunny b2)  {

      if (b1.estimatedMonthlyCost() > b2.estimatedMonthlyCost())  {
         return 1;
      }
      else if (b1.estimatedMonthlyCost() < b2.estimatedMonthlyCost()) {
         return -1;
      }
      else {
         return 0;
      }
   }
}
