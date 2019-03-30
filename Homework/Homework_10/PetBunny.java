/**
 * extend class from bunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class PetBunny extends Bunny {

   //Variables
   /**
    * Constant Cost.
    */
   public static final double BASE_COST = 1.85;

   //Constructor
  /**
   * Creates a PetBunny object.
   *
   * @param nameIn take string for name.
   * @param breedIn take string for breed.
   * @param weightIn take double for weight.
   */
   public PetBunny(String nameIn, String breedIn, double weightIn) {
      super(nameIn, breedIn, weightIn);
   }

   //Methods
  /**
   * @return return double for estimatedMonthlyCost.
   */
   public double estimatedMonthlyCost()  {
      return BASE_COST * getWeight();
   }

  /**
   * @return return toString.
   */
   public String toString()  {
      String result = super.toString();
      return result;
   }
}
