interface ABC
{
    void show();
    void compute();
}
interface DEF
{
    void CLICK();
    void DISPLAY();
}
public class INTERFACETEST implements ABC,DEF {
    
    public void show()
    {
        System.out.println("Showing ...");
    }
    public void compute()
    {
        System.out.println("Computing ...");
    }
    public void CLICK()
    {
        System.out.println("CLICKING ...");
    }
    public void DISPLAY()
    {
        System.out.println("DISPLAYING ...");
    }
    public static void main(String args[])
    {
        INTERFACETEST ob = new INTERFACETEST();
        ob.show();
        ob.compute();
        ob.CLICK();
        ob.DISPLAY();
    }
}
