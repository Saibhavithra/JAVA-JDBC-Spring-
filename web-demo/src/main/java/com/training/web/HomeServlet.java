package com.training.web;

import java.io.IOException;
import java.sql.SQLException;



//import com.training.web.dao.LoginDao;
import com.training.web.dao.UserDAO;
import com.training.web.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
String msg;
String errmsg;
    public void init() {
    	msg ="Sitaram";
    	errmsg = "error";
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
	//	out.print("<h1>Hello</h1>");
		out.print("<h1>Hello "+msg+"from servlet!</h1>");
		out.print("</body></html>");*/
	/*	request.setAttribute("name",msg);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
		//response.sendRedirect("home.jsp");*/
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
     
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name= request.getParameter("name");
		String password= request.getParameter("password");
		
		UserDAO userDao = new UserDAO();
		
		  try {
			  User user = userDao.checkLogin(name, password);
	           // String destPage = "home.jsp" ;
	             
	            if (user != null) {
	               // HttpSession session = request.getSession();
	                request.setAttribute("user", user);
	               // destPage = "home.jsp";
	                
	                RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		            dispatcher.forward(request, response);
	            	
	            /*	request.setAttribute("name",name);		
	        		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
	        		rd.forward(request, response);*/
	        		
	            }
	            
	            	
	            	else 
	            		
	            	{
	                String message = "Invalid username/password";
	                request.setAttribute("message", message);
	                
	                RequestDispatcher dispatcher = request.getRequestDispatcher("test.jsp");
		            dispatcher.forward(request, response);
	            	
	            }
	            		
	            	/*{request.setAttribute("output",errmsg);
	    			RequestDispatcher rd = request.getRequestDispatcher("test.jsp");
	    			rd.forward(request, response);}*/
	            
		/*if ( username.equals("sai")  && password .equals( "1234"))
		{request.setAttribute("name",username);		
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);}
		else 
			{request.setAttribute("output",errmsg);
			RequestDispatcher rd = request.getRequestDispatcher("test.jsp");
			rd.forward(request, response);}
		
		
	}*/
	            
	            
	         /*   RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
	            dispatcher.forward(request, response);*/
	             
	        } catch (SQLException | ClassNotFoundException ex) {
	            throw new ServletException(ex);
	        }

}
}