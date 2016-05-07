package controller;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javax.servlet.http.HttpSession;

import service.AccountService;
import service.AccountServiceService;
import service.AccountTransfer;

/**
 * Servlet implementation class LoginActionController
 */
@WebServlet("/LoginActionController")
public class LoginActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginActionController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		AccountServiceService factory = new AccountServiceService();
		AccountService        service = factory.getAccountServicePort(); 
      		
		AccountTransfer account=service.login( request.getParameter("username"),request.getParameter("password"));
		
		if(account!=null){
			
			//HTTP SESSION INITILAZED
			HttpSession session = request.getSession();
		    session.setAttribute("username",account.getUsername());
		    session.setAttribute("role",account.getRole());
		    
		     String redirectURL = "index.jsp";
		     response.sendRedirect(redirectURL);
		}else{
			 
			 String redirectURL = "login.jsp";
			 response.sendRedirect(redirectURL);
		}
		
		
	}

}
