import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class insertion_at_ith_position {
    public static void main(String args[])
    {
        List<Integer> values = new ArrayList<Integer>();
        values.add(3);
        values.add(99);
        values.add(77);
        values.add(2);
        values.add(88);
        int x = values.get(3);
        System.out.println(x);
        Collections.sort(values);
        Iterator i = values.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
