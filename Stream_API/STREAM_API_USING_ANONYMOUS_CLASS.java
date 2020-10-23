import java.util.*;
import java.util.function.Consumer;
public class STREAM_API_USING_ANONYMOUS_CLASS {
    public static void main(String args[]) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        for(int i=1;i<=20;i++)
        {
            ob.add(i);
        }
        Consumer<Integer> c = new Consumer<Integer>(){
            public void accept(Integer i)
            {
                System.out.println(i);
            }   
        };
        ob.forEach(c);
    }
}
