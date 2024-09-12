import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/profile")
public class Profile extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
				
		response.setContentType("text/html");
//Got a Registered User Details
		HashMap<String, String> userDetail = Register.getDetails();
//Get all Cookies in browser
        Cookie[] cookie = request.getCookies();
		
        if (cookie == null || cookie.length == 0) {
            response.sendRedirect("index.html");
        } else {
            PrintWriter out = response.getWriter();
				if(userDetail.get("password").equals(cookie[0].getValue())){
					out.println("<html>");
					out.println("<head>");
					out.println("<link rel=\"stylesheet\" href=\"style.css\" />");
					out.println("</head>");
					out.println("<body>");
					out.println("<section id=\"main\">");
					out.println("<div id=\"header\">");
					//out.println("<button class=\"btn\" onclick=\"RedirectSignin()\">SIGNIN</button>");
					out.println("<button class=\"btn\" onclick=\"RedirectLogout()\">SIGNOUT</button>");
					out.println("</div>");
					out.println("<h3>Name: </h3><p class=\"datas\">"+userDetail.get("name")+"</p><br>");
					out.println("<h3>Gender: </h3><p class=\"datas\">"+userDetail.get("gender")+"</p><br>");
					out.println("<h3>Email: </h3><p class=\"datas\">"+userDetail.get("email")+"</p><br>");
					out.println("<h3>Phone Number: </h3><p class=\"datas\">"+userDetail.get("phoneNo")+"</p><br>");
					out.println("<h3>Address: </h3><p class=\"datas\">"+userDetail.get("address")+"</p><br><br>");
					out.println("</section>");
					out.println("<script src = \"app.js\"></script>");
					out.println("</body>");
					out.println("</html>");
				}else
					response.sendRedirect("index.html");
        }

    }
	
}