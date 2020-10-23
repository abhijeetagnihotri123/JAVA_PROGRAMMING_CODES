class A
{
    int rollno;
    String sname;
    class B
    {
        public void show()
        {
            System.out.println("KIKI");
        }
    }
}
public class Inner_class {
    public static void main(String args[])
    {
        // B obj = new B()
        // {
        //     public void show()
        //     {
        //         System.out.println("Hello");
        //     }
        // };
        // obj.show();
        B obj = ()->
        {
            System.out.println("Hello");
        };
        obj.show();
    }
}
@FunctionalInterface
interface B
{
    public void show();
}
// class xyz implements B
// {
     
// }
