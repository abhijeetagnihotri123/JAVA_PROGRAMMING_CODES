public class Exception_Handling {
    public static void main(String args[])
    {
         int i,j,k;
         i = 8;
         j = 0;
         k = 0;
         try
         {
            k = i/j;
         }
         catch(ArithmeticException e)
         {
             System.out.println(e + " In catch statement");
         }
         System.out.println(k);
    }
}
