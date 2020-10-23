import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class CROSSSITESCRIPTING extends HttpServlet
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
}