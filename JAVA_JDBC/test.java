import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Connection;
public class test {
    public static void main(String args[]) //throws SQLException,ClassNotFoundException 
    { 
        try
        {   
            String url = "jdbc:mysql://localhost:3306//mydatabase";
            String uname = "root";
            String pass = "root";
            String q = "SELECT * FROM books";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            rs.next();
            String name = rs.getString("title");
            System.out.println(name);
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
