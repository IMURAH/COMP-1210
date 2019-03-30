/**
 * extend class from PetBunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class HouseBunny extends PetBunny  {

   //FIELDS
  /**
   * constant value for base cost.
   */
   public static final double BASE_COST = 2.25;
   private double wearAndTear;

   //Constructor
  /**
   * Creates a HouseBunny object.
   *
   * @param nameIn takes a string for name.
   * @param breedIn takes a string for breed.
   * @param weightIn takes a double for weight.
   * @param wearAndTearIn takes a double for wearAndTear.
   */
   public HouseBunny(String nameIn, String breedIn, double weightIn,
                                                     double wearAndTearIn) {
      super(nameIn, breedIn, weightIn);
      wearAndTear = wearAndTearIn;
   }

   //Methods
   /**
    * @return return wearAndTear.
    */
   public double getWearAndTear()  {
      return wearAndTear;
   }

   /**
    * @param wearAndTearIn sets wearAndTear.
    */
   public void setWearAndTear(double wearAndTearIn)  {
      wearAndTear = wearAndTearIn;
   }

   /**
    * @return return a double represents estimatedMonthlyCost
    */
   public double estimatedMonthlyCost()  {
      return BASE_COST * weight * (1 + wearAndTear);
   }

   /**
    * @return return toString.
    */
   public String toString()  {
      String result = super.toString();
      result += " (includes " + getWearAndTear() * 100 + "% for wear and tear)";
      return result;
   }
}
