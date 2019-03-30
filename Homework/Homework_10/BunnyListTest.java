import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
 * unit test for project 10.
 *
 * Project 10
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/16/18
 */
public class BunnyListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** read bunny file test.
    * @throws IOException throws IOException.
    */
   @Test public void readBunnyFileTest() throws IOException {

      BunnyList bunnyList = new BunnyList();
      bunnyList.readBunnyFile("bunnies1.txt");

      Assert.assertEquals("readBunnyFile", 4, bunnyList.getBunnyList().length);
   }

   /** Test for getListName. **/
   @Test public void getListNameTest()  {

      BunnyList bunnyList = new BunnyList();

      bunnyList.setListName("GJ");

      Assert.assertEquals("getListName", "GJ", bunnyList.getListName());
   }

   /** Test for setListName. **/
   @Test public void setListNameTest()  {

      BunnyList bunnyList = new BunnyList();

      bunnyList.setListName("GJ");

      Assert.assertEquals("setListName", "GJ", bunnyList.getListName());
   }

   /** Test for getBunnyList. 
    * @throws IOException throws IOException.
    */
   @Test public void getBunnyListTest() throws IOException {

      BunnyList bunnyList = new BunnyList();
      bunnyList.readBunnyFile("bunnies1.txt");

      Assert.assertEquals("getBunnyList", 4,
                                     bunnyList.getBunnyList().length);
   }

   /** Test for getExcludedRecords.
    * @throws IOException throws IOException.
    */
   @Test public void getExcludedRecordsTest() throws IOException {

      BunnyList bunnyList = new BunnyList();
      bunnyList.readBunnyFile("bunnies1.txt");

      Assert.assertEquals("getExcludedRecords", 2,
                                      bunnyList.getExcludedRecords().length);
   }

   /** Test for addBunny. **/
   @Test public void addBunnyTest()  {

      BunnyList bunnyList = new BunnyList();
      Bunny obj = new PetBunny("test", "test", 1);

      bunnyList.addBunny(obj);

      Assert.assertEquals("addBunnyTest", true,
                                        bunnyList.toString().contains("test"));
   }

   /** Test for addExcludedRecord. **/
   @Test public void addExcludedRecordTest()  {

      BunnyList bunnyList = new BunnyList();

      bunnyList.addExcludedRecord("test");

      Assert.assertEquals("addExcludedRecordTest", true,
                          bunnyList.excludedRecordsList().contains("test"));
   }

   /** Test for toString. **/
   @Test public void toStringTest()  {

      BunnyList bunnyList = new BunnyList();
      Bunny obj = new PetBunny("test", "test", 1);

      bunnyList.addBunny(obj);

      Assert.assertEquals("toStringTest", true,
                                        bunnyList.toString().contains("test"));
   }

   /** Test for totalEstimatedMonthlyCost. **/
   @Test public void totalEstimatedMonthlyCostTest()  {

      BunnyList bunnyList = new BunnyList();
      Bunny obj = new PetBunny("test", "test", 3.5);

      bunnyList.addBunny(obj);

      Assert.assertEquals("totalEstimatedMonthlyCostTest", 6.48,
                    bunnyList.totalEstimatedMonthlyCost(), 0.1);
   }

   /** Test for summary. **/
   @Test public void summaryTest()  {

      BunnyList bunnyList = new BunnyList();

      bunnyList.setListName("GJ");

      Assert.assertEquals("summaryTest", true,
                                        bunnyList.summary().contains("GJ"));
   }

   /** Test for listByName. **/
   @Test public void listByNameTest()  {

      BunnyList bunnyList = new BunnyList();

      Bunny ab = new PetBunny("a", "a", 1);
      Bunny bc = new PetBunny("b", "b", 2);

      bunnyList.addBunny(bc);
      bunnyList.addBunny(ab);

      Assert.assertEquals("listByName", true,
                                        bunnyList.listByName().contains("a"));
   }

   /** Test for listByCost. **/
   @Test public void listByCostTest()  {

      BunnyList bunnyList = new BunnyList();

      Bunny ab = new PetBunny("a", "a", 1);
      Bunny bc = new PetBunny("b", "b", 2);

      bunnyList.addBunny(bc);
      bunnyList.addBunny(ab);

      Assert.assertEquals("listByCost", true,
                                        bunnyList.listByCost().contains("a"));
   }

   /** Test for excludedRecords. **/
   @Test public void excludedRecordsTest()  {

      BunnyList bunnyList = new BunnyList();

      bunnyList.addExcludedRecord("test");

      Assert.assertEquals("addExcludedRecordTest", true,
                          bunnyList.excludedRecordsList().contains("test"));
   }



}
