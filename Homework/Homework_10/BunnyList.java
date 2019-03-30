import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

/**
 * reads a file and creates bunny list.
 *
 * Project 10
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/16/18
 */
public class BunnyList  {

   // Instance Variables
   private String listName;
   private Bunny[] bunnyList;
   private String[] excludedRecords;

   // Constructor
   /**
    * Constructor for BunnyList.
    */
   public BunnyList()  {
      listName = "not yet assigned";
      bunnyList = new Bunny[0];
      excludedRecords = new String[0];
   }

   // Methods
   /**
    * @param fileNameIn take string as filename for read
    * @throws FileNotFoundException throws file not found exception.
    */
   public void readBunnyFile(String fileNameIn) throws FileNotFoundException {
      String lineIn = "";
      Scanner scanFile = new Scanner(new File(fileNameIn));


      listName = scanFile.nextLine();
      while (scanFile.hasNext())  {
         lineIn = scanFile.nextLine();
         Scanner scanDetail = new Scanner(lineIn);
         scanDetail.useDelimiter(",");
         String type = scanDetail.next().trim();
         String name = scanDetail.next().trim();
         String breed = scanDetail.next().trim();
         double weight = Double.parseDouble(scanDetail.next().trim());

         String key = type.substring(0, 1).toUpperCase();

         switch (key)  {
            case "P":
               Bunny pb = new PetBunny(name, breed, weight);
               addBunny(pb);
               break;

            case "H":
               double wNT = Double.parseDouble(scanDetail.next().trim());
               Bunny hb = new HouseBunny(name, breed, weight, wNT);
               addBunny(hb);
               break;

            case "J":
               double train = Double.parseDouble(scanDetail.next().trim());
               Bunny jb = new JumpingBunny(name, breed, weight, train);
               addBunny(jb);
               break;

            case "S":
               double groom = Double.parseDouble(scanDetail.next().trim());
               Bunny sb = new ShowBunny(name, breed, weight, groom);
               addBunny(sb);
               break;

            default:
               addExcludedRecord(lineIn);
               break;
         }
      }
   }

   /**
    * @return return a string as list name.
    */
   public String getListName() {
      return listName;
   }

   /**
    * @param listNameIn take a string as list name.
    */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }

   /**
    * @return return bunnyList.
    */
   public Bunny[] getBunnyList() {
      return bunnyList;
   }

   /**
    * @return return excludedRecords.
    */
   public String[] getExcludedRecords()  {
      return excludedRecords;
   }

   /**
    * @param bunnyIn add bunny in.
    */
   public void addBunny(Bunny bunnyIn) {
      bunnyList = Arrays.copyOf(bunnyList, bunnyList.length + 1);
      bunnyList[bunnyList.length - 1] = bunnyIn;
   }

   /**
    * @param recordIn add record.
    */
   public void addExcludedRecord(String recordIn)  {
      excludedRecords = Arrays.copyOf(excludedRecords,
                                        excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = recordIn;
   }

   /**
    * @return return toString.
    */
   public String toString()  {
      String output = "";
      for (int i = 0; i < bunnyList.length; i++)  {
         output += "\n" + bunnyList[i] + "\n";
      }

      return output;
   }

   /**
    * @return return double as totalEstimatedMonthlyCost.
    */
   public double totalEstimatedMonthlyCost() {
      double cost = 0;
      for (int i = 0; i < bunnyList.length; i++)  {
         cost += bunnyList[i].estimatedMonthlyCost();
      }
      return cost;
   }

   /**
    * @return return string as output.
    */
   public String summary() {
      double totalcost = totalEstimatedMonthlyCost();
      String pattern = "#,##0.00";
      DecimalFormat df = new DecimalFormat(pattern);
      String output = "------------------------------";
      output += "\nSummary for " + getListName();
      output += "\n------------------------------";
      output += "\nNumber of Bunnies: " + bunnyList.length;
      output += "\nTotal Estimated Monthly Cost: $"
                          + df.format(totalcost) + "\n\n";

      return output;
   }

   /**
    * @return string as list by name.
    */
   public String listByName()  {
      Arrays.sort(bunnyList);
      String output = "------------------------------";
      output += "\nBunnies by Name";
      output += "\n------------------------------\n";
      output += toString() + "\n";
      return output;
   }

   /**
    * @return String as list by cost.
    */
   public String listByCost()  {
      Arrays.sort(bunnyList, new CostComparator());
      String output = "------------------------------";
      output += "\nBunnies by Cost";
      output += "\n------------------------------\n";
      for (Bunny obj : bunnyList) {
         output += "\n" + obj + "\n";
      }
      return output;
   }

   /**
    * @return string as excludedRecordsList.
    */
   public String excludedRecordsList() {
      String output = "------------------------------";
      output += "\nExcluded Records";
      output += "\n------------------------------\n";
      for (int i = 0; i < excludedRecords.length; i++)  {
         output += "\n" + excludedRecords[i] + "\n";
      }
      return output;
   }

}
