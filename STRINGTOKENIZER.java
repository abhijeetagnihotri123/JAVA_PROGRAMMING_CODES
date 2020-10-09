public class STRINGTOKENIZER {
    public static void main(String args[])
    {
        String str = "Navin,Mahesh,Rahul,Vijay";
        String names[] = str.split(",");
        for(String x : names)
        {
            System.out.println(x);
        }
    }   
}
