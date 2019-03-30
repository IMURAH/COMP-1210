import java.io.FileNotFoundException;
/**
 * Driver class for bunnyList.
 *
 * Project 10
 * @author Le Cai LZC0033 COMP1210-005
 * @version 04/16/18
 */
public class BunniesPart2 {
  /**
   * creates bunnyList, readBunnyFile and prints the array.
   *
   * @param args bunnies1.txt
   * @throws FileNotFoundException throws file not found exception.
   */
   public static void main(String[] args) throws FileNotFoundException  {

      BunnyList obj = new BunnyList();
      obj.readBunnyFile(args[0]);

      System.out.println(obj.summary());
      System.out.println(obj.listByName());
      System.out.println(obj.listByCost());
      System.out.println(obj.excludedRecordsList());
   }
}
