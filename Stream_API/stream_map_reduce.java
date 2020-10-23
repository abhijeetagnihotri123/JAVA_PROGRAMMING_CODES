import java.util.ArrayList;

public class stream_map_reduce {
    public static void main(String args[])
    {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        for(int i=1;i<=20;i++)
        {
            ob.add(i);
        }
        System.out.println(ob.stream().map(i->i*2).reduce(0,(c,e)->c+e));
    }
}
