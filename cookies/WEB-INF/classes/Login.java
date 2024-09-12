import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
//import java.util.UUID;
//import jakarta.servlet.annotation.WebServlet;

//@WebServlet("/userlogin")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
				
        String email = request.getParameter("email");
        String password = request.getParameter("password");
		
		HashMap<String, String> userDetail = Register.getDetails();

		if(userDetail.get("email").equals(email) && userDetail.get("password").equals(password)){
			//UUID uuid = UUID.randomUUID();
			//System.out.println("Random id: " + uuid);
			Register.setCookieValue(password);
			Cookie cookie = new Cookie("cookie", password);
			response.addCookie(cookie);
		//Redirect to PROFILE
			response.sendRedirect("profile");
		}else
		//Redirect to SIGNIN
			response.sendRedirect("index.html");
    }
}
