import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Represents a list of Conical Frustrums.
 *
 * Homework 05
 * @author Le Cai LZC0033 COMP1210-005
 * @version 02/23/18
 */
public class ConicalFrustumList {

   //FIELDS//
   private String name = "";
   private ArrayList<ConicalFrustum> cflist;

   //CONSTRUCTOR//
   /**
    * Creates a Conical Frustum object.
    *
    * @param nameIn for list name
    * @param cflistIn for cflist
    */
   public ConicalFrustumList(String nameIn, ArrayList<ConicalFrustum> cflistIn)
   {
      name = nameIn;
      cflist = cflistIn;
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
      if (cflist.size() != 0) {
         return cflist.size();
      }
      else {
         return 0;
      }
   }
   /**
    * @return return total surface Area
    */
   //calculate total surface area
   public double totalSurfaceArea()  {
      double totalSA = 0;
      int index = 0;
      //check if arraylist is empty
      if (cflist.size() != 0)  {
         //does not equal to 0
         //using while to make sure it adds every data in ArrayList.
         while (index < cflist.size()) {
            //gets data on index and calculate totalSurfaceArea
            totalSA += cflist.get(index).totalSurfaceArea();
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
      if (cflist.size() != 0) {
         while (index < cflist.size()) {
            totalV += cflist.get(index).volume();
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
      if (cflist.size() != 0) {
         double avgSA = totalSurfaceArea() / cflist.size();
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
      if (cflist.size() != 0) {
         double avgV = totalVolume() / cflist.size();
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
      while (index < cflist.size()) {
         result += "\n" + cflist.get(index) + "\n";
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
      result += "\n";

      return result;
   }

   //NEW METHODS FOR PROJECT 6//
   /**
    * @return return arraylist.
    */
   public ArrayList<ConicalFrustum> getList()  {
      return cflist;
   }

   /**
    * @param fileNameIn takes a string to read file.
    * @throws FileNotFoundException required by Scanner for file.
    * @return return arraylist.
    */
   public ConicalFrustumList readFile(String fileNameIn)
                                      throws FileNotFoundException  {

      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<ConicalFrustum> cList = new ArrayList<ConicalFrustum>();
      String cfListName = scanFile.nextLine();

      while (scanFile.hasNext())  {
         String labelName = scanFile.nextLine();
         double r1 = Double.parseDouble(scanFile.nextLine());
         double r2 = Double.parseDouble(scanFile.nextLine());
         double ht = Double.parseDouble(scanFile.nextLine());

         ConicalFrustum obj = new ConicalFrustum(labelName, r1, r2, ht);
         cList.add(obj);
      }

      ConicalFrustumList cf = new ConicalFrustumList(cfListName, cList);
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

      cflist.add(cf);
   }

   /**
    * @param labelIn takes string as label.
    * @return return object or null.
    */
   public ConicalFrustum findConicalFrustum(String labelIn)  {

      int index = -1;
      for (ConicalFrustum cf : cflist) {
         if (cf.getLabel().equalsIgnoreCase(labelIn))  {
            index = cflist.indexOf(cf);
            break;
         }
      }
      if (index >= 0) {
         return cflist.get(index);
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
         ConicalFrustum cf = cflist.get(cflist.indexOf(
                                        findConicalFrustum(labelIn)));
         cflist.remove(cflist.indexOf(findConicalFrustum(labelIn)));
         return cf;
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
}
