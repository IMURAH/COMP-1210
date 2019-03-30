import java.util.ArrayList;
import java.text.DecimalFormat;

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
   private int emptyvalue = 0;

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
   public int numOfConicalFrustums()  {
      if (cflist.size() != 0) {
         return cflist.size();
      }
      else {
         return emptyvalue;
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
         return emptyvalue;
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
         return emptyvalue;
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
         return emptyvalue;
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
         return emptyvalue;
      }
   }
   /**
    * @return return string for list
    */
   public String toString()  {
      String result = "\n" + name + "\n";
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
      result += "\nNumber of ConicalFrustum Objects: " + numOfConicalFrustums();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());

      return result;
   }
}
