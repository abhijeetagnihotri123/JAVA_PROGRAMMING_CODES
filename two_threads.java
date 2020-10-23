class count
{
    int c;
    count()
    {
        this.c = 0;
    }
    public synchronized void add()
    {
        c++;
    }
}
public class two_threads {
    public static void main(String args[])throws Exception
    {
        count c = new count();
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<=1000;i++)
                {
                    c.add();
                }
            } 
        });
        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<=1000;i++)
                {
                    c.add();
                }
            } 
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.c);
    }
}
