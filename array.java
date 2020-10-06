import java.util.Random;

public class array {
    public static void main(String args[])
    {
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[4] = 5;
        a[3] = 4;
        for(int x : a) // enhanced for loop
        {
            System.out.println(x+" "+a);
        }
        int randoms[] = new int[20];
        Random r = new Random();
        for(int i=0;i<20;i++)
        {
            randoms[i] = r.nextInt(50);
        }
        for(int x : randoms)
        {
            System.out.println(x);
        }
        //2d arrays
        int p[][] = {
                        {5,6,7,8},
                        {6,7,8,9},
                        {8,9,7,6},
                    };
        // for(int i=0;i<p.length;i++)
        // {
        //     for(int j=0;j<p[i].length;j++)
        //     {
        //         System.out.print(p[i][j]+" ");
        //     }
        //     System.out.println(" ");
        // }
        for(int x[] : p)
        {
            for(int j : x)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
