/*### BEGIN Imports ###*/	
/**/import javax.servlet.ServletException;
/**/import javax.servlet.annotation.WebServlet;
/**/import javax.servlet.http.HttpServlet;
/**/import javax.servlet.http.HttpServletRequest;
/**/import javax.servlet.http.HttpServletResponse;
/**/import java.io.BufferedReader;
/**/import java.io.IOException;
/**/import java.io.InputStream;
/**/import java.io.InputStreamReader;
/**/import java.io.PrintWriter;
/**/import java.util.Scanner;
import java.util.regex.Pattern;
/*### END Imports ###*/

/*### BEGIN Classes ###*/
	@WebServlet("/Parkhaus")
	public class Parkhaus extends HttpServlet {
	
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	/*### BEGIN Variables ###*/	
	double sum = 0;
	/*### BEGIN Variables ###*/
	
		
	/*### BEGIN Methods ###*/
				
	
	    /* doPost BEGIN */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String body = getBody(request);
			System.out.println(body);

			//Scanner sc = new Scanner(System.in).useDelimiter("");
			String[] requestParamString = new String[100];
			requestParamString = request.getQueryString().split(",");
			String command = requestParamString[0];
			//String nr = requestParamString[1];
			//String enter = requestParamString[2];
			//String leave = requestParamString[3];
			//String period = requestParamString[4];
			//String ticket = requestParamString[5];
			String price;
			
			if("leave".equals(command)) {
				//Pattern p = Pattern.compile("\S*\p{,}");
				Scanner sc = new Scanner(System.in).useDelimiter("s+,s+,s+,s+,s+,s+,s+,s+");
				for(int i=0; i<6; i++) {
					sc.next();
					System.out.println("i = " + i);
				}
				price = sc.next();
				sc.close();
			} else {
				price = "0.0";
			}
			
			response.setContentType("text/html");
						
			if("leave".equals(command)) {
				sum += Double.parseDouble(price);

	        } else {
	        	System.out.println("Invalid Command:" + request.getQueryString());
	        }
			
			if("cmd=Summe".equals(requestParamString)) {
				
	        } else {
	        	System.out.println("Invalid Command:" + request.getQueryString());
	        }
			
		}
		/* doPost END */
		
	    /* doGet BEGIN */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String requestParamString = request.getQueryString();
			response.setContentType("text/html");
	        //PrintWriter out = response.getWriter();
	        //out.println("Hallo" + " " + request.getQueryString());
	        //System.out.println("Hello" + " " + request.getQueryString());
	        	        
	        if("cmd=Summe".equals(requestParamString)) {
	        	response.setContentType("text/html");
	        	PrintWriter out = response.getWriter();
	        	out.println("<style>" + " body{background-color:chocolate;}" + " </style>");
	        	out.println("<h1>Summe=");
	        	out.println(sum + "</h1>");
	        } else {
	        	System.out.println("Invalid Command:" + request.getQueryString());
	        }    
		}
		/* doGet END */
				
		/* getBody BEGIN */
		private static String getBody(HttpServletRequest request) throws IOException{
			StringBuilder stringBuilder = new StringBuilder();
			BufferedReader bufferedReader = null;
			
			try {
				InputStream inputStream = request.getInputStream();
				if(inputStream != null) {
					bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
					char[] charBuffer = new char[128];
					int bytesRead = -1;
					while((bytesRead = bufferedReader.read(charBuffer)) > 0) {
						stringBuilder.append(charBuffer, 0, bytesRead);
					}
				} else {
					stringBuilder.append("");
				}					
			} finally {
				if(bufferedReader != null) {
					bufferedReader.close();
				}
			}
			return stringBuilder.toString();
		}
		/* getBody END */
		
	/*### End Methods ###*/
	}
/*### BEGIN Classes ###*/