import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * Test ConicalFrustum methods.
 *
 * Homework 08A
 * @author Le Cai LZC0033 COMP1210-005
 * @version 3/23/18
 */
public class ConicalFrustumTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   //SETTER METHODS//
   /** A test of setters. **/
   @Test public void setLabelTest() {
      ConicalFrustum obj = new ConicalFrustum("test1", 1, 2, 3);
      obj.setLabel("test");

      Assert.assertEquals("set Label fail", "test", obj.getLabel());
   }
   /** A test of setters. **/
   @Test public void setNegativeLabelTest() {
      ConicalFrustum obj = new ConicalFrustum("test", 1, 2, 3);
      obj.setLabel(null);

      Assert.assertEquals("set null label fail", "test", obj.getLabel());
   }

   /** A test of setters. **/
   @Test public void setRadius1Test() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);
      obj.setRadius1(1.0);

      Assert.assertEquals("set R1 fail", 1.0, obj.getRadius1(), .000001);
   }
   /** A test of setters. **/
   @Test public void setNegativeRadius1Test() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);
      obj.setRadius1(-9);

      Assert.assertEquals("set -R1 fail", 9, obj.getRadius1(), .000001);
   }

   /** A test of setters. **/
   @Test public void setRadius2Test() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);
      obj.setRadius2(1.0);

      Assert.assertEquals("set R2 fail", 1.0, obj.getRadius2(), .000001);
   }

   /** A test of setters. **/
   @Test public void setNegativeRadius2Test() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);
      obj.setRadius2(-9);

      Assert.assertEquals("set -R2 fail", 9, obj.getRadius2(), .000001);
   }

   /** A test of setters. **/
   @Test public void setHeightTest() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);
      obj.setHeight(1.0);

      Assert.assertEquals("set Ht fail", 1.0, obj.getHeight(), .000001);
   }

   /** A test of setters. **/
   @Test public void setNegativeHeightTest() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);
      obj.setHeight(-9);

      Assert.assertEquals("set -HT fail", 9, obj.getHeight(), .000001);
   }

   //@Test public void negativeSetters()  {
      //ConicalFrustum obj = new ConicalFrustum("", 9, 9, 9);
      //Assert.assertEquals("null label fail", empty, obj.getLabel());
      //obj = new ConicalFrustum("test", -9, 9, 9);
      //Assert.assertEquals("negative R1 fail", 0, obj.getRadius1());
      //obj = new ConicalFrustum("test", 9, -9, 9);
      //Assert.assertEquals("negative R2 fail", 0, obj.getRadius2());
      //obj = new ConicalFrustum("test", 9, 9, -9);
      //Assert.assertEquals("negative HT fail", 0, obj.getHeight());
   //}

   //GETTER METHODS//
   /** A test of getters. **/
   @Test public void getLabelTest() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);

      Assert.assertEquals("get Label fail", "test1", obj.getLabel());
   }

   /** A test of getters. **/
   @Test public void getRadius1Test() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);

      Assert.assertEquals("get R1 fail", 9, obj.getRadius1(), .000001);
   }

   /** A test of getters. **/
   @Test public void getRadius2Test() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);

      Assert.assertEquals("get R2 fail", 9, obj.getRadius2(), .000001);
   }

   /** A test of getters. **/
   @Test public void getHeightTest() {
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);

      Assert.assertEquals("get Ht fail", 9, obj.getHeight(), .000001);
   }

   /** A test of getters. **/
   @Test public void getCountTest() {
      ConicalFrustum.resetCount();
      ConicalFrustum obj = new ConicalFrustum("test1", 9, 9, 9);
      ConicalFrustum obj2 = new ConicalFrustum("test1", 9, 9, 9);
      ConicalFrustum obj3 = new ConicalFrustum("test1", 9, 9, 9);

      Assert.assertEquals("get count fail", 3, ConicalFrustum.getCount());
   }
   //Calculation METHODS//
   /** A test of volume. **/
   @Test public void volumeTest() {
      ConicalFrustum obj = new ConicalFrustum("test", 1, 2, 3);

      Assert.assertEquals("volume fail", 22, obj.volume(), .01);
   }
   /** A test of slantHeight. **/
   @Test public void slantHeightTest() {
      ConicalFrustum obj = new ConicalFrustum("test", 1, 2, 3);

      Assert.assertEquals("slantHeight fail", 3, obj.slantHeight(), .2);
   }
   /** A test of lateralSurfaceArea. **/
   @Test public void lateralSurfaceAreaTest() {
      ConicalFrustum obj = new ConicalFrustum("test", 1, 2, 3);

      Assert.assertEquals("LSA fail", 30, obj.lateralSurfaceArea(), .2);
   }
   /** A test of totalSurfaceArea. **/
   @Test public void totalSurfaceAreaTest() {
      ConicalFrustum obj = new ConicalFrustum("test", 1, 2, 3);

      Assert.assertEquals("TSA fail", 45, obj.totalSurfaceArea(), .512);
   }
   /** A test of toString. **/
   @Test public void toStringTest() {
      ConicalFrustum obj = new ConicalFrustum("test", 1, 2, 3);

      Assert.assertEquals("toString", true, obj.toString().contains("test"));
      Assert.assertEquals("toString", true, obj.toString().contains("1.0"));
      Assert.assertEquals("toString", true, obj.toString().contains("2.0"));
      Assert.assertEquals("toString", true, obj.toString().contains("3.0"));
      Assert.assertEquals("toString", true, obj.toString().contains("21.991"));
      Assert.assertEquals("toString", true, obj.toString().contains("3.162"));
      Assert.assertEquals("toString", true, obj.toString().contains("29.804"));
      Assert.assertEquals("toString", true, obj.toString().contains("45.512"));
   }
   /** A test of resetCount. **/
   @Test public void resetCountTest() {
      ConicalFrustum.resetCount();
      ConicalFrustum obj1 = new ConicalFrustum("test", 1, 2, 3);
      ConicalFrustum obj2 = new ConicalFrustum("test", 1, 2, 3);
      ConicalFrustum obj3 = new ConicalFrustum("test", 1, 2, 3);

      ConicalFrustum.resetCount();
      Assert.assertEquals("resetCount fail", 0, ConicalFrustum.getCount());
   }

   /** Test for equals(). */
   @Test public void equalsTest() {

      // the equals method has four conditions so five test cases are needed
      ConicalFrustum t1 = new ConicalFrustum("test", 7, 10, 7);
      ConicalFrustum t2 = new ConicalFrustum("test", 7, 10, 7);
      Assert.assertEquals("equals test",
                        true, t1.equals(t2));
      t2 = new ConicalFrustum("test1", 7, 10, 7);
      Assert.assertEquals("equals false test",
                        false, t1.equals(t2));

      t2 = new ConicalFrustum("test", 6, 10, 7);
      Assert.assertEquals("equals false test",
                        false, t1.equals(t2));


      t2 = new ConicalFrustum("test", 7, 9, 7);
      Assert.assertEquals("equals false test",
                        false, t1.equals(t2));

      t2 = new ConicalFrustum("test", 7, 10, 9);
      Assert.assertEquals("equals false test",
                        false, t1.equals(t2));

      Assert.assertEquals("equals false test",
                        false, t1.equals("obj")); // Is t1 equal to a String?

      // Also test hashCode
      Assert.assertEquals("equals false test",
                        0, t1.hashCode());
   }

}
