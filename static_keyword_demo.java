public class static_keyword_demo {
    int i;
    public static void show()
    {
        System.out.println("INSIDE THE STATIC METHOD");
    }
    public static void main(String args[])
    {   
        static_keyword_demo ob = new static_keyword_demo();
        ob.i = 5; // way to access a non_static_variable inside the static context
        System.out.println(ob.i);
        static_keyword_demo.show();
    }   
}
//static keyword is used to members or objects which is common to all objects