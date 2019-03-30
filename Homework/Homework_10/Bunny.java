import java.text.DecimalFormat;
/**
 * abstract class bunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public abstract class Bunny implements Comparable<Bunny> {

   //FIELDS
   protected String name;
   protected String breed;
   protected double weight;
   protected static int bunnyCount;

   //Constructor
  /**
   * Creates a bunny object.
   *
   * @param nameIn takes String save as name.
   * @param breedIn takes String saves as breed.
   * @param weightIn takes double saves as weight.
   */
   public Bunny(String nameIn, String breedIn, double weightIn)  {
      name = nameIn;
      breed = breedIn;
      weight = weightIn;
      bunnyCount++;
   }

   //Methods
   /**
    * @return return name as string.
    */
   public String getName() {
      return name;
   }

   /**
    * @param nameIn take string as name.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }

   /**
    * @return return breed as string.
    */
   public String getBreed()  {
      return breed;
   }

   /**
    * @param breedIn take string as breed.
    */
   public void setBreed(String breedIn)  {
      breed = breedIn;
   }

   /**
    * @return return double as weight.
    */
   public double getWeight() {
      return weight;
   }

   /**
    * @param weightIn take double as weight.
    */
   public void setWeight(double weightIn)  {
      weight = weightIn;
   }

   /**
    * @return return int as bunnyCount.
    */
   public static int getBunnyCount() {
      return bunnyCount;
   }

   /**
    * resets bunnyCount.
    */
   public static void resetBunnyCount()  {
      bunnyCount = 0;
   }

   /**
    * abstract method for estimatedMonthlyCost.
    * @return return estimatedMonthlyCost.
    */
   public abstract double estimatedMonthlyCost();

   /**
    * @return return toString.
    */
   public String toString()  {
      String pattern = "#,##0.00";
      DecimalFormat df = new DecimalFormat(pattern);
      String result = getName() + " (" + this.getClass().getName()
                                  + ")   Breed: " + getBreed()
                                  + "   Weight: " + getWeight();
      result += "\nEstimated Monthly Cost: $"
                                           + df.format(estimatedMonthlyCost());
      return result;
   }

   /**
    * @param obj takes a object to test if its equal.
    * @return return result.
    */
   public boolean equals(Object obj) {

      if (!(obj instanceof Bunny))  {
         return false;
      }
      else  {
         Bunny b = (Bunny) obj;
         return (name.equalsIgnoreCase(b.getName())
                && breed.equalsIgnoreCase(b.getBreed())
                && Math.abs(weight - b.getWeight()) < .000001);
      }
   }

   /**
    * @return reutrn 0.
    */
   public int hashCode()  {
      return 0;
   }

   /**
    * @param obj takes a bunny object to compareTo.
    * @return return a int to show result.
    */
   public int compareTo(Bunny obj) {

      /**if (Math.abs(this.weight - obj.getWeight()) < 0.000001) {
         return 0;
      }
      else if (this.weight < obj.getWeight()) {
         return -1;
      }
      else {
         return 1;

      }
      */
      return (this.name.toLowerCase().compareTo(obj.getName().toLowerCase()));
   }

}
