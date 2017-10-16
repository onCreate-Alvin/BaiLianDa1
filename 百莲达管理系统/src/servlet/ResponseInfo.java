package servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseInfo {
    int status=0;
	private HttpServletResponse res;
	public static void cancel(int status, HttpServletResponse resp) {
		resp.setCharacterEncoding("utf-8");
		try {
			resp.getWriter().write("{\"status\":"+status+"}");
		} catch (IOException e) {
		}
	}
	public static void send(int status,String json, HttpServletResponse resp) {
		resp.setCharacterEncoding("utf-8");
		try {
			if(json.length()>0)
			resp.getWriter().write("{\"status\":"+status+","+json+"}");
			else
				resp.getWriter().write("{\"status\":"+status+"}");
		} catch (IOException e) {
		}
	}
	
	
}
