import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import jakarta.servlet.annotation.WebServlet;


public class Register extends HttpServlet{
	
	static HashMap<String, String> details = new HashMap<String, String>();

	public static HashMap<String, String> getDetails(){
		details.put("name","Saro");
		details.put("email","saro@gmail.com");
		details.put("phoneNo","1234567890");
		details.put("gender", "Female");
		details.put("address", "KPR");
		details.put("password", "saro");
		details.put("cookie","");
		return details;
	}
	
	public static void setCookieValue(String str){
		String removeStr = details.remove("cookie");
		details.put("cookie", str);
	}

	
}