public class COUNTINGOBJECTS {

    static int i;
    COUNTINGOBJECTS(Object ...a)
    {
        i++;
    }
    public static void main(String args[])
    {
        COUNTINGOBJECTS ob1 = new COUNTINGOBJECTS();
        COUNTINGOBJECTS ob2 = new COUNTINGOBJECTS(2);
        COUNTINGOBJECTS ob3 = new COUNTINGOBJECTS(1,2,3);
        COUNTINGOBJECTS ob4 = new COUNTINGOBJECTS(1,2.23,3.34,"HELLO");
        System.out.println(i);
    }
}
