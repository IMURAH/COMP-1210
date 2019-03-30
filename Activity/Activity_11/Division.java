public class Division {

   public static int intDivide(int num, int deno)  {
      try{
         int result = num / deno;
         return result;
      }
      catch(ArithmeticException e)  {
         return 0;
      }
   }

   public static double decimalDivide(int num, int deno) {
      if (deno == 0)  {
         throw new IllegalArgumentException("The denominator "
                                            + "cannot be zero.");
      }
      double result = (double) num / (double) deno;
      return result;
   }

}
