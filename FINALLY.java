import java.util.*;
public class FINALLY {
    public static void main(String args[]) {
        int i=4;
        int j;
        int k;
        Scanner ob = new Scanner(System.in);
        j = ob.nextInt();
        try {
           k = i/j; 
           System.out.println(k+" No exception");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally
        {

            System.out.println("In finally block Bye!");
            ob.close();
        }
    }
}
