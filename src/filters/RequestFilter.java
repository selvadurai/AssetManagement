package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/RequestFilter")
public class RequestFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RequestFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		  
		  HttpServletRequest req = (HttpServletRequest) request;
          HttpServletResponse res = (HttpServletResponse) response;
	      HttpSession session = req.getSession(false);
	      RequestDispatcher rd=req.getRequestDispatcher("login.jsp");  
	      String username=(String)req.getSession().getAttribute("username");
	     
	      
	   try{    
	         if(username!=null){
		        chain.doFilter(req, res);
	         }else{  
		         rd.include(req, res); 
	         }
	       
	       }catch(NullPointerException e){  
	           rd.include(req, res); 
	       } 
	    }


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
