/**
 * A class that contains method.
 *
 * Activity 04
 * @author Le Cai COMP 1210-005
 * @version 02/04/18
 */
public class UserInfo {
	// instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

   // constructor
/**
 * just a class with methods for a driver class.
 *
 * @param firstNameIn takes a string save as firstName
 * @param lastNameIn takes a string save as lastName
 */
   public UserInfo(String firstNameIn, String lastNameIn)	{
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }

   // methods
/**
 * prints out name location age and stats.
 *
 * @return returns output for priinting
 */
   public String toString()   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)   {
         output += "Offline";
      }
      else {
         output += "Online";
      }

      return output;
   }

   //set location
 /**
  * takes a string and store as location for future use.
  *
  * @param locationIn takes a string asves as location
  */
   public void setLocation(String locationIn)   {
      location = locationIn;
   }

   //set age
 /**
  * takes a integer and store as age for future use.
  * also automatically changes set status for age.
  *
  * @param ageIn takes a integer saves as Age
  * @return return a boolean value
  */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0)  {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
/**
 * returns age.
 *
 * @return returns age
 */
   public int getAge()  {
      return age;
   }
/**
 * returns location as String.
 *
 * @return returns location 
 */
   public String getLocation()   {
      return location;
   }
/**
 * by invoking logOff, changes satus to OFFLINE.
 */
   public void logOff() {
      status = OFFLINE;
   }
/**
 * by invoking logOn, changes status to ONLINE.
 */
   public void logOn()  {
      status = ONLINE;
   }
}
