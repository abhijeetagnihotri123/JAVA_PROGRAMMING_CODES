import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//iterator 
//Enhanced forloop
public class DEMOCLASS {
    public static void main(String args[]) throws Exception {
        Collection values = new ArrayList<>();
        values.add(3);
        values.add("Navin");
        values.add(5.67);
        // Iterator i = values.iterator();
        // while(i.hasNext())
        // {
        //     System.out.println(i.next());
        // }
        for(Object i : values)
        {
            System.out.println(i);
        }
    }
}
