import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * tests BankLoan.java.
 *
 * Activity 08
 * @author Le Cai LZC0033 COMP1210-005
 * @version 03/19/18
 */
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test method for chargeInterest. **/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}
