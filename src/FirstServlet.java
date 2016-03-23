

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1> Request URI: "+request.getRequestURI()+"</h1>");
		out.println("<h1> Context Path: "+request.getContextPath()+"</h1>");
		out.println("<h1> Servlet Path: "+request.getServletPath()+"</h1>");
		out.println("<h1> Path Info: "+request.getPathInfo()+"</h1>");
		out.println("<h1> Query String: "+request.getQueryString()+"</h1>");
		
		/**
		 * test this url
		 * 
		 * http://localhost:8080/URIDemo/test/test/john/software?uname=scott&password=1234
		 */
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
