interface ABC
{
    void show();
}
public class FUNCTIONAL_INTERFACE {
    public static void main(String args[])
    {   
        ABC obj1 = new ABC()
        {
            public void show()
            {
                System.out.println("in SHOW");
            }
        };
        obj1.show();
        ABC obj = ()->
        {
            System.out.println("IN INTERFACE ABC");
        };
        obj.show();
    }
}
