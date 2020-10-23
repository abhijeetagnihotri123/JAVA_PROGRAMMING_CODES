import java.util.ArrayList;
import java.util.List;

import org.graalvm.compiler.java.GraphBuilderPhase.Instance;

class test
{
    int i;
    int j;
    test()
    {
        this.i = 5;
        this.j = 6;
    }
    public void Show()
    {
        System.out.println(this.i+" "+this.j);
    }
}
class Container<T>
{
    T value;
    public void show()
    {
        System.out.println("In here "+value.getClass().getName());
    }
}
public class Generics {
    public static void main(String args[])
    {
        Container<test>obj = new Container();
        test ob = new test();
        obj.value = ob;
        obj.show();
    }
}
