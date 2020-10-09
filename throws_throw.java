public class throws_throw {
    public static void main(String args[])// throws ArithmeticException Error suppressor
    {
        int i = 10;
        int j= 0;
        try
        {
            int k = i+j;
            if(k<13)
            {
                throw new ArithmeticException();
            }
        } 
        catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            finally
            {

            }
    }
}
