import java.util.*;
public class test_1 {
   public static void main(String args[])
   {
       ArrayList<Integer> ob = new ArrayList<Integer>();
       for(int i=1;i<=10;i++)
       {
           ob.add(i);
       }
       ob.forEach(i->System.out.println(i));
   } 
}
