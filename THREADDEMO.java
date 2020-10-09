class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("HI");
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("HELLO");
        }
    }
}
public class THREADDEMO {
    
    public static void main(String args[])
    {
        Runnable ob1 = new A();
        Runnable ob2 = new B();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();
    }
}
