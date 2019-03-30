import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * creates a driver with menu.
 *
 * Homework 06
 * @author Le Cai LZC0033 COMP1210-005
 * @version 03/02/18
 */
public class ConicalFrustumListMenuApp  {
/**
 * prints a menu and display selected info.
 *
 * @param args - not used.
 * @throws FileNotFoundException required by Scanner for file.
 */
   public static void main(String[] args) throws FileNotFoundException {

      String fileName = "no file name";
      String listName = "no list name";
      ArrayList<ConicalFrustum> myList = new ArrayList<ConicalFrustum>();
      ConicalFrustumList cfList = new ConicalFrustumList(listName, myList);
      String code = "";
      String label = "";
      double r1, r2, ht;

      Scanner scan = new Scanner(System.in);

      System.out.println("ConicalFrustum List System Menu\n"
                         + "R - Read File and Create ConicalFrustum List\n"
                         + "P - Print ConicalFrustum List\n"
                         + "S - Print Summary\n"
                         + "A - Add ConicalFrustum\n"
                         + "D - Delete ConicalFrustum\n"
                         + "F - Find ConicalFrustum\n"
                         + "E - Edit ConicalFrustum\n"
                         + "Q - Quit");

      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0)  {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);

         switch(codeChar)  {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();

               cfList = cfList.readFile(fileName);

               System.out.println("\tFile read in and "
                                  + "ConicalFrustum List created\n");

               break;

            case 'P':
               System.out.println("\n" + cfList);
               break;

            case 'S':
               System.out.println("\n" + cfList.summaryInfo() + "\n");
               break;

            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius1: ");
               r1 = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius2: ");
               r2 = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               ht = Double.parseDouble(scan.nextLine());

               cfList.addConicalFrustum(label, r1, r2, ht);
               System.out.println("\t*** ConicalFrustum added ***\n");
               break;

            case 'D':
               System.out.print("\tLabel: ");
               String labelIn = scan.nextLine();
               ConicalFrustum obj = cfList.findConicalFrustum(labelIn);
               if (cfList.deleteConicalFrustum(labelIn) != null) {
                  System.out.println("\t\"" + obj.getLabel() + "\" deleted");
               }
               else {
                  System.out.println("\t\"" + obj.getLabel() + "\" not found");
               }
               break;

            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();

               if (cfList.findConicalFrustum(label) != null) {
                  System.out.println(cfList.findConicalFrustum(label) + "\n");
               }
               else {
                  System.out.print("\t\"" + label + "\" not found");
               }
               break;

            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (cfList.findConicalFrustum(label) == null)  {
                  System.out.println("\t\"" + label + "\" not found" + "\n");
               }
               else {
                  System.out.print("\tRadius1: ");
                  r1 = Double.parseDouble(scan.nextLine());
                  System.out.print("\tRadius2: ");
                  r2 = Double.parseDouble(scan.nextLine());
                  System.out.print("\tHeight: ");
                  ht = Double.parseDouble(scan.nextLine());

                  cfList.editConicalFrustum(label, r1, r2, ht);
                  System.out.println("\t\"" + label
                                      + "\" successfully edited\n");
               }
               break;

            case 'Q':
               break;

            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }

      } while (!code.equalsIgnoreCase("Q"));

   }
}
