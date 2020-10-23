import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Calendar;
public class AddServlet extends HttpServlet
{
//	public void service(HttpServletRequest req,HttpServletResponse res)
//	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2")); 
//		int k = i + j;
//		System.out.print("Result is "+k);
//	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String input = req.getParameter("input");

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        engine.eval(input); // Noncompliant		
    }
}
