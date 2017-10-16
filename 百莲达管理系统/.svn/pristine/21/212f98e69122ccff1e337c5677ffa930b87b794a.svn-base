package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginfilter implements Filter{

	public void destroy() {
		
	}
	String ex = ".js,css,png,gif,jpg,ttf,icon,woff,";
	String match = "struct/operator/enterlogin,struct/operator/login.jsp,struct/operator/login,struct/operator/logout,/test.jsp,";
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getServletPath();
		String e = url.substring(url.length()-3)+",";
		if(match.indexOf(url+",")>=0||ex.indexOf(e)>=0){
			chain.doFilter(req, resp);
		}else{
				System.out.println(url);
				chain.doFilter(req, resp);
				
		}
	}
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
}
