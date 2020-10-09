public class STRING_IMMUTABILITY {
    public static void main(String args[])
    {
        String str = "ABC";
        String str1 = "ABCD";
        if(str1.hashCode() == str.hashCode())
        {
            System.out.print("KIKI " + str1.hashCode()+ " " + str.hashCode());
        }
        else
        {
            System.out.println("BAGA");
        }
        StringBuffer sbf = new StringBuffer("NAVIN");
        System.out.println(sbf.hashCode());
        sbf.append(" REDDY");
        System.out.println(sbf.hashCode());
        str = "LADY";
        System.out.println(str.hashCode()+" "+str);
        str += "GAGA";
        System.out.print(str.hashCode()+" "+str);
    }
}
