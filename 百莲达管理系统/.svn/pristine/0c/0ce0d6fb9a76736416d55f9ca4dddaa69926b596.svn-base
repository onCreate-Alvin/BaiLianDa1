package controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.store_service;
import utils.Jsonstatus;

@Controller
@RequestMapping("store")
public class store_controller extends Basic_controller<store> {
	@Resource(name="store_serviceImpl")
	store_service service;
	
	@RequestMapping("getbyshopid")
	public @ResponseBody List getbyshopid(int shopid,HttpServletRequest req){
		List<store> storelist = service.getByShopId(shopid);
		return storelist;
	}
	@Override
	public Jsonstatus update(HttpServletRequest req, store b) {
		return super.update(req, b);
	}
	
}
