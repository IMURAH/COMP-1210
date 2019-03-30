import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
 * Test ConicalFrustumList2 Methods.
 *
 * Homework 08B
 * @author Le Cai LZC0033 COMP1210-005
 * @version 03/23/18
 */
public class ConicalFrustumList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test for getListName(). */
   @Test public void getNameTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("cf1", 1, 2, 3);
      cf[1] = new ConicalFrustum("cf2", 1, 2, 3);
      cf[2] = new ConicalFrustum("cf3", 1, 2, 3);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("testList", cf, 3);

      Assert.assertEquals("getName Test", "testList", cfList.getName());
   }

   /** Test for numOfConicalFrustum. */
   @Test public void numOfConicalFrustumTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("cf1", 1, 2, 3);
      cf[1] = new ConicalFrustum("cf2", 1, 2, 3);
      cf[2] = new ConicalFrustum("cf3", 1, 2, 3);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("testList", cf, 3);

      Assert.assertEquals("numOfCF Test", 3, cfList.numberOfConicalFrustums());
   }

   /** Test for TSA. */
   @Test public void totalSurfaceAreaTest() {

      ConicalFrustum[] cf0 = new ConicalFrustum[0];
      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);
      ConicalFrustumList2 cfList0 = new ConicalFrustumList2("test1", cf0, 0);

      Assert.assertEquals("TSA Test", 407734, cfList.totalSurfaceArea(), 0.1);
      Assert.assertEquals("-TSA Test", 0, cfList0.totalSurfaceArea(), .000001);
   }

   /** Test for totalVolume. */
   @Test public void totalVolumeTest() {

      ConicalFrustum[] cf0 = new ConicalFrustum[0];
      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);
      ConicalFrustumList2 cfList0 = new ConicalFrustumList2("test1", cf0, 0);

      Assert.assertEquals("tV Test", 0, cfList0.totalVolume(), .000001);
      Assert.assertEquals("tV Test", 18023600, cfList.totalVolume(), 1.0);
   }

   /** Test for averageSurfaceArea. */
   @Test public void averageSurfaceAreaTest() {

      ConicalFrustum[] cf0 = new ConicalFrustum[20];
      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);
      ConicalFrustumList2 cfList0 = new ConicalFrustumList2("test1", cf0, 0);

      Assert.assertEquals("ASA Test", 135911, cfList.averageSurfaceArea(), 1);
      Assert.assertEquals("-ASA Test", 0,
                          cfList0.averageSurfaceArea(), .000001);
   }

   /** Test for averageVolume. */
   @Test public void averageVolumeTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);

      Assert.assertEquals("avgV Test", 6007866, cfList.averageVolume(), 1);
   }

   /** Test for Negative totalVolume. */
   @Test public void negativeaverageVolumeTest() {

      ConicalFrustum[] cf0 = new ConicalFrustum[20];

      ConicalFrustumList2 cfList0 = new ConicalFrustumList2("test1", cf0, 0);

      Assert.assertEquals("-avgV Test", 0, cfList0.averageVolume(), .000001);
   }

   /** A test of toString. **/
   @Test public void toStringTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfL = new ConicalFrustumList2("test1", cf, 3);

      Assert.assertEquals("toString", true, cfL.toString().contains("Small"));
      Assert.assertEquals("toString", true, cfL.toString().contains("Medium"));
      Assert.assertEquals("toString", true, cfL.toString().contains("Large"));
      Assert.assertEquals("toString", true, cfL.toString().contains("0.354"));
      Assert.assertEquals("toString", true, cfL.toString().contains("16.698"));
      Assert.assertEquals("toString", true, cfL.toString().contains("269.512"));
   }

   /** A test of sumInfo. **/
   @Test public void summaryInfoTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfL = new ConicalFrustumList2("test1", cf, 3);

      Assert.assertEquals(true,
            cfL.summaryInfo().contains("Number of ConicalFrustum Objects: 3"));
   }

   /** Test for readFile().
    * @throws IOException for reading a file
    */
   @Test public void readFileTest() throws IOException {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);
      //tList = tList.readFile("triangle.txt");

      //Assert.assertEquals("readFile Test",
                           //"Nice Small Set of Triangles",
                           //tList.getListName());
   }

  /** Test for addConicalFrustum(). */
   @Test public void addConicalFrustumTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);

      ConicalFrustum t = new ConicalFrustum("t", 7, 7, 7);
      cfList.addConicalFrustum("t", 7, 7, 7);
      ConicalFrustum[] cF = cfList.getList();

      Assert.assertEquals("addCF Test", t, cF[3]);
   }

   /** Test for findConicalFrustum(). */
   @Test public void findConicalFrustumTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);

      ConicalFrustum t = cfList.findConicalFrustum("Small");

      Assert.assertEquals("fCF Test", t, cf[0]);

      Assert.assertEquals("fCF Test", null, cfList.findConicalFrustum("DNE"));
   }

    /** Test for deleteConicalFrustum(). */
   @Test public void deleteConicalFrustumTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);

      ConicalFrustum[] cF = cfList.getList();

      Assert.assertEquals("deleteCF True", cf[0],
                          cfList.deleteConicalFrustum("Small"));

      Assert.assertEquals("deleteCF false", null,
                            cfList.deleteConicalFrustum("DNE"));
   }

   /** Test for editConicalFrustum(). */
   @Test public void editConicalFrustumTest() {

      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);

      ConicalFrustum obj = new ConicalFrustum("Small", 1, 2, 3);

      ConicalFrustum[] cF = cfList.getList();


      Assert.assertTrue("editCF", cfList.editConicalFrustum("Small", 1, 2, 3));

      Assert.assertFalse("editCF", cfList.editConicalFrustum("S", 1, 2, 3));
   }

   /** Test for findConicalFrustumWithLeastHeight(). */
   @Test public void findConicalFrustumWithLeastHeightTest() {
      int numOfConicalFrustum = 0;
      ConicalFrustum[] cf0 = new ConicalFrustum[0];
      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      cf[3] = new ConicalFrustum("Smaller", 1, 1, 0.05);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 4);
      ConicalFrustumList2 cfList0 = new ConicalFrustumList2("test1", cf0, 0);

      ConicalFrustum obj = cf[0];
      numOfConicalFrustum = 4;
      Assert.assertEquals("findCFMinH", obj,
                            cfList.findConicalFrustumWithLeastHeight());
      numOfConicalFrustum = 0;
      Assert.assertEquals("findCFMinH", null,
                            cfList0.findConicalFrustumWithLeastHeight());
   }

   /** Test for findConicalFrustumWithGreatestHeight(). */
   @Test public void findConicalFrustumWithGreatestHeightTest() {
      int numOfConicalFrustum = 0;
      ConicalFrustum[] cf0 = new ConicalFrustum[20];
      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);
      ConicalFrustumList2 cfList0 = new ConicalFrustumList2("test1", cf0, 0);

      ConicalFrustum obj = cf[2];

      numOfConicalFrustum = 3;
      Assert.assertEquals("findCFMaxH", obj,
                            cfList.findConicalFrustumWithGreatestHeight());

      numOfConicalFrustum = 0;
      Assert.assertEquals("findCFMaxH", null,
                            cfList0.findConicalFrustumWithGreatestVolume());
   }

   /** Test for findConicalFrustumWithLeastVolume(). */
   @Test public void findConicalFrustumWithLeastVolumeTest() {
      int numOfConicalFrustum = 0;
      ConicalFrustum[] cf0 = new ConicalFrustum[0];
      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      cf[3] = new ConicalFrustum("Smaller", .5, .5, 0.05);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 4);
      ConicalFrustumList2 cfList0 = new ConicalFrustumList2("test1", cf0, 0);

      ConicalFrustum obj = cf[0];

      numOfConicalFrustum = 4;
      Assert.assertEquals("findCFMinV", obj,
                            cfList.findConicalFrustumWithLeastVolume());

      numOfConicalFrustum = 0;
      Assert.assertEquals("findCFMinV", null,
                            cfList0.findConicalFrustumWithLeastVolume());
   }

   /** Test for findConicalFrustumWithGreatestVolume(). */
   @Test public void findConicalFrustumWithGreatestVolumeTest() {

      ConicalFrustum[] cf0 = new ConicalFrustum[20];
      ConicalFrustum[] cf = new ConicalFrustum[20];
      cf[0] = new ConicalFrustum("Small", .5, .75, .25);
      cf[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cf[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);

      ConicalFrustumList2 cfList = new ConicalFrustumList2("test1", cf, 3);
      ConicalFrustumList2 cfList0 = new ConicalFrustumList2("test1", cf0, 0);

      ConicalFrustum obj = cf[2];

      Assert.assertEquals("findCFMaxV", obj,
                            cfList.findConicalFrustumWithGreatestVolume());

      Assert.assertEquals("findCFMaxV", null,
                            cfList0.findConicalFrustumWithGreatestVolume());
   }

}
