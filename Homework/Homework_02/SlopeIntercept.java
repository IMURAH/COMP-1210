import java.util.Scanner;
/**
 * A program that calculates slope and intercepts of x and y.
 * 
 * Homework 02
 * @author Le Cai COMP1210-005
 * @version 1/20/18
 */
public class SlopeIntercept {
/**
 * takes input of x and y coordinates to calculate.
 * slope; x intercept and y intercept.
 * @param args Comand line arguments - not used.
 */
   public static void main(String[] args)	{
   	
      Scanner userInput = new Scanner(System.in);
   	
   	//defining constants
      double x1 = 0;
      double x2 = 0;
      double y1 = 0;
      double y2 = 0;
      double slope = 0;
      double xInt = 0;
      double yInt = 0;
   	
   	//Prompt the user to enter x1 and y1
      System.out.println("Enter the X and Y coordinates of starting point:");
      System.out.print("\tx1 = ");
      x1 = userInput.nextDouble();
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();
   	
   	//Prompt the user to enter x2 and y2
      System.out.println("Enter the X and Y coordinates of ending point: ");
      System.out.print("\tx2 = ");
      x2 = userInput.nextDouble();
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
   	
      if	(x1 == x2)	{
      	//check if slope is undefined
         System.out.print("Slope: \"undefined\"");
      }	else	{
      //slope is not undefined, then
      //calculate slope 
         slope = (y2 - y1) / (x2 - x1);
      //calculate y intercept
         yInt = y1 - slope * x1;
      //calculate x intercept
         xInt = -1 * (yInt / slope);
      
      //Printing slope and x and y intercept
         if (y1 != y2)	{
         //print when x intercept is not undefined
            System.out.println("Slope: " + slope);
            System.out.println("Y intercept: " + yInt);
            System.out.println("X intercept: " + xInt);
         }	else	{
         //print when y intercept is not undefined
            System.out.println("Slope: " + slope);
            System.out.println("Y intercept: " + yInt);
            System.out.println("X intercept: \"undefined\"");
         }		
      }
   }
}
