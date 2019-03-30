import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * unit test for project 10.
 *
 * Project 10
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/16/18
 */
public class BunniesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** test for constructor.
    * @throws FileNotFoundException throws file not found exception.
    */
   @Test public void bunniesPart2Test() throws FileNotFoundException {
      BunniesPart2 bPart2Obj = new BunniesPart2(); // test constructor

      Bunny.resetBunnyCount();

      String[] args = {"bunnies1.txt"};
      BunniesPart2.main(args);
      Assert.assertEquals(4, Bunny.getBunnyCount());
   }
}
