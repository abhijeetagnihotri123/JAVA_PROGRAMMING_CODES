class A
{
    public A()
    {   
        super();
        System.out.println("In contructor A");
    }
    public A(int i)
    {
        //super(i);
        System.out.println("In parametized constructor A "+i);
    }
}
class B extends A
{   
    int j;
    public B()
    {
        super();
        System.out.println("In constructor B");
    }
    public B(int i,int j)
    {
        super(i);
        this.j = j;
        System.out.println("In parameterized constructor B "+j);
    }
}
public class SUPERKEYWORD {
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(5,6);//int j);
    }
}
