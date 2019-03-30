/**
 * creates customer object.
 *
 * Activity 08
 * @author Le Cai LZC0033 COMP1210-005
 * @version 03/24/18
 */
public class Customer implements Comparable<Customer>  {

// instance variables
   private String name;
   private String locale;
   private double balance;

// constructor
/**
 * creates Customer obj.
 *
 * @param nameIn takes string store as name.
 */
   public Customer(String nameIn)  {
      name = nameIn;
      locale = "";
      balance = 0;
   }

// methods
  /**
   * @param locationIn takes string store as location.
   */
   public void setLocation(String locationIn)  {
      locale = locationIn;
   }
  /**
   * @param city take string store as city.
   * @param state take string store as state.
   */
   public void setLocation(String city, String state) {
      locale = city + ", " + state;
   }
  /**
   * @param amount take double store as balance.
   */
   public void changeBalance(double amount)  {
      balance += amount;
   }
  /**
   * @return return location.
   */
   public String getLocation() {
      return locale;
   }
  /**
   * @return return balance.
   */
   public double getBalance()  {
      return balance;
   }
  /**
   * @return return string output.
   */
   public String toString() {
      String output = name + "\n" + locale + "\n$" + balance;
      return output;
   }

  /**
   * @param obj takes a customer object to compare.
   * @return return a integer value to indicate compare result.
   */
   public int compareTo(Customer obj) {

      if (Math.abs(this.balance - obj.getBalance()) < 0.000001)  {
         return 0;
      }
      else if (this.balance < obj.getBalance())  {
         return -1;
      }
      else {
         return 1;
      }
   }


}
