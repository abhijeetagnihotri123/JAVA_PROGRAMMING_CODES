import java.io.*;
public class INPUT {
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(ob.readLine());
        String str = ob.readLine();
        double d = Double.parseDouble(ob.readLine());
        System.out.println(i+" " + str + " " + d);
    }
}
