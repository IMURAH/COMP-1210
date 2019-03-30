import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * A test class for JumpingBunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class JumpingBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** getTrainingCostTest. **/
   @Test public void getTrainingCostTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
   
      Assert.assertEquals("getTrainingCost", 25.0, jb1.getTrainingCost(), .1);
   }

   /** setTrainingCostTest. **/
   @Test public void setTrainingCostTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      jb1.setTrainingCost(50.0);
   
      Assert.assertEquals("setTrainingCost", 50.0, jb1.getTrainingCost(), .1);
   }

   /** estimatedMonthlyCostTest. **/
   @Test public void estimatedMonthlyCostTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
   
      Assert.assertEquals("estimatedMonthlyCost", 40.75,
                                              jb1.estimatedMonthlyCost(), .1);
   }

   /** A test for toString. **/
   @Test public void toStringTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
   
      Assert.assertEquals("toString", true, jb1.toString().contains("Speedy"));
      Assert.assertEquals("toString", true, jb1.toString().contains("English"));
      Assert.assertEquals("toString", true, jb1.toString().contains("6.3"));
      Assert.assertEquals("toString", true, jb1.toString().contains("40.75"));
   
   }
}
