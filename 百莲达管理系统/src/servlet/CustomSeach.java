package servlet;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SeachObject;

public class CustomSeach extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name=req.getParameter("name");
		if(name.length()==0){
			ResponseInfo.cancel(0, resp) ;
			System.out.println("我走这里了");
			return ;
		}
		if(name.equals("all")){
			req.setAttribute("name",req.getParameter("cmd"));
			req.getRequestDispatcher("SeachFramework/seach.jsp").include(req, resp);
			return;
		}
		if(name.equals("sql")){
			tosql(req,resp);
			return;
		}
		File f = new File(req.getRealPath("../")+"\\Seach");
		if(!f.exists())f.mkdir();
		String path=req.getRealPath("../")+"\\Seach\\"+name;
		if(!new File(path).exists()){
			f = new File(req.getRealPath("")+"\\SeachFramework\\"+name);
			if(f.exists()) servlet.FileManager.copyFile(f.getAbsolutePath(), path);
		}
		ResponseInfo.send(1, servlet.FileManager.loadFile(path), resp);
		
	}
	
	private void tosql(HttpServletRequest req, HttpServletResponse resp){
		Vector<SeachObject> list=new Vector<SeachObject>();
		int count=Integer.valueOf(req.getParameter("count"));
		StringBuilder str = new StringBuilder("{\"sql\":\"");
		for(int a=0;a<count;a++){
			SeachObject b=new SeachObject(a, req.getParameter("col"+a),Integer.valueOf(req.getParameter("type"+a)), Integer.valueOf(req.getParameter("math"+a)), req.getParameter("value"+a), req.getParameter("valuea"+a), Integer.valueOf(req.getParameter("andor"+a)));
			if(b.check()){
				str.append(b.getWhere(a==count-1?false:true));
			}
		}
		str.append("\"}");
		String s=str.toString().replace("%", "%");
		System.out.println("sql:    "+s);
		resp.setCharacterEncoding("utf-8");
		try {
			resp.getWriter().write(s);
		} catch (IOException e) {
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
