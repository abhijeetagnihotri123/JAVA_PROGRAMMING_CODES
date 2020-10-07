class add
{
    int num1,num2,result;
    public void add()
    {
        result = num1+num2;
    }
}
class addsub extends add // single level inheritance
{
    public void sub()
    {
        result = num1-num2;
    }
}
class addsubmul extends addsub // multilevel inheritance multiple inheritance not supported in JAVA but in c++
{
    public void mul()
    {
        result = num1 * num2;
    }
}
public class INHERITANCE {

    public static void main(String args[])
    {
        addsubmul ob = new addsubmul();
        ob.num1 = 132;
        ob.num2 = 101;
        ob.add();
        System.out.println(ob.result);
        ob.sub();
        System.out.println(ob.result);
        ob.mul();
        System.out.println(ob.result);
    }
}

