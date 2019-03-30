import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * A test class for ShowBunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class ShowBunnyTest {


    /** Fixture initialization (common initialization
     *  for all tests). **/
   @Before public void setUp() {
   }


    /** getGroomingCostTest. **/
   @Test public void getGroomingCostTest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);

      Assert.assertEquals("getGroomingCost", 22.0, sb1.getGroomingCost(), .1);
   }

    /** setTrainingCostTest. **/
   @Test public void setTrainingCostTest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      sb1.setGroomingCost(50.0);

      Assert.assertEquals("setGroomingCost", 50.0, sb1.getGroomingCost(), .1);
   }

    /** estimatedMonthlyCostTest. **/
   @Test public void estimatedMonthlyCostTest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);

      Assert.assertEquals("estimatedMonthlyCost", 62.15,
                                               sb1.estimatedMonthlyCost(), .1);
   }

    /** A test for toString. **/
   @Test public void toStringTest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);

      Assert.assertEquals("toString", true, sb1.toString().contains("Bigun"));
      Assert.assertEquals("toString", true, sb1.toString().contains("Flemish"));
      Assert.assertEquals("toString", true, sb1.toString().contains("14.6"));
      Assert.assertEquals("toString", true, sb1.toString().contains("62.15"));

   }
}
