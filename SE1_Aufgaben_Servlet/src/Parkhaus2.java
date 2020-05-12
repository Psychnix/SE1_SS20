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
///**/import java.util.Scanner;
///**/import java.util.regex.Pattern;
/*### END Imports ###*/

/*### BEGIN Classes ###*/
	@WebServlet("/Parkhaus2")
	public class Parkhaus2 extends HttpServlet {	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	/*### BEGIN Variables ###*/	
	private double sum = 0;
	private int numberOfCars = 0;
	private int parkingTime = 0;
	/*### BEGIN Variables ###*/
	
		
	/*### BEGIN Methods ###*/
				
	
	    /* doPost BEGIN */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String body = getBody(request);
			String[] splitbody = body.split(",");
			
			
			//raise sum cents
			if(splitbody[0].equals("leave"))
			{
				sum = sum+Double.valueOf(splitbody[4]);
				parkingTime += Integer.valueOf(splitbody[3]);
			} else if (splitbody[0].equals("enter")) {
				numberOfCars = Integer.valueOf(splitbody[1]);
			}
			System.out.println(body);
			System.out.println(sum);
			System.out.println(numberOfCars);

		}
		/* doPost END */
		
	    /* doGet BEGIN */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String requestParamString = request.getQueryString();
	        //PrintWriter out = response.getWriter();
	        //out.println("Hallo" + " " + request.getQueryString());
	        //System.out.println("Hello" + " " + request.getQueryString());
	        	        
	        if("cmd=Summe".equals(requestParamString)) {
	        	response.setContentType("text/html");
	        	PrintWriter out = response.getWriter();
	        	out.println(sum);
	        } 
	        else if("cmd=Durchschnitt".equals(requestParamString))
	        {
	        	response.setContentType("text/html");
	        	PrintWriter out = response.getWriter();
	        	out.println(sum/numberOfCars);
	        }
	        else if("cmd=Durchschnittliche_Parkzeit".equals(requestParamString))
	        {
	        	response.setContentType("text/html");
	        	PrintWriter out = response.getWriter();
	        	out.println(parkingTime/numberOfCars);
	        }
	        else {
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