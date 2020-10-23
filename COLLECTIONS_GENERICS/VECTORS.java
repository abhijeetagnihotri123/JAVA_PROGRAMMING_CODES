import java.util.Vector;
public class VECTORS {
    public static void main(String args[])
    {   
        Vector<Integer> v = new Vector<Integer>();
        v.add(4);
        v.add(7);
        v.add(4);
        v.add(7);
        v.add(4);
        v.add(7);
        v.add(4);
        v.add(7);
        v.add(4);
        v.add(7);
        v.add(4);
        v.add(7);
        for(int val : v)
        {
            System.out.println(val);
        }
    }
}
