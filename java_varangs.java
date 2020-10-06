public class java_varangs {
    public static void show(int ...a)
    {
        for(int x : a)
        {
            System.out.println(x);
        }
    }
    public static void main(String args[])
    {
        show(1,2,3,4,5);
    }
}
