import java.util.Scanner;
/**
 * A program to calculate amount and divide it into several amounts.
 * 
 * Homework 02
 * @author Le Cai COMP1210-005
 * @version 1/20/18
 */
public class ATM {
/**
 * takes a number that is less than 301.
 ¡Á and divide it into 20 10 5 and 1 notions and print out the result
 * @param args Comand line arguments - not used.
 */
   public static void main(String[] args)	{
   	
   	//defining constants
      Scanner userInput = new Scanner(System.in);
      int origin = 0;
      int amount = 0;
      int div20 = 0;
      int div10 = 0;
      int div5 = 0;
      int div1 = 0;
   	
   	//Prompt the user for the amount they wish to withdraw:
      System.out.print("Enter the amount: ");
      amount = userInput.nextInt();
   	
   	//save origin value for later
      origin = amount;
   	
   	//Start a if loop to make sure amount does not exceed limit
      if	(amount > 300)	{
      	//limit exceeded, print the message
         System.out.print("Limit of $300 exceeded!");
      }	else	{
      	//limit not exceeded, continue to calculation
         div20 = amount / 20;
         amount = amount - div20 * 20;
         div10 = amount / 10;
         amount = amount - div10 * 10;
         div5 = amount / 5;
         amount = amount - div5 * 5;
         div1 = amount;
      	//print out bills by denomination and final add up
         System.out.println("Bills by denomination: ");
         System.out.println("\t$20: " + div20);
         System.out.println("\t$10: " + div10);
         System.out.println("\t$5: " + div5);
         System.out.println("\t$1: " + div1);
         System.out.println("$" + origin + " = " + "(" + div20 + " * $20) " 
            + "+ (" + div10 + " * $10) " + "+ (" + div5 
            + " * $5) " + "+ (" + div1 + " * $1) ");
      	
      }
   }
}
