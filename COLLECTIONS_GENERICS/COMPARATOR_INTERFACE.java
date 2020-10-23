import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class C implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1,Integer o2)
    {
        return o1%10>=o2%10?1:-1;
    }
}
public class COMPARATOR_INTERFACE {
    public static void main(String args[])
    {
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(101);
        values.add(109);
        values.add(107);
        values.add(105);
        values.add(102);
        //1st method
        //Comparator<Integer> com = new C();
        //2nd method
        // Comparator<Integer> com = new Comparator<Integer>(){
        //     @Override
        //     public int compare(Integer o1,Integer o2)
        //     {
        //         return o1%10>=o2%10?1:-1;
        //     }
        // };
        //3rd method
        Comparator<Integer> com = (o1,o2)->
        {
            return o1%10>=o2%10?1:-1;
        };
        Collections.sort(values,com);
        for(int i : values)
        {
            System.out.println(i);
        }
    }
}
