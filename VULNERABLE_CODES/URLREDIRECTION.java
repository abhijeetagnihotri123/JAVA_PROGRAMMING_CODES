import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Calendar;
public class URLREDIRECTION {
    public static void main(String args[])
    {

    }
    // most of the vulnerabilities listed in the slides mainly belong to javax.servlet class where we deal with apache tomcat server.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String location = req.getParameter("url");
        resp.sendRedirect(location); // Noncompliant solution
    }
}
