/*### BEGIN Imports ###*/	
/**/import javax.servlet.annotation.WebServlet;
/**/import javax.servlet.http.HttpServlet;
/**/import javax.servlet.http.HttpServletRequest;
/**/import javax.servlet.http.HttpServletResponse;
/**/import java.io.IOException;
/**/import java.io.PrintWriter;
/*### END Imports ###*/

/*### BEGIN Classes ###*/
	@WebServlet("/DemoServlet2")
	public class DemoServlet2 extends HttpServlet {
	/*### BEGIN Methods ###*/
		
	    /* doGet BEGIN */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("Hallo" + " " + request.getQueryString());
	        System.out.println("Hello" + " " + request.getQueryString());
		}
		/* doGet END */
		
	/*### End Methods ###*/
	}
/*### BEGIN Classes ###*/