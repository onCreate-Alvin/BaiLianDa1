package controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.shop;
import model.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.shop_service;
import service.user_service;
import utils.Jsonstatus;
import utils.MD5Util;
import utils.autoCreate;
import utils.pagemanage;
import utils.tools;

@Controller
@RequestMapping("user")
public class user_controller extends Basic_controller<user> {
	@Resource(name="user_serviceImpl")
	user_service service;
	
	@Resource(name="shop_serviceImpl")
	shop_service shopservice;
	
	@RequestMapping("sexlist")
	public @ResponseBody String[][] sexlist(pagemanage info,HttpServletRequest req){
		return tools.sexnames;
	}
	@RequestMapping("statuslist")
	public @ResponseBody String[][] statuslist(pagemanage info,HttpServletRequest req){
		return tools.operatorstatus;
	}
	
	@RequestMapping("shoplist")
	public @ResponseBody List shoplist(pagemanage info,HttpServletRequest req){
		List<shop> shoplist =  shopservice.getall(new pagemanage(false));
		
		return shoplist;
	}
	
	@Override
	public Jsonstatus insert(HttpServletRequest req, user b) {
		b.setPass(MD5Util.MD5("123"));
		b.setCreatedate(autoCreate.Now());
		b.setUserid(1);
		b.setFright("111111111111");
		return super.insert(req, b);
	}
	@Override
	public Jsonstatus update(HttpServletRequest req, user b) {
		// TODO Auto-generated method stub
		b.setFright("111111111111");
		return super.update(req, b);
	}
	
	@RequestMapping("login")
	public @ResponseBody Jsonstatus login(String account,String code,String pass,boolean isremember,HttpServletRequest req){
		//先判断验证码 返回 0 判断用户是否存在 -1  判断密码是否正确 返回-2 正常返回1
		System.out.println(isremember+","+account+","+MD5Util.MD5(pass)+","+code);
		String sessioncode = req.getSession().getAttribute("randomCode").toString();
		if(!code.equalsIgnoreCase(sessioncode))return new Jsonstatus(0);
		if(service.getByCode(account)==null){
			return new Jsonstatus(-1);
		}else{
			user u = service.getByCode(account);
			if(!(u.getPass().equals(MD5Util.MD5(pass)))){
				return new Jsonstatus(-2);
			}else{
				req.getSession().setAttribute("userinfo", u);
			}
		}
		return new Jsonstatus(1) ;
	}
	@RequestMapping("logininfo")
	public @ResponseBody user logininfo(HttpServletRequest req){
		user u = (user) req.getSession().getAttribute("userinfo");
		return u;
	}
	
	@RequestMapping("updatePWD")
	public @ResponseBody Jsonstatus updatePWD(String oldpass,String newpass,String newpass1,HttpServletRequest req){
		user u = (user) req.getSession().getAttribute("userinfo");
		if(!(newpass.equals(newpass1))||!(u.getPass().equals(MD5Util.MD5(oldpass))))return new Jsonstatus(0);
		user user = new user(u.getId(), MD5Util.MD5(newpass));
		System.out.println("dfa");
		return new Jsonstatus(1);
	}
	
}
