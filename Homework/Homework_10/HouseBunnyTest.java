import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * A test class for HouseBunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class HouseBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** get wear and tear test. **/
   @Test public void getWearAndTearTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
   
      Assert.assertEquals("getWearAndTear", 0.15, hb1.getWearAndTear(), .1);
   }

   /** set wear and tear test. **/
   @Test public void setWearAndTearTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      hb1.setWearAndTear(0.50);
   
      Assert.assertEquals("setWearAndTear", 0.50, hb1.getWearAndTear(), .1);
   }

   /** estimatedMonthlyCost test. **/
   @Test public void estimatedMonthlyCostTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
   
      Assert.assertEquals("estimatedMonthlyCost", 15.01,
                                            hb1.estimatedMonthlyCost(), .1);
   }

   /** A test for toString. **/
   @Test public void toStringTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
   
      Assert.assertEquals("toString", true, hb1.toString().contains("Spot"));
      Assert.assertEquals("toString", true, hb1.toString().contains("Really"));
      Assert.assertEquals("toString", true, hb1.toString().contains("5.8"));
      Assert.assertEquals("toString", true, hb1.toString().contains("15.01"));
   
   }


}
