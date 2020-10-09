public class thread_lambda_expressions {
    public static void main(String args[])throws Exception
    {   
        //1.
            // Runnable ob1 = ()->
            // {
                
            //         for(int i=1;i<=5;i++)
            //         {
            //             System.out.println("HI");
            //         }
                
            // };
            // Runnable ob2 = ()->
            // {
                
            //         for(int i=1;i<=5;i++)
            //         {
            //             System.out.println("HELLO");
            //         }
                
            // };
        
        // ==========================================    

        // Runnable ob1 = new Runnable()
        // {
        //     public void run()
        //     {
        //         for(int i=0;i<5;i++)
        //         {
        //             System.out.println("HI");
        //             try{Thread.sleep(1000);}catch(Exception e){}
        //         }
        //     }
        // };
        // Runnable ob2 = new Runnable()
        // {
        //     public void run()
        //     {
        //         for(int i=0;i<5;i++)
        //         {
        //             System.out.println("HELLO");
        //             try{Thread.sleep(1000);}catch(Exception e){}
        //         }
        //     }
        // };
        // Final approach
        Thread t1 = new Thread(()->
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("HI");
                try{Thread.sleep(1000);}catch(Exception e){}
            }
        });
        Thread t2 = new Thread(()->
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("HELLO");
                try{Thread.sleep(1000);}catch(Exception e){}
            }
        });
        System.out.println(t1.isAlive() + " " + t1.getName() + t1.getPriority());
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("All Threads are over "+t1.isAlive()); 
    }
}
