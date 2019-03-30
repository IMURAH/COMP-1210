/**
 * User defined exception.
 *
 * Project 11
 * @author Le Cai LZC0033 COMP-1210-005
 * @version 04/18/18
 */
public class NegativeValueException extends Exception{

   //constructor
   /**
    * Constructor for exception.
    */
   public NegativeValueException() {
      super("Numeric value must be nonnegative");
   }
}
