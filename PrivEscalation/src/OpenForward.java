import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/user/openforward")
public class OpenForward extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String fwd= request.getParameter("fwd");
		System.out.println(fwd);
		
		//to mitigate open forward risk check the fwd parameter and if it belongs to 
		// admin user, use the condition request.isUserInRole("admin") to check authorization
		System.out.println(request.isUserInRole("admin"));
		request.getRequestDispatcher("/WEB-INF/"+fwd).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}
}
