import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BunnyList  {

   // Instance Variables
   private String listName;
   private Bunny[] bunnyList;
   private String[] excludedRecords;

   // Constructor
   public BunnyList()  {
      listName = "not yet assigned";
      bunnyList = new Bunny[0];
      excludedRecords = new String[0];
   }

   // Methods
   public void readBunnyFile(String fileNameIn) throws FileNotFoundException, NegativeValueException, NumberFormatException{
      String lineIn = "";
      Scanner scanFile = new Scanner(new File(fileNameIn));


      listName = scanFile.nextLine();
      try {
        while (scanFile.hasNext())  {
           lineIn = scanFile.nextLine();
           Scanner scanDetail = new Scanner(lineIn);
           scanDetail.useDelimiter(",");
           String type = scanDetail.next().trim();
           String name = scanDetail.next().trim();
           String breed = scanDetail.next().trim();
           double weight = Double.parseDouble(scanDetail.next().trim());

           char key = type.toLowerCase().charAt(0);

           switch (key)  {
              case 'p':
                 Bunny pb = new PetBunny(name, breed, weight);
                 addBunny(pb);
                 break;

              case 'h':
                 double wNT = Double.parseDouble(scanDetail.next().trim());
                 Bunny hb = new HouseBunny(name, breed, weight, wNT);
                 addBunny(hb);
                 break;

              case 'j':
                 double train = Double.parseDouble(scanDetail.next().trim());
                 Bunny jb = new JumpingBunny(name, breed, weight, train);
                 addBunny(jb);
                 break;

              case 's':
                 double groom = Double.parseDouble(scanDetail.next().trim());
                 Bunny sb = new ShowBunny(name, breed, weight, groom);
                 addBunny(sb);
                 break;

              default:
                 String lineIn2 = "Invalid Bunny Category in:\n";
                 addExcludedRecord(lineIn2);
                 addExcludedRecord(lineIn);
                 break;
           }
        }
      }
      catch(FileNotFoundException)

   }

   public String getListName() {
      return listName;
   }

   public void setListName(String listNameIn) {
      listName = listNameIn;
   }

   public Bunny[] getBunnyList() {
      return bunnyList;
   }

   public String[] getExcludedRecords()  {
      return excludedRecords;
   }

   public void addBunny(Bunny bunnyIn) {
      bunnyList = Arrays.copyOf(bunnyList, bunnyList.length + 1);
      bunnyList[bunnyList.length - 1] = bunnyIn;
   }

   public void addExcludedRecord(String recordIn)  {
      excludedRecords = Arrays.copyOf(excludedRecords, excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = recordIn;
   }

   public String toString()  {
      String output = null;
      for (int i = 0; i < bunnyList.length; i++)  {
         output += bunnyList[i] + "\n";
      }

      return output;
   }

   public double totalEstimatedMonthlyCost() {
      double cost = 0;
      for (int i = 0; i < bunnyList.length; i++)  {
         cost += bunnyList[i].estimatedMonthlyCost();
      }
      return cost;
   }

   public String summary() {
      double totalcost = totalEstimatedMonthlyCost();
      String output = "------------------------------";
      output += "\nSummary for Bunny Collection";
      output += "\n------------------------------";
      output += "\nNumber of Bunnies: " + bunnyList.length;
      output += "\nTotal Estimated Monthly Cost: " + totalcost;

      return output;
   }

   public String listByName()  {
      Arrays.sort(bunnyList);
      String output = "------------------------------";
      output += "\nBunnies by Name";
      output += "\n------------------------------";
      for (Bunny obj : bunnyList) {
         output += obj;
      }
      return output;
   }

   public String listByCost()  {
      Arrays.sort(bunnyList, new CostComparator());
      String output = "------------------------------";
      output += "\nBunnies by Cost";
      output += "\n------------------------------";
      for (Bunny obj : bunnyList) {
         output += obj;
      }
      return output;
   }

   public String excludedRecordsList() {
      String output = null;
      for (int i = 0; i < excludedRecords.length; i++)  {
         output += excludedRecords[i] + "\n";
      }
      return output;
   }

}
