import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.SQLException;
public class SQLINJECTION
{
    public static void main(String args[])
    {
        // nothing to be done this code is just for demonstration purpose
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        PrintWriter out = resp.getWriter();
        out.write("Hello " + name); // Noncompliant
    }
    public boolean authenticate(javax.servlet.http.HttpServletRequest request, java.sql.Connection connection) throws SQLException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        String query = "SELECT * FROM users WHERE 1=1";//"SELECT * FROM users WHERE user = '" + user + "' AND pass = '" + pass + "'"; // Unsafe

        // If the special value "foo' OR 1=1 --" is passed as either the user or pass, authentication is bypassed
        // Indeed, if it is passed as a user, the query becomes:
        // SELECT * FROM users WHERE user = 'foo' OR 1=1 --' AND pass = '...'
        // As '--' is the comment till end of line syntax in SQL, this is equivalent to:
        // SELECT * FROM users WHERE user = 'foo' OR 1=1
        // which is equivalent to:
        //SELECT * FROM users WHERE 1=1  Statement of SQL injection which is mainly highlighted in HTTPSERVLET
        // which is equivalent to:
        // SELECT * FROM users

        java.sql.Statement statement = connection.createStatement();
        java.sql.ResultSet resultSet = statement.executeQuery(query); // Noncompliant
        return resultSet.next();
      }
}