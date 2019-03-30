import java.text.DecimalFormat;
/**
 * extend class from bunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class ShowBunny extends Bunny  {

   //FIELDS
   /**
    * constant value for base cost of raising a ShowBunny.
    */
   public static final double BASE_COST = 2.75;
   private double groomingCost;

   //Constructor
   /**
    * Creates a ShowBunny Object.
    *
    * @param nameIn a String for name.
    * @param breedIn a String for breed.
    * @param weightIn a double for weight.
    * @param groomingCostIn a double for groomingCost.
    */
   public ShowBunny(String nameIn, String breedIn, double weightIn,
                        double groomingCostIn) throws NegativeValueException {
      super(nameIn, breedIn, weightIn);
      if (groomingCostIn < 0) {
        //bunnyCount--;
        throw new NegativeValueException();
        }
      groomingCost = groomingCostIn;
      }

   //Methods
   /**
    * @return return groomingCost.
    */
   public double getGroomingCost() {
      return groomingCost;
   }

   /**
    * @param groomingCostIn sets groomingCost.
    */
   public void setGroomingCost(double groomingCostIn)  {
      groomingCost = groomingCostIn;
   }

   /**
    * @return return a double represents estimatedMonthlyCost.
    */
   public double estimatedMonthlyCost()  {
      return BASE_COST * weight + groomingCost;
   }

   /**
    * @return return toString.
    */
   public String toString()  {
      String pattern = "#,##0.00";
      DecimalFormat df = new DecimalFormat(pattern);
      String result = super.toString();
      result += " (includes $" + df.format(getGroomingCost())
                                                            + " for grooming)";
      return result;
   }

}
