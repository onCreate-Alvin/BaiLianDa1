package controller;

import java.lang.reflect.Field;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.client;
import model.product;
import model.producttype;
import model.shop;
import model.user;
import model.vip;
import model.viptype;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.client_service;
import service.product_service;
import service.producttype_service;
import service.shop_service;
import service.user_service;
import service.vip_service;
import service.viptype_service;
import utils.pagemanage;
import utils.tools;



@Controller
@RequestMapping("AllSeach")
public class AllSeach {
	@Resource(name="user_serviceImpl")
	user_service userservice;
	
	@Resource(name="producttype_serviceImpl")
	producttype_service producttypeservice;
	
	@Resource(name="shop_serviceImpl")
	shop_service shopservice;
	
	@Resource(name="vip_serviceImpl")
	vip_service vipservice;
	
	@Resource(name="viptype_serviceImpl")
	viptype_service viptypeservice;
	
	@Resource(name="client_serviceImpl")
	client_service clientservice;
	@Resource(name="product_serviceImpl")
	product_service productservice;
	
	@RequestMapping("client")
	public @ResponseBody List allclientlist(String whereid,HttpServletRequest req){
		List<client> clientlist = clientservice.getall(new pagemanage(whereid,false));
		return clientlist;
	}
	@RequestMapping("viptype")
	public @ResponseBody List allviptypelist(String whereid,HttpServletRequest req){
		List<viptype> viptypelist =  viptypeservice.getall(new pagemanage(whereid,false));
		return viptypelist;
	}
	
	@RequestMapping("vip")
	public @ResponseBody List allviplist(String whereid,HttpServletRequest req){
		
		List<vip> viplist =  vipservice.getall(new pagemanage(whereid,false));
		return viplist;
	}
	@RequestMapping("user")
	public @ResponseBody List alluserlist(String where,HttpServletRequest req){
		List<user> userlist =  userservice.getall(new pagemanage(where,false));
		return userlist;
	}
	
	@RequestMapping("producttype")
	public @ResponseBody List allproducttypelist(String where,HttpServletRequest req){
		List<producttype> producttypelist =  producttypeservice.getall(new pagemanage(where,false));
		return producttypelist;
	}
	@RequestMapping("product")
	public @ResponseBody List allproductlist(String where,HttpServletRequest req){
		List<product> productlist =  productservice.getall(new pagemanage(where,false));
		return productlist;
	}
	
	@RequestMapping("shop")
	public @ResponseBody List allshoplist(String where,HttpServletRequest req){
		List<shop> shoplist =  shopservice.getall(new pagemanage(where,false));
		return shoplist;
	}
	
@RequestMapping("Array")
public @ResponseBody String[] Array(String name){
	try {
		Field f=tools.class.getDeclaredField(name);
		String[][] arr=(String[][]) f.get(null);
		String[] newarr = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newarr[i]=arr[i][1];
		}
		return newarr;
	} catch (Exception e){
		return new String[0];
	}
	
}
	
}
