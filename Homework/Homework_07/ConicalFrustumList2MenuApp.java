import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * creates a driver with menu.
 *
 * Homework 07
 * @author Le Cai LZC0033 COMP1210-005
 * @version 03/07/18
 */
public class ConicalFrustumList2MenuApp  {
/**
 * prints a menu and display selected info.
 *
 * @param args - not used.
 * @throws FileNotFoundException required by Scanner for file.
 */
   public static void main(String[] args) throws FileNotFoundException {

      String fileName = "no file name";
      String listName = "no list name";
      ConicalFrustum[] cfList = new ConicalFrustum[20];
      ConicalFrustumList2 myList = new ConicalFrustumList2(listName, cfList, 0);
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

               myList = myList.readFile(fileName);

               System.out.println("\tFile read in and "
                                  + "ConicalFrustum List created\n");

               break;

            case 'P':
               System.out.println("\n" + myList);
               break;

            case 'S':
               System.out.println("\n" + myList.summaryInfo() + "\n");
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

               myList.addConicalFrustum(label, r1, r2, ht);
               System.out.println("\t*** ConicalFrustum added ***\n");
               break;

            case 'D':
               System.out.print("\tLabel: ");
               String labelIn = scan.nextLine();
               ConicalFrustum obj = myList.findConicalFrustum(labelIn);
               if (myList.deleteConicalFrustum(labelIn) != null) {
                  System.out.println("\t\"" + obj.getLabel() + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;

            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();

               if (myList.findConicalFrustum(label) != null) {
                  System.out.println(myList.findConicalFrustum(label) + "\n");
               }
               else {
                  System.out.print("\t\"" + label + "\" not found\n\n");
               }
               break;

            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius1: ");
               r1 = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius2: ");
               r2 = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               ht = Double.parseDouble(scan.nextLine());

               if (myList.findConicalFrustum(label) == null)  {
                  System.out.println("\t\"" + label
                                      + "\" not found" + "\n");
               }
               else {
                  myList.editConicalFrustum(label, r1, r2, ht);
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
