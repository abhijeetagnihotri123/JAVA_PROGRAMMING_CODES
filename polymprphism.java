class A
{
    public void show()
    {
        System.out.println("Hello From A");
    }
}

class B extends A
{   
    public void show() // method overwriting
    {
        System.out.println("Hello From B");
    }
    public void show(int i) // Method overloading early binding
    {
        System.out.println("Hello From B"+" "+i);
    }
}
public class polymprphism {
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
    }
}
