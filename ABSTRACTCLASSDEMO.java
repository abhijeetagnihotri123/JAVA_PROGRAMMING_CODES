public class ABSTRACTCLASSDEMO {
    public static void main(String args[])
    {
        //Mahesh ob = new Mahesh();// cannot instantiate object of an abstract class
        Mahesh ob = new Suresh();
        ob.call();
        ob.dance();
        ob.cook();
        ob.move();
    }
}

abstract class Mahesh
{
    public void call()
    {
         System.out.println("Calling ...");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}
abstract class Ramesh extends Mahesh
{
    public void move()
    {
        System.out.println("Moving ...");
    }
}
class Suresh extends Ramesh // concrete class
{
    public void dance()
    {
        System.out.println("Dancing ...");
    }
    public void cook()
    {
        System.out.println("Cooking ...");
    }
}
