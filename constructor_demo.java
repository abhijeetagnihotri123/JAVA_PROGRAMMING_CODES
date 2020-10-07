public class constructor_demo {
    int i,j,k;
    public constructor_demo()
    {
        i = j = k = 0;
        System.out.println("Default Constructor");
    }
    public constructor_demo(int i,int j,int k)
    {
        this.i = i;
        this.j = j;
        this.k = k;
        System.out.println("Parameterized Constructor");
    }
    public static void main(String args[])
    {
        constructor_demo CD = new constructor_demo();
        constructor_demo CD1 = new constructor_demo(1,2,3);

    }
}
