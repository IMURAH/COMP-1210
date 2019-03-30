import java.util.Scanner;
import java.util.ArrayList;

/**
 * uses temperatures class to show info user wanted.
 *
 * Activity 06
 * @author Le Cai LZC0033 COMP1210-005
 * @version 02/26/18
 */
public class TemperatureInfo  {
  /**
   * scans user input stoer in arraylist then process.
   *
   * @param args - not used.
   */
   public static void main(String[] args)  {

      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      Scanner userInput = new Scanner(System.in);

      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals(""))  {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));

      Temperatures temps = new Temperatures(tempsList);

      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp,"
                         + " [H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;

            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;

            case 'P':
               System.out.println(temps);
               break;

            case 'E':
               System.out.println("\tDone");
               break;

            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}
