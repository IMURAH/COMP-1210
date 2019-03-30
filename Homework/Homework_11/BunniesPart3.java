import java.io.FileNotFoundException;
/**
 * Main method for BunniesPart3.
 *
 * Project 11
 * @author Le Cai LZC0033 COMP-1210-005
 * @version 04/18/18
 */
public class BunniesPart3 {

   public static void main(String[] args) throws NegativeValueException {
   
      if (args.length == 0) {
         System.out.println("*** File name not provided by command line argument.");
         System.out.println("Program ending.");
      }
      else {
         try{
            BunnyList obj = new BunnyList();
            obj.readBunnyFile(args[0]);
         
            System.out.println(obj.summary());
            System.out.println(obj.listByName());
            System.out.println(obj.listByCost());
            System.out.println(obj.excludedRecordsList());
         }
         catch(FileNotFoundException e)  {
            System.out.println("*** File not found.");
            System.out.println("Program ending.");
         }
      }
   }
}
