import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * uses ConicalFrustumList and ConicalFrustumListApp.
 *
 * Homework 05
 * @author Le Cai LZC0033 COMP1210-005
 * @version 02/23/18
 */
public class ConicalFrustumListApp  {

/**
 * Reads a file and prints a summary of ConicalFrustum.
 *
 * @param args - not used.
 * @throws FileNotFoundException required by Scanner for File
 */
   public static void main(String[] args) throws FileNotFoundException {

      ArrayList<ConicalFrustum> list = new ArrayList<ConicalFrustum>();

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();

      Scanner scanFile = new Scanner(new File(fileName));

      String cfListName = scanFile.nextLine();

      while (scanFile.hasNext())  {
         String labelName = scanFile.nextLine();
         double r1 = Double.parseDouble(scanFile.nextLine());
         double r2 = Double.parseDouble(scanFile.nextLine());
         double ht = Double.parseDouble(scanFile.nextLine());

         ConicalFrustum obj = new ConicalFrustum(labelName, r1, r2, ht);
         list.add(obj);
      }
      scanFile.close();

      ConicalFrustumList cfList = new ConicalFrustumList(cfListName, list);

      System.out.println(cfList);

      System.out.println(cfList.summaryInfo());
   }
}
