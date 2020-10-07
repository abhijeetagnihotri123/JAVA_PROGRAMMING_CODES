public class test {
    public void abc(int n)
    {
        while(true == (false || true))
        {
            n++;
            break;
        }
    }
    public static void main(String args[])
    {
        test ob = new test();
        ob.abc(5);
    }
}
