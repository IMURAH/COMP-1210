import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Represents a list of Conical Frustrums.
 *
 * Homework 07
 * @author Le Cai LZC0033 COMP1210-005
 * @version 03/07/18
 */
public class ConicalFrustumList2 {

   //FIELDS//
   private String name = "";
   private ConicalFrustum[] cflist;
   private int numOfConicalFrustum = 0;

   //CONSTRUCTOR//
   /**
    * Creates a Conical Frustum object.
    *
    * @param numOfConicalFrustumIn counts how many objects are in the array.
    * @param nameIn for list name
    * @param cflistIn for cflist
    */
   public ConicalFrustumList2(String nameIn, ConicalFrustum[] cflistIn,
                              int numOfConicalFrustumIn)
   {
      name = nameIn;
      cflist = cflistIn;
      numOfConicalFrustum = numOfConicalFrustumIn;
   }

   //METHODS//
   /**
    * @return return list name
    */
   public String getName() {
      return name;
   }
   /**
    * @return return number of ConicalFrustum
    */
   public int numberOfConicalFrustums()  {
      return numOfConicalFrustum;
   }
   /**
    * @return return total surface Area
    */
   //calculate total surface area
   public double totalSurfaceArea()  {
      double totalSA = 0;
      int index = 0;
      //check if arraylist is empty
      if (cflist.length != 0)  {
         //does not equal to 0
         //using while to make sure it adds every data in ArrayList.
         while (index < numOfConicalFrustum) {
            //gets data on index and calculate totalSurfaceArea
            totalSA += cflist[index].totalSurfaceArea();
            index++;
         }
         return totalSA;
      }
      else {
         //arraylist is empty, return 0
         return 0;
      }
   }
   /**
    * @return return total Volume
    */
   public double totalVolume() {
      double totalV = 0;
      int index = 0;
      if (cflist.length != 0) {
         while (index < numOfConicalFrustum) {
            totalV += cflist[index].volume();
            index++;
         }
         return totalV;
      }
      else  {
         return 0;
      }
   }
   /**
    * @return average surface Area
    */
   public double averageSurfaceArea()  {
      if (numOfConicalFrustum != 0) {
         double avgSA = totalSurfaceArea() / numOfConicalFrustum;
         return avgSA;
      }
      else {
         return 0;
      }
   }
   /**
    * @return average Volume
    */
   public double averageVolume() {
      if (numOfConicalFrustum != 0) {
         double avgV = totalVolume() / numOfConicalFrustum;
         return avgV;
      }
      else {
         return 0;
      }
   }
   /**
    * @return return string for list
    */
   public String toString()  {
      String result = name + "\n";
      int index = 0;
      while (index < numOfConicalFrustum) {
         result += "\n" + cflist[index] + "\n";
         index++;
      }
      return result;
   }
   /**
    * @return return String containing summary
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of ConicalFrustum Objects: "
                + numberOfConicalFrustums();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());

      return result;
   }

   //NEW METHODS FOR PROJECT 6//
   /**
    * @return return arraylist.
    */
   public ConicalFrustum[] getList()  {
      return cflist;
   }

   /**
    * @param fileNameIn takes a string to read file.
    * @throws FileNotFoundException required by Scanner for file.
    * @return return arraylist.
    */
   public ConicalFrustumList2 readFile(String fileNameIn)
                                      throws FileNotFoundException  {

      Scanner scanFile = new Scanner(new File(fileNameIn));
      String cfListName = scanFile.nextLine();
      numOfConicalFrustum = 0;
      while (scanFile.hasNext())  {
         String labelName = scanFile.nextLine();
         double r1 = Double.parseDouble(scanFile.nextLine());
         double r2 = Double.parseDouble(scanFile.nextLine());
         double ht = Double.parseDouble(scanFile.nextLine());

         ConicalFrustum obj = new ConicalFrustum(labelName, r1, r2, ht);
         cflist[numOfConicalFrustum] = obj;
         numOfConicalFrustum++;
      }

      ConicalFrustumList2 cf = new ConicalFrustumList2(cfListName,
                                                  cflist, numOfConicalFrustum);

      return cf;
   }

