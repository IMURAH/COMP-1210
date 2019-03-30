import java.text.DecimalFormat;
/**
 * extend class from bunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class JumpingBunny extends Bunny {

   //FIELDS
   /**
    * constant base cost for JumpingBunny.
    */
   public static final double BASE_COST = 2.50;
   private double trainingCost;

   //Constructor
   /**
    * Creates a JumpingBunny Object.
    *
    * @param nameIn a String for name.
    * @param breedIn a String for breed.
    * @param weightIn a double for weight.
    * @param trainingCostIn a double for trainingCost.
    */
   public JumpingBunny(String nameIn, String breedIn, double weightIn,
                        double trainingCostIn) throws NegativeValueException {
      super(nameIn, breedIn, weightIn);
      if (trainingCostIn < 0) {
        //bunnyCount--;
         throw new NegativeValueException();
      }
      trainingCost = trainingCostIn;
   }

   //Methods
   /**
    * @return return trainingCost.
    */
   public double getTrainingCost() {
      return trainingCost;
   }

   /**
    * @param trainingCostIn sets trainingCost.
    */
   public void setTrainingCost(double trainingCostIn)  {
      trainingCost = trainingCostIn;
   }

   /**
    * @return return estimatedMonthlyCost (double).
    */
   public double estimatedMonthlyCost()  {
      return BASE_COST * weight + trainingCost;
   }

   /**
    * @return return toString.
    */
   public String toString()  {
      String pattern = "#,##0.00";
      DecimalFormat df = new DecimalFormat(pattern);
      String result = super.toString();
      result += " (includes $" + df.format(getTrainingCost())
                                                            + " for training)";
      return result;
   }

}
