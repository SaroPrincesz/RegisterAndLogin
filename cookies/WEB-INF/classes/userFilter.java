import jakarta.servlet.*;
import java.io.*;
import jakarta.servlet.http.*;

public class userFilter implements Filter{
	 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
					throws IOException, ServletException{
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res= (HttpServletResponse) response;
		
		//Get all Cookies in browser
        Cookie[] cookie = request.getCookies();
		
		if (cookie == null || cookie.length == 0) {
            response.sendRedirect("index.html");
        }
		
		
	}
}