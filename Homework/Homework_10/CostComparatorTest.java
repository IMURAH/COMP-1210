import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * unit test for project 10.
 *
 * Project 10
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/16/18
 */
public class CostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** test for compare method. **/
   @Test public void compareTest() {
      CostComparator obj = new CostComparator();

      Bunny b1 = new PetBunny("b1", "uni", 4);
      Bunny b2 = new PetBunny("b2", "uni", 2);

      Assert.assertEquals("greater", 1, obj.compare(b1, b2));

      Bunny b3 = new PetBunny("b3", "uni", 1);

      Assert.assertEquals("less", -1, obj.compare(b3, b2));

      Bunny b4 = new PetBunny("b4", "uni", 1);

      Assert.assertEquals("equal", 0, obj.compare(b3, b4));
   }
}
