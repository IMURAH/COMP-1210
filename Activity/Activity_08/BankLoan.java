/**
 * calculates loan amounts for bank accounts.
 *
 * Activity 08
 * @author Le Cai LZC0033 COMP1210-005
 * @version 03/19/18
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

/**
 * @param amount asks a double to set as amount.
 * @return return true if amount is valid.
 */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }

/**
 * @param loan takes bankloan obj.
 * @return return true if account has loan.
 */
   public static boolean isInDebt(BankLoan loan)  {

      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }

/**
 * @return return int loansCreated.
 */
   public static int getLoansCreated()  {
      return loansCreated;
   }

/**
 * reset int loansCreated.
 */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

   // instance variables (can be used within the class)
   private static int loansCreated = 0;
   private String customerName;
   private double balance, interestRate;

/**
 * creates bankloan object.
 *
 * @param customerNameIn takes string as customerName.
 * @param interestRateIn take double as interestRate.
 */
   public BankLoan(String customerNameIn, double interestRateIn) {
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

/**
 * @param amount takes double as amount borrowed from bank.
 * @return return boolean shows was loan made.
 */
   public boolean borrowFromBank(double amount) {

      boolean wasLoanMade = false;

      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }

      return wasLoanMade;
   }

/**
 * @param amountPaid takes double that represents amount payed back to bank.
 * @return returns overcharge.
 */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }

/**
 * @return return balance of obj.
 */
   public double getBalance() {
      return balance;
   }

/**
 * @param interestRateIn take double set as interestRate.
 * @return return boolean value for setting interestRate.
 */
   public boolean setInterestRate(double interestRateIn) {

      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }

/**
 * @return return interestRate.
 */
   public double getInterestRate() {
      return interestRate;
   }

/**
 * charges interest.
 */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }

/**
 * @return returns string output.
 */
   public String toString() {
      String output = "Name: " + customerName + "\r\n"
         + "Interest rate: " + interestRate + "%\r\n"
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
