/**
 * A class contains NumberOperations methods.
 *
 * Activity 05
 * @author Le Cai LZC0033 COMP1210-005
 * @version 02/19/18
 */
public class NumberOperations {
  //instance variables
   private int number;

   //Constructor//
   /**
    * Reads a integer number and set as number for calculations.
    *
    * @param numberIn takes a integer and set as number
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   //Methods//
/**
 * takes no value and returns number.
 *
 * @return returns integer number.
 */
   public int getValue() {
      return number;
   }
/**
 * calculate the odd number under number we had by while loop.
 *
 * @return returns a string contains all the odd numbers under the number.
 */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
/**
 * calculate postive powers of two less than the value of number.
 *
 * @return returns a string contains the positive powers that is two less.
 */
   public String powersTwoUnder()  {
      String output = "";
      int powers = 1;
      while (powers < number)  {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
/**
 * compare number with a compare number.
 *
 * @param compareNumber a integer number to be compared with.
 * @return returns a integer value to indicate the result.
 */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber)  {
         return -1;
      }
      else  {
         return 0;
      }
   }
/**
 * prints number as string.
 *
 * @return returns a string containing number.
 */
   public String toString()  {
      return number + "";
   }
}
