import java.util.Scanner;
/**
 * A program that takes age and gender of user to calculate max heart rate.
 *
 * Activity 02
 * @author Le Cai COMP1210-005
 * @version 1/20/18
 */
public class AgeStatistics  {
 /**
  * takes input of name, age and gender to calculate 
  * and print how how he lived in minutes and centuries,
  * also uses a formula to calculate and display max heart rate for user.
  * @param args Comand line arguments - not used.
  */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age:
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries.");
      
      //calculate max heart rate
      if (gender == 1)  {
      //calculate female HR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else  {
      //calculate male HR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      
      //display max heart rate
      System.out.print("Your max heart rate is ");
      System.out.println(maxHeartRate + " beats per minute.");
      
      
   }
   
}