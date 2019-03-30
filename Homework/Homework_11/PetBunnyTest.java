import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * A test class for PetBunny.
 *
 * Homework 09
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/02/18
 */
public class PetBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** setNameTest. **/
   @Test public void setNameTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      pb1.setName("Bun");

      Assert.assertEquals("setNameTest", "Bun", pb1.getName());
   }

   /** setBreedTest. **/
   @Test public void setBreedTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      pb1.setBreed("Bun");

      Assert.assertEquals("setBreedTest", "Bun", pb1.getBreed());
   }


   /** setWeightTest. **/
   @Test public void setWeightTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      pb1.setWeight(5.0);

      Assert.assertEquals("setWeightTest", 5.0, pb1.getWeight(), .1);
   }


   /** A test for estimatedMonthlyCost. **/
   @Test public void estimatedMonthlyCostTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals("PetBunny Cost Test", 6.48,
                                                pb1.estimatedMonthlyCost(), .1);
   }

   /** A test for toString. **/
   @Test public void toStringTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);

      Assert.assertEquals("toString", true, pb1.toString().contains("Floppy"));
      Assert.assertEquals("toString", true, pb1.toString().contains("Holland"));
      Assert.assertEquals("toString", true, pb1.toString().contains("3.5"));
      Assert.assertEquals("toString", true, pb1.toString().contains("6.48"));

   }

   /** Equals test. **/
   @Test public void equalsTest() {

      PetBunny t1 = new PetBunny("a", "b", 1.0);
      PetBunny t2 = new PetBunny("a", "b", 1.0);

      Assert.assertEquals("equals test",
                        true, t1.equals(t2));
      t2 = new PetBunny("b", "b", 1.0);
      Assert.assertEquals("equals false test",
                        false, t1.equals(t2));

      t2 = new PetBunny("a", "a", 1.0);
      Assert.assertEquals("equals false test",
                        false, t1.equals(t2));


      t2 = new PetBunny("a", "b", 2.0);
      Assert.assertEquals("equals false test",
                        false, t1.equals(t2));

      Assert.assertEquals("equals false test",
                        false, t1.equals("obj")); // Is t1 equal to a String?

   }

   /** hashCode test. **/
   @Test public void hashCodeTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);

      Assert.assertEquals("hashCodeTest", 0, pb1.hashCode());
   }

   /** compareTo test. **/
   @Test public void compareToTest() {

      PetBunny t1 = new PetBunny("a", "b", 1.0);
      PetBunny t2 = new PetBunny("a", "b", 1.0);

      Assert.assertEquals("compareTo Test",
                        0, t1.compareTo(t2));
      t2 = new PetBunny("a", "b", 1.5);
      Assert.assertEquals("compareTo test",
                        -1, t1.compareTo(t2));

      t2 = new PetBunny("a", "a", 0.5);
      Assert.assertEquals("compareTo test",
                        1, t1.compareTo(t2));

   }

}