   /**
    * @param labelIn takes string as label.
    * @param r1In takes double as radius 1.
    * @param r2In takes double as radius 2.
    * @param htIn takes double as height.
    */
   public void addConicalFrustum(String labelIn, double r1In,
                                  double r2In, double htIn) {
      ConicalFrustum cf = new ConicalFrustum(labelIn, r1In, r2In, htIn);

      cflist[numOfConicalFrustum] = cf;
      numOfConicalFrustum++;
   }

   /**
    * @param labelIn takes string as label.
    * @return return object or null.
    */
   public ConicalFrustum findConicalFrustum(String labelIn)  {

      int index = -1;
      for (int i = 0; i < numOfConicalFrustum; i++) {
         if (cflist[i].getLabel().equalsIgnoreCase(labelIn))  {
            index = Arrays.asList(cflist).indexOf(cflist[i]);
            break;
         }
      }
      if (index >= 0) {
         return cflist[index];
      }
      else {
         return null;
      }
   }

   /**
    * @param labelIn takes string as label for input.
    * @return return object deleted or null.
    */
   public ConicalFrustum deleteConicalFrustum(String labelIn)  {
      if (findConicalFrustum(labelIn) != null)  {
         ConicalFrustum cfReturn = findConicalFrustum(labelIn);
         int index = Arrays.asList(cflist).indexOf(cfReturn);

         for (int j = index; j < numOfConicalFrustum - 1; j++)  {
            cflist[j] = cflist[j + 1];
         }

         cflist[numOfConicalFrustum - 1] = null;
         numOfConicalFrustum--;
         return cfReturn;
      }
      else {
         return null;
      }
   }

   /**
    * @param labelIn takes string as label.
    * @param r1In takes double as radius 1.
    * @param r2In takes double as radius 2.
    * @param htIn takes double as height.
    * @return return result.
    */
   public boolean editConicalFrustum(String labelIn, double r1In,
                                     double r2In, double htIn)  {
      boolean result = false;
      if (findConicalFrustum(labelIn) != null) {
         findConicalFrustum(labelIn).setRadius1(r1In);
         findConicalFrustum(labelIn).setRadius2(r2In);
         findConicalFrustum(labelIn).setHeight(htIn);
         result = true;
      }

      return result;
   }

   // NEW METHODS FOR HW8 //
   /**
    * @return return object.
    */
   public ConicalFrustum findConicalFrustumWithLeastHeight()  {
      if (numOfConicalFrustum > 0) {
         int indexOfMinH = 0;
         int index = 0;
         while (index < numOfConicalFrustum) {
            if (cflist[index].getHeight() < cflist[indexOfMinH].getHeight())  {
               indexOfMinH = index;
            }
            index++;
         }
         return cflist[indexOfMinH];
      }
      else {
         return null;
      }
   }

   /**
    * @return return object.
    */
   public ConicalFrustum findConicalFrustumWithGreatestHeight()  {
      if (numOfConicalFrustum > 0) {
         int indexOfMaxH = 0;
         int index = 0;
         while (index < numOfConicalFrustum) {
            if (cflist[index].getHeight() > cflist[indexOfMaxH].getHeight())  {
               indexOfMaxH = index;
            }
            index++;
         }
         return cflist[indexOfMaxH];
      }
      else {
         return null;
      }
   }

   /**
    * @return return object.
    */
   public ConicalFrustum findConicalFrustumWithLeastVolume()  {
      if (numOfConicalFrustum > 0) {
         int indexOfMinV = 0;
         int index = 0;
         while (index < numOfConicalFrustum) {
            if (cflist[index].volume() < cflist[indexOfMinV].volume())  {
               indexOfMinV = index;
            }
            index++;
         }
         return cflist[indexOfMinV];
      }
      else {
         return null;
      }
   }

   /**
    * @return return object.
    */
   public ConicalFrustum findConicalFrustumWithGreatestVolume()  {
      if (numOfConicalFrustum > 0) {
         int indexOfMaxV = 0;
         int index = 0;
         while (index < numOfConicalFrustum) {
            if (cflist[index].volume() > cflist[indexOfMaxV].volume())  {
               indexOfMaxV = index;
            }
            index++;
         }
         return cflist[indexOfMaxV];
      }
      else {
         return null;
      }
   }


}
